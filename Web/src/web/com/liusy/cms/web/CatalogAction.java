package com.liusy.cms.web;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.StrutsStatics;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Actions;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.liusy.cms.model.Catalog;
import com.liusy.cms.model.CatalogItem;
import com.liusy.cms.service.CatalogItemService;
import com.liusy.cms.service.CatalogService;
import com.liusy.core.exception.ServiceException;
import com.liusy.core.util.Const;
import com.liusy.core.util.ConvertUtil;
import com.liusy.core.web.UserSession;
import com.liusy.core.web.action.BaseAction;
import com.liusy.core.web.form.QueryForm;
import com.opensymphony.xwork2.ActionContext;

 
@Controller
@Scope("prototype")
@Namespace("/cms")
@Action("catalog")
@ParentPackage("default")
@Results({
		@Result(name = "JSON", type = "json", params = {"ignoreHierarchy","false"}),
		@Result(name = "LIST", location = "/cms/admin/Catalog_list.jsp"),
		@Result(name = "addCatalog", location = "/cms/admin/Catalog_add.jsp"),
		@Result(name = "editCatalog", location = "/cms/admin/Catalog_add.jsp"),
		@Result(name = "addCatalogItem", location = "/cms/admin/CatalogItem_add.jsp"),
		@Result(name = "editCatalogItem", location = "/cms/admin/CatalogItem_add.jsp"),
		@Result(name = "catalogItemList", location = "/cms/admin/CatalogItem_grid.jsp") })
public class CatalogAction extends BaseAction {
   private final Log         log = LogFactory.getLog(CatalogAction.class);
   private String            catalogId;

   private String            ids;
   private String            gridInfo;
   private CatalogItemService    catalogItemService;
   private CatalogService catalogService;
   private File image; //上传的文件
   private String imageFileName; //文件名称
   private String imageContentType; //文件类型

	
public void setImage(File image) {
	this.image = image;
}

public void setImageFileName(String imageFileName) {
	this.imageFileName = imageFileName;
}

public void setImageContentType(String imageContentType) {
	this.imageContentType = imageContentType;
}

	public void setCatalogId(String catalogId) {
		this.catalogId = catalogId;
	}

	public void setIds(String ids) {
      this.ids = ids;
   }

   public String getGridInfo() {
      return gridInfo;
   }

   public void setCatalogItemService(CatalogItemService catalogItemService) {
      this.catalogItemService = catalogItemService;
   }

   public void setCatalogService(CatalogService catalogService) {
      this.catalogService = catalogService;
   }

   
   
   @SuppressWarnings("unchecked")
   public String execute() throws Exception {
      if (log.isDebugEnabled()) log.debug("enter execute...");

      ctx = ActionContext.getContext();
      request = (Map<String, Object>) ctx.get("request");
      session = ctx.getSession();
      currentUser = (UserSession) session.get(Const.SESSION);

      String forward;
      
         HttpServletResponse response = (HttpServletResponse) ctx.get(StrutsStatics.HTTP_RESPONSE);
         response.setHeader("Content-Type", "text/html; charset=UTF-8");
         response.setHeader("Pragma", "no-cache");
         response.setHeader("Cache-Control", "no-cache");
         response.setDateHeader("Expires", 0);

         forward = doExecute();
      return forward;
   }
   
   
   @Override
   public String doExecute() throws Exception {
      String forward = "";
      String action = form.getAction();

      if (action == null) action = LIST;
      if (log.isDebugEnabled()) log.debug("action:" + action);
      try {
         if (LIST.equalsIgnoreCase(action)) forward = LIST;
         else if ("getTree".equalsIgnoreCase(action)) forward = getTreeNode();
         else if ("codeTree".equalsIgnoreCase(action)) forward = getCodeTree();
         else if ("catalogItemList".equalsIgnoreCase(action)) forward = searchCatalogItemGrid();
         else if ("addCatalog".equalsIgnoreCase(action)) forward = addCatalog();
         else if ("addCatalogItem".equalsIgnoreCase(action)) forward = addCatalogItem();
         else if ("saveCatalog".equalsIgnoreCase(action)) forward = saveCatalog();
         else if ("saveCatalogItem".equalsIgnoreCase(action)) forward = saveCatalogItem();
         else if ("editCatalog".equalsIgnoreCase(action)) forward = editCatalog();
         else if ("editCatalogItem".equalsIgnoreCase(action)) forward = editCatalogItem();
         else if ("updateCatalogItem".equalsIgnoreCase(action)) forward = updateCatalogItem();
         else if ("updateCatalog".equalsIgnoreCase(action)) forward = updateCatalog();
         else if ("deleteCatalogItem".equalsIgnoreCase(action)) forward = deleteCatalogItem();
         else if ("deleteCatalog".equalsIgnoreCase(action)) forward = deleteCatalog();
         
      } catch (Exception e) {// 其他系统出错
         e.printStackTrace();
         request.put("errMsg", e.getMessage());
         forward = ERROR;
      }
      return forward;
   }

   private String getTreeNode() throws Exception {
      if (log.isDebugEnabled()) log.debug("Entering 'getTreeNode' mathod");

      try {
         HttpServletResponse response = ServletActionContext.getResponse();
         response.setContentType("text/xml;charset=UTF-8");
         response.setHeader("Cache_Control", "no-cache");

         getCategoryTree(response);

         response.getWriter().close();
      } catch (Exception e) {
         e.printStackTrace();
         request.put("errMsg", e.getMessage());
         return ERROR;
      }
      return null;
   }

   private void getCategoryTree(HttpServletResponse response) throws Exception {

      if (ids == null || "".equalsIgnoreCase(ids)) {


         List<Catalog> codesets = (List<Catalog>) catalogService.findAllCatalog();
         List<Map<String, String>> categorys = new ArrayList<Map<String, String>>();
         
         
         Element root= DocumentHelper.createElement("tree").addAttribute("id", "0");
         Element topNode = null;
         String id=null;
         String text;
         String parentId;
         
         for (Catalog codeset : codesets) {
            Map<String, String> map = new HashMap<String, String>();
            ConvertUtil.objectToMap(map, codeset);
	   
            if(map.get("parentId") == null || "".equalsIgnoreCase(map.get("parentId")))
        	{
	           	 parentId=map.get("parentId");
		    	 id = map.get("id");
		         text = map.get("name");
                topNode = root.addElement("item").addAttribute("text", text).addAttribute("id", id).addAttribute("open", "1");
                topNode.addAttribute("im0", "icon/code_all.gif").addAttribute("im1", "icon/code_all.gif").addAttribute("im2", "icon/code_all.gif")
                      .addAttribute("child", "1");
                topNode.addElement("userdata").addAttribute("name", "name").addText("CMS系统目录");
               
        	}
            categorys.add(map);
         }
         genTree(topNode,categorys,"parentId",id);
         response.getWriter().write("<?xml version='1.0' encoding='UTF-8' ?>");
         response.getWriter().write(root.asXML());
      }
   }
   
   private void genTree(Element topNode,List<Map<String, String>> listMap,String parentIdF,String parentIdV)
   {
       String id;
       String text;
	   for (Map<String, String> map : listMap) {
		if(null!=map.get(parentIdF)&&map.get(parentIdF).equals(parentIdV))
		{
				Element item = topNode.addElement("item");
	            id = map.get("id");
	            text = map.get("name");
	            item.addAttribute("text", text).addAttribute("id", id);
	            item.addAttribute("im0", "icon/code_mod.gif").addAttribute("im1", "icon/code_mod.gif").addAttribute("im2", "icon/code_mod.gif");
	            item.addElement("userdata").addAttribute("name", "name").addText(text);
	            genTree(item,listMap,"parentId",id);
		}
	   }
   }

   private String getCodeTree() throws Exception {
      try {
         List<CatalogItem> codes = catalogItemService.findTreeItems(Integer.valueOf(catalogId));
         List<Map<String, Object>> listmap = new ArrayList<Map<String, Object>>();
         if (codes != null) {
//            for (CatalogItem code : codes) {
//               Map<String, Object> map = new HashMap<String, Object>();
//               map.put("id", code.getId());
//               String us = findCodeName(form, "CODE_STATUS", code.getStatus());
//
//               map.put("data", new Object[] { code.getId(), code.getName(), code.getValue(), us, code.getRemark() });
//               listmap.add(map);
//            }

            String res = genGridJson(codes);
            setResponse(res);
         }
         else setResponse("{}");
      } catch (ServiceException e) {
         setResponse("{}");
      } catch (Exception e) {
         e.printStackTrace();
         setResponse("{}");
      }
      return null;
   }

   private String genGridJson(List<CatalogItem> codes) {
      StringBuffer sb = new StringBuffer("<?xml version=\"1.0\" encoding=\"UTF-8\"?><rows>");
      for (CatalogItem sc : codes) {
         sb.append("<row>");
         
         sb.append("</row>");
      }
      sb.append("</rows>");
      return sb.append("</rows>").toString();
   }

   private void setResponse(String doc) throws Exception {
      HttpServletResponse response = (HttpServletResponse) ctx.get(StrutsStatics.HTTP_RESPONSE);
      response.getWriter().write(doc);
      response.getWriter().close();
   }

   private String searchCatalogItemGrid() throws Exception {
      if (log.isDebugEnabled()) log.debug("Entering 'searchCatalogItemGrid' method");
      setCode(form, "CATALOGITEM_ITEM,CODE_STATUS");
      try {
         List<CatalogItem> codes = catalogItemService.findItemByCatalogId(Integer.valueOf(catalogId));
         //if (scs.getCsType() != null && scs.getCsType().equals("1")) return "CODETREE";
         List<Map<String, Object>> listmap = new ArrayList<Map<String, Object>>();
         if (codes != null) {
            for (CatalogItem code : codes) {
               Map<String, Object> map = new HashMap<String, Object>();
               map.put("id", code.getId());
               String type = findCodeName(form, "CATALOGITEM_ITEM", code.getType());
               String status = findCodeName(form, "CODE_STATUS", code.getStatus());

               map.put("data", new Object[] { code.getId(), code.getSubject(), code.getCreateUser(), code.getCreateTime().toLocaleString(),type, status,code.getRemark() });
               listmap.add(map);
            }
            JSONArray jsonObject = JSONArray.fromObject(listmap);
            gridInfo = jsonObject.toString();
            this.getForm().getQuery().getParameters().put("catalogId", catalogId);
         }

      } catch (Exception e) {
         e.printStackTrace();
         request.put("errMsg", e.getMessage());
         return ERROR;
      }
      return "catalogItemList";
   }
   
	   

   public String addCatalogItem() throws Exception {
      if (log.isDebugEnabled()) log.debug("Entering 'addCatalogItem' method");
      initForm(form, ADD);
      form.getRecord().put("status", "1");
      form.getRecord().put("type", "1");
      form.getRecord().put("catalogId", catalogId);
      return "addCatalogItem";
   }
   
   
   public String addCatalog() throws Exception {
	      if (log.isDebugEnabled()) log.debug("Entering 'addCatalogItem' method");
	      initForm(form, ADD);
	      if (catalogId != null && !"".equals(catalogId)) {
	         String name = catalogService.findCatalog(Integer.parseInt(catalogId)).getName();
	         form.getRecord().put("parentName", name);
	         form.getRecord().put("parentId", catalogId);
	      }
	      else {
	         request.put("errMsg", "系统参数错误。");
	         return ERROR;
	      }
	      return "addCatalog";
	   }
   
   public String saveCatalogItem() throws Exception {
      if (log.isDebugEnabled()) log.debug("Entering 'saveCodeset' method");

      try {
         CatalogItem catalogItem = new CatalogItem();
         ConvertUtil.mapToObject(catalogItem, form.getRecord(), false);
         UserSession user = (UserSession) session.get(Const.SESSION);
         if (currentUser != null) catalogItem.setCreateUser(user.getAccountName());
         catalogItem.setCreateTime(new Date());
       if(null!=image)
       {
         String realpath = ServletActionContext.getServletContext().getRealPath("/cms/images");
        
         //D:\apache-tomcat-6.0.18\webapps\struts2_upload/cms/images
         String imgPath = System.currentTimeMillis()+"/"+imageFileName.substring(imageFileName.indexOf("."));
         System.out.println("realpath: "+realpath);
         if (image != null) {
             File savefile = new File(new File(realpath),imgPath );
             if (!savefile.getParentFile().exists())
                 savefile.getParentFile().mkdirs();
             FileUtils.copyFile(image, savefile);
             addMessage(form, "图片上传成功！");
         }
         catalogItem.setImg(imgPath);
       }
         catalogItemService.createCatalogItem(catalogItem);
         catalogId = catalogItem.getCatalogId().toString();
         return returnForward(RETURN_NORMAL);
      } catch (ServiceException e) {
         addMessage(form, e.getMessage());
         initForm(form, ADD);
         return ADD;
      } catch (Exception e) {
         e.printStackTrace();
         addMessage(form, "保存操作失败!");
         initForm(form, ADD);
         return ADD;
      }
   }

   
   public String saveCatalog() throws Exception {
	      if (log.isDebugEnabled()) log.debug("Entering 'saveCatalog' method");

	      try {
	         Catalog catalog = new Catalog();
	         ConvertUtil.mapToObject(catalog, form.getRecord(), false);

	         catalogService.createCatalog(catalog);
	         catalogId = catalog.getId().toString();
	         
	         return returnForward(RETURN_NORMAL);
	      } catch (ServiceException e) {
	         addMessage(form, e.getMessage());
	         initForm(form, ADD);
	         return "addCatalog";
	      } catch (Exception e) {
	         e.printStackTrace();
	         addMessage(form, "保存操作失败!");
	         initForm(form, ADD);
	         return "addCatalog";
	      }
	   }

   
   
   public String editCatalogItem() throws Exception {
      if (log.isDebugEnabled()) log.debug("Entering 'editCatalogItem' method");

      initForm(form, EDIT);
      CatalogItem catalogItem = (CatalogItem) catalogItemService.findCatalogItem(new Integer(ids));
      ConvertUtil.objectToMap(form.getRecord(), catalogItem);
      return "editCatalogItem";
   }
   
   
   public String editCatalog() throws Exception {
	      if (log.isDebugEnabled()) log.debug("Entering 'editCatalog' method");
	      initForm(form, EDIT);
	      Catalog catalog = (Catalog) catalogService.findCatalog(new Integer(catalogId));
	      if(null!=catalog.getType())
	      form.setItemIds(catalog.getType().split(", "));
	      String name =  catalogService.findCatalog(new Integer(catalog.getParentId())).getName();
	      ConvertUtil.objectToMap(form.getRecord(), catalog);
	      form.getRecord().put("parentName", name);
	      return "editCatalog";
	   }
   
   
   
   public String updateCatalog() throws Exception {
	      if (log.isDebugEnabled()) log.debug("Entering 'updateCatalog' method");
	      try {
		         Catalog catalog = new Catalog();
		         ConvertUtil.mapToObject(catalog, form.getRecord(), false);

		         catalogService.updateCatalog(catalog);
		         return returnForward(RETURN_NORMAL);
	      } catch (ServiceException e) {
	         addMessage(form, e.getMessage());
	         initForm(form, EDIT);
	         return "editCatalog";
	      } catch (Exception e) {
	         e.printStackTrace();
	         addMessage(form, "编辑操作失败");
	         initForm(form, EDIT);
	         return "editCatalog";
	      }
	   }
   

   public String updateCatalogItem() throws Exception {
      if (log.isDebugEnabled()) log.debug("Entering 'updateCatalogItem' method");

      try {

         CatalogItem catalogItem = catalogItemService.findCatalogItem(new Integer(form.getRecord().get("id")));

         if (catalogItem != null) {
            ConvertUtil.mapToObject(catalogItem, form.getRecord(), true);
            UserSession user = (UserSession) session.get(Const.SESSION);
            if (user != null) catalogItem.setUpdateUser(user.getAccountName());
            catalogItem.setUpdateTime(new Date());
            catalogItemService.updateCatalogItem(catalogItem);
            request.put("msg", "修改成功！");

            return returnForward(RETURN_NORMAL);
         }
         else {
            request.put("operstatus", "0");
            addMessage(form, "数据集记录不存在");
            return ERROR;
         }
      } catch (ServiceException e) {
         addMessage(form, e.getMessage());
         initForm(form, EDIT);
         return EDIT;
      } catch (Exception e) {
         e.printStackTrace();
         addMessage(form, "编辑操作失败");
         initForm(form, EDIT);
         return EDIT;
      }
   }
   
   
   public String deleteCatalog() throws Exception {
	      if (log.isDebugEnabled()) log.debug("Entering 'deleteCatalog' method");

	      try {
	         if (catalogId != null && catalogId.trim().length() > 0) {
	            catalogService.removeCatalog(Integer.valueOf(catalogId));
	         }
	         form.setStatus("success");
	      } catch (Exception e) {
	    	  form.setStatus("fail");
	      }
	      return JSON;
	   }
   
   
   public String deleteCatalogItem() throws Exception {
      if (log.isDebugEnabled()) log.debug("Entering 'deleteCodeset' method");

      try {
         if (ids != null && ids.trim().length() > 0) {
            catalogItemService.removeCatalogItems(parseId(ids.split(",")));
         }
         form.setStatus("success");
      } catch (Exception e) {
    	  form.setStatus("fail");
      }
      return JSON;
   }

   private void initForm(QueryForm queryForm, String action) throws Exception {
	   
//	   Code c = new Code();
//	   c.setCodeName("主题");
//	   c.setValue("subject");
//	   Code c1 = new Code();
//	   c1.setCodeName("图片");
//	   c1.setValue("img");
//	   Code c2 = new Code();
//	   c2.setCodeName("富文本");
//	   c2.setValue("ueditor");
//	   List<Code> list = new ArrayList<Code>();
//	   list.add(c);
//	   list.add(c1);
//	   list.add(c2);
//	   setCode(queryForm, "catalogType", list);
	   
	   setCode(queryForm, "CATALOG_TYPE");
	   setCode(queryForm, "CODE_STATUS");
	   setCode(queryForm, "CATALOGITEM_ITEM");
	   
	   if(queryForm.getCodeSets().get("CATALOG_TYPE").size()==4)
	   queryForm.getCodeSets().get("CATALOG_TYPE").remove(0);//删除空值
	   
//
//      PageQuery query = new PageQuery();
//      // query.setSelectParamId("GET_SYSCODESET_PAGE");
//      query.getParameters().put("queryString", "");
//      query.setPageSize("0");
//
//      if ("ADD".equalsIgnoreCase(action)) {
//         queryForm.getRecord().put("status", "1");
//      }
//
//      // List<Map<String, String>> codesets =
//      // catalogItemService.getCatalogsForTree(query).getRecordSet();
//      // if (codesets == null) {
//      // codesets = new ArrayList<Map<String, String>>();
//      // }
//      List<Catalog> codesets = (List<Catalog>) catalogService.findAllCatalog();
//      setCode(queryForm, "codesets", codesets, Catalog.PROP_CN_NAME.toUpperCase(), Catalog.PROP_ID.toUpperCase(), false);
   }

   private java.io.Serializable[] parseId(String[] ids) throws Exception {
      if (ids == null || ids.length == 0) {
         throw new Exception("非法操作！");
      }
      java.io.Serializable id[] = null;
      try {
         id = new Integer[ids.length];
         for (int i = 0; i < ids.length; i++) {
            id[i] = new Integer(ids[i]);
         }
      } catch (Exception e) {
         id = ids;
      }
      return id;
   }

}
