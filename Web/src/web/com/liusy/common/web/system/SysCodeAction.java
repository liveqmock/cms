package com.liusy.common.web.system;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.StrutsStatics;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import com.liusy.common.model.SysCode;
import com.liusy.common.model.SysCodeSet;
import com.liusy.common.service.system.SysCodeService;
import com.liusy.common.service.system.SysCodeSetService;
import com.liusy.core.dao.model.PageQuery;
import com.liusy.core.exception.ServiceException;
import com.liusy.core.util.Const;
import com.liusy.core.util.ConvertUtil;
import com.liusy.core.web.UserSession;
import com.liusy.core.web.action.BaseAction;
import com.liusy.core.web.form.QueryForm;

public class SysCodeAction extends BaseAction {
   private final Log         log = LogFactory.getLog(SysCodeAction.class);
   private String            codesetid;

   private String            ids;
   private String            gridInfo;
   private SysCodeService    sysCodeService;
   private SysCodeSetService sysCodeSetService;

   public String getCodesetid() {
      return codesetid;
   }

   public void setCodesetid(String codesetid) {
      this.codesetid = codesetid;
   }

   public void setIds(String ids) {
      this.ids = ids;
   }

   public String getGridInfo() {
      return gridInfo;
   }

   public void setSysCodeService(SysCodeService sysCodeService) {
      this.sysCodeService = sysCodeService;
   }

   public void setSysCodeSetService(SysCodeSetService sysCodeSetService) {
      this.sysCodeSetService = sysCodeSetService;
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
         else if ("CODELIST".equalsIgnoreCase(action)) forward = searchSysCodeGrid();
         else if (ADD.equalsIgnoreCase(action)) forward = addSysCode();
         else if (SAVE.equalsIgnoreCase(action)) forward = saveSysCode();
         else if (EDIT.equalsIgnoreCase(action)) forward = editSysCode();
         else if (UPDATE.equalsIgnoreCase(action)) forward = updateSysCode();
         else if (DELETE.equalsIgnoreCase(action)) forward = deleteSysCode();
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
         Element root = DocumentHelper.createElement("tree").addAttribute("id", "0");
         Element topNode = root.addElement("item").addAttribute("text", "系统代码").addAttribute("id", "root").addAttribute("open", "1");
         topNode.addAttribute("im0", "icon/code_all.gif").addAttribute("im1", "icon/code_all.gif").addAttribute("im2", "icon/code_all.gif")
               .addAttribute("child", "1");
         topNode.addElement("userdata").addAttribute("name", "name").addText("系统代码");

         List<SysCodeSet> codesets = (List<SysCodeSet>) sysCodeSetService.findAllSysCodeSet();
         List<Map<String, String>> categorys = new ArrayList<Map<String, String>>();
         for (SysCodeSet codeset : codesets) {
            Map<String, String> map = new HashMap<String, String>();
            ConvertUtil.objectToMap(map, codeset);
            categorys.add(map);
         }

         for (Map<String, String> category : categorys) {
            Element item = topNode.addElement("item");
            String id = category.get(SysCodeSet.PROP_ID);
            String text = category.get(SysCodeSet.PROP_CN_NAME);
            item.addAttribute("text", text).addAttribute("id", id);
            item.addAttribute("im0", "icon/code_mod.gif").addAttribute("im1", "icon/code_mod.gif").addAttribute("im2", "icon/code_mod.gif");
            item.addElement("userdata").addAttribute("name", "name").addText(text);
         }

         response.getWriter().write("<?xml version='1.0' encoding='UTF-8' ?>");
         response.getWriter().write(root.asXML());
      }
   }

   private String getCodeTree() throws Exception {
      try {
         List<SysCode> codes = sysCodeService.findTreeCodes(Integer.valueOf(codesetid));
         List<Map<String, Object>> listmap = new ArrayList<Map<String, Object>>();
         if (codes != null) {
            for (SysCode code : codes) {
               Map<String, Object> map = new HashMap<String, Object>();
               map.put("id", code.getId());
               String us = findCodeName(form, "CODE_STATUS", code.getStatus());

               map.put("data", new Object[] { code.getId(), code.getName(), code.getValue(), us, code.getRemark() });
               listmap.add(map);
            }

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

   private String genGridJson(List<SysCode> codes) {
      StringBuffer sb = new StringBuffer("<?xml version=\"1.0\" encoding=\"UTF-8\"?><rows>");
      for (SysCode sc : codes) {
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

   private String searchSysCodeGrid() throws Exception {
      if (log.isDebugEnabled()) log.debug("Entering 'searchSysCodeGrid' method");
      setCode(form, "CODE_STATUS");
      try {
         SysCodeSet scs = sysCodeSetService.findSysCodeSet(Integer.valueOf(codesetid));
         List<SysCode> codes = sysCodeService.findCodeBySetId(Integer.valueOf(codesetid));
         if (scs.getCsType() != null && scs.getCsType().equals("1")) return "CODETREE";
         List<Map<String, Object>> listmap = new ArrayList<Map<String, Object>>();
         if (codes != null) {
            for (SysCode code : codes) {
               Map<String, Object> map = new HashMap<String, Object>();
               map.put("id", code.getId());
               String us = findCodeName(form, "CODE_STATUS", code.getStatus());

               map.put("data", new Object[] { code.getId(), code.getName(), code.getValue(), us, code.getRemark() });
               listmap.add(map);
            }
            JSONArray jsonObject = JSONArray.fromObject(listmap);
            gridInfo = jsonObject.toString();
         }

      } catch (Exception e) {
         e.printStackTrace();
         request.put("errMsg", e.getMessage());
         return ERROR;
      }
      return "CODELIST";
   }

   public String addSysCode() throws Exception {
      if (log.isDebugEnabled()) log.debug("Entering 'addSysCode' method");

      initForm(form, ADD);
      if (codesetid != null && !"".equals(codesetid)) {
         String name = sysCodeSetService.findSysCodeSet(Integer.parseInt(codesetid)).getCnName();
         form.getRecord().put("codesetName", name);
         form.getRecord().put(SysCode.PROP_CS_ID, codesetid);
      }
      else {
         request.put("errMsg", "系统参数错误。");
         return ERROR;
      }
      return ADD;
   }

   public String saveSysCode() throws Exception {
      if (log.isDebugEnabled()) log.debug("Entering 'saveCodeset' method");

      try {
         SysCode sysCode = new SysCode();
         ConvertUtil.mapToObject(sysCode, form.getRecord(), false);
         UserSession user = (UserSession) session.get(Const.SESSION);
         if (currentUser != null) sysCode.setCreatedBy(user.getAccountName());
         sysCode.setCreateDate(new Date());

         sysCodeService.createSysCode(sysCode);
         codesetid = sysCode.getCodeSetId().toString();
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

   public String editSysCode() throws Exception {
      if (log.isDebugEnabled()) log.debug("Entering 'editCodeset' method");

      initForm(form, EDIT);
      SysCode sysCode = (SysCode) sysCodeService.findSysCode(new Integer(ids));
      ConvertUtil.objectToMap(form.getRecord(), sysCode);
      String name = sysCodeSetService.findSysCodeSet(sysCode.getCodeSetId()).getCnName();
      form.getRecord().put("codesetName", name);
      return EDIT;
   }

   public String updateSysCode() throws Exception {
      if (log.isDebugEnabled()) log.debug("Entering 'updateCodeset' method");

      try {

         SysCode sysCode = sysCodeService.findSysCode(new Integer(form.getRecord().get("id")));
         // 遇到异常重新返回编辑页面时codesetName会丢失
         String name = sysCodeSetService.findSysCodeSet(sysCode.getCodeSetId()).getCnName();
         form.getRecord().put("codesetName", name);

         if (sysCode != null) {
            ConvertUtil.mapToObject(sysCode, form.getRecord(), true);
            UserSession user = (UserSession) session.get(Const.SESSION);
            if (user != null) sysCode.setModifiedby(user.getAccountName());
            sysCode.setModifyDate(new Date());
            sysCodeService.updateSysCode(sysCode);
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

   public String deleteSysCode() throws Exception {
      if (log.isDebugEnabled()) log.debug("Entering 'deleteCodeset' method");

      try {
         if (ids != null && ids.trim().length() > 0) {
            sysCodeService.removeSysCodes(parseId(ids.split(",")));
         }
      } catch (Exception e) {
      }
      return searchSysCodeGrid();
   }

   private void initForm(QueryForm queryForm, String action) throws Exception {
       setCode(queryForm, "CODE_STATUS");

      PageQuery query = new PageQuery();
      // query.setSelectParamId("GET_SYSCODESET_PAGE");
      query.getParameters().put("queryString", "");
      query.setPageSize("0");

      if ("ADD".equalsIgnoreCase(action)) {
         queryForm.getRecord().put("status", "1");
      }

      // List<Map<String, String>> codesets =
      // sysCodeService.getSysCodeSetsForTree(query).getRecordSet();
      // if (codesets == null) {
      // codesets = new ArrayList<Map<String, String>>();
      // }
    //  List<SysCodeSet> codesets = (List<SysCodeSet>) sysCodeSetService.findAllSysCodeSet();
     // setCode(queryForm, "codesets", codesets, SysCodeSet.PROP_CN_NAME.toUpperCase(), SysCodeSet.PROP_ID.toUpperCase(), false);
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
