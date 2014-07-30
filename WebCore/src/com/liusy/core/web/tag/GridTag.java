package com.liusy.core.web.tag;

import javax.servlet.ServletRequest;
import javax.servlet.jsp.JspException;

public class GridTag extends BaseTag {
   private static final long serialVersionUID = 1L;

   private Object            pager;

   private String            page;

   private String            form;

   private String            imagePath;

   public int doStartTag() throws JspException {
      return EVAL_BODY_BUFFERED;
   }

   public int doEndTag() throws JspException {
      String fp = this.form + "_" + this.property;

      StringBuffer out = new StringBuffer("<div  id=\"" + id + "_box\" style=\"background-color:white;\"></div>\n");

      ServletRequest req = pageContext.getRequest();
      pager = req.getAttribute(this.property);

      if (pager == null) return EVAL_PAGE;

      generatePager(out, fp);
      // out.append(generateScript(fp).replaceAll("\r\n\\s*|\n\\s*", ""));
      out.append(generateScript(fp));

      TagUtils.write(pageContext, out.toString());
      return EVAL_PAGE;
   }

   private void generatePager(StringBuffer out, String fp) {
      out.append("<table ");

      out.append(" id=\"" + this.id + "_pager\"");

      if (this.width != null) out.append(" width=\"" + this.width + "\"");
      if (this.height != null) out.append(" height=\"" + this.height + "\"");
      if (this.cellPadding != null) out.append(" cellpadding=\"" + this.cellPadding + "\"");
      if (this.cellSpacing != null) out.append(" cellspacing=\"" + this.cellSpacing + "\"");
      if (this.styleClass != null) out.append(" class=\"" + this.styleClass + "\"");
      else out.append(" class=\"pageTurn\"");
      if (this.disabled != null && this.disabled.equalsIgnoreCase("true")) out.append(" disabled ");

      out.append(" >\n");
      out.append("   <tr>\n");
      if (page != null && page.equalsIgnoreCase("false")) {
         out.append("      <td align=\"left\" width=\"100%\" >\n");
         out.append("         <span  id=\"" + this.id + "_span\">&nbsp;共&nbsp;<b id=\"" + id + "_rc\"></b>&nbsp;条&nbsp;&nbsp;");
         out.append("      </td>\n");
      }
      else {
         out.append("      <td align=\"left\" width=\"70%\" >\n");
         out.append("         <span  id=\"" + this.id + "_span\">&nbsp;共&nbsp;<b id=\"" + id + "_rc\"></b>&nbsp;条&nbsp;&nbsp;");
         out.append("第&nbsp;<b id=\"" + id + "_pn\"></b>&nbsp;页/共&nbsp;<b id=\"" + id + "_pc\"></b>&nbsp;页&nbsp;</span>");

         out.append("&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"text\" onKeyPress=\"change" + id + "PageSize()\"");
         out.append(" value=\"" + getProperty(pager, "pageSize") + "\" name=\"" + property + ".pageSize\" maxlength=\"3\" id=\"" + fp
               + "_pageSize\" style=\"width:25px;\"/>\n");
         out.append("条/页\n");
         out.append("      </td>\n");
         out.append("      <td align=\"right\" width=\"30%\" >\n");
         out.append("         <div class=\"pageTurnWrap\">\n");

         out.append("            <span id=\"" + id + "_firstPage\"  onClick=\"go" + id
               + "FirstPage()\" class=\"greyleftPageMore\" title=\"第一页\" >&nbsp;</span>\n");
         out.append("            <span id=\"" + id + "_perviousPage\" onClick=\"go" + id
               + "PreviousPage()\" class=\"greyleftPage\" title=\"上一页\" >&nbsp;</span>\n");
         out.append("            <span id=\"" + id + "_nextPage\" onClick=\"go" + id
               + "NextPage()\" class=\"greyrightPage\" title=\"下一页\" >&nbsp;</span>\n");
         out.append("            <span id=\"" + id + "_lastPage\" onClick=\"go" + id
               + "LastPage()\" class=\"greyrightPageMore\" title=\"最后一页\" >&nbsp;</span>\n");
         out.append("         </div>\n");
         out.append("      </td>\n");
      }
      out.append("   </tr>\n");
      out.append("</table>\n");
   }

   private String generateScript(String fp) {
      StringBuffer out = new StringBuffer("<script type=\"text/javascript\">\n");
      String sp = this.bodyContent.getString();
      sp = sp.replaceFirst("grid", id + "_grid");
      sp = sp.replaceFirst("dhtmlXGridObject\\(\\)", "dhtmlXGridObject\\('" + id + "_box'\\)");
      sp = sp.replaceFirst("gridSort", "grid" + id + "Sort");

      sp = sp.replaceAll("headAlign", id + "headAlign");
      sp = sp.replaceAll("grid\\.", id + "_grid\\.");
      sp += "\n   var gDiv=$$('" + id + "_box');";
      out.append(sp);
      out.append("\n\n");
      out.append("   function grid" + id + "Sort(sort){\n");
      out.append("      var o = $$('" + fp + "_order');\n");
      out.append("      var od = $$('" + fp + "_orderDirection');\n");
      out.append("      var pn = $$('" + fp + "_pageNumber');\n");
      out.append("      var sorts=sort.split(',');\n");
      out.append("      " + id + "_grid.attachEvent('onBeforeSorting', function(ind,type,direction){\n");
      out.append("         if(sorts[ind]=='false') return;\n");
      out.append("         if(o.value == ind) {\n");
      out.append("            if(od.value=='asc') od.value='desc'; else od.value='asc';\n");
      out.append("         } else {\n");
      out.append("            o.value = ind;od.value='asc';\n         }\n");
      out.append("         pn.value='1';\n");
      out.append("         go" + id + "GridSearch();\n");
      out.append("      });\n   }\n");

      if (page != null && page.equalsIgnoreCase("false")) {
         out.append("\n   function go" + id + "GridSearch(act){");
         out.append("\n      var url;\n      if(act==null) url = hyperlink + '?action=page'; else url = hyperlink + act;");
         out.append("\n      var data=ajaxSubmit(fulllink+url,'" + form + "');");
         out.append("\n      if(data.exit>0){\n         alert(data.message); return;");
         out.append("\n      }else {");
         out.append("\n          " + id + "_grid.clearAll(); " + id + "_grid.parse(data,'json'); " + id + "_grid.checkAll(false);");
         out.append("\n          var rc = $$('" + fp + "_recordCount');rc.value=data.rc;");
         out.append("\n          if(isIE()) {");
         out.append("\n             $$('" + id + "_rc').innerText=data.rc;");
         out.append("\n          } else {");
         out.append("\n             $$('" + id + "_rc').textContent=data.rc;");
         out.append("\n          }\n");
      }
      else {
         out.append("\n   function go" + id + "FirstPage(){");
         out.append("\n       var rc = $$('" + fp + "_recordCount');\n       if(rc.value == 0) return;");
         out.append("\n       var pn = $$('" + fp + "_pageNumber');");
         out.append("\n       pn.value = '1';\n       go" + id + "GridSearch();\n   }\n");

         out.append("\n   function go" + id + "PreviousPage(){");
         out.append("\n       var rc = $$('" + fp + "_recordCount');\n       if(rc.value == 0) return;");
         out.append("\n       var pn = $$('" + fp + "_pageNumber');");
         out.append("\n       var itmp=new Number(pn.value);\n       pn.value=new String(itmp-1);\n       go" + id + "GridSearch();\n   }\n");

         out.append("\n   function go" + id + "NextPage(){");
         out.append("\n       var rc = $$('" + fp + "_recordCount');\n       if(rc.value == 0) return;");
         out.append("\n       var pn = $$('" + fp + "_pageNumber');");
         out.append("\n       var itmp=new Number(pn.value);\n       pn.value=new String(itmp+1);\n       go" + id + "GridSearch();\n   }\n");

         out.append("\n   function go" + id + "LastPage(){");
         out.append("\n       var rc = $$('" + fp + "_recordCount');\n       if(rc.value == 0) return;");
         out.append("\n       var pn = $$('" + fp + "_pageNumber');");
         out.append("\n       var pc = $$('" + fp + "_pageCount');");
         out.append("\n       pn.value = pc.value;\n       go" + id + "GridSearch();\n   }\n");

         out.append("\n   function change" + id + "PageSize(){");
         out.append("\n      if(event.keyCode == 13) go" + id + "GridSearch();\n   }\n");

         out.append("\n   function go" + id + "GridSearch(act){");
         out.append("\n      var ps = $$('" + fp + "_pageSize');");
         out.append("\n      if(ps!=null) {");
         out.append("\n         if(!checkNumeric(ps,'[每页记录数]',false,true)) return false;\n      }");
         out.append("\n      if(ps.value=='0') ps.value='10';\n");

         out.append("\n      var url;\n      if(act==null) url = hyperlink + '?action=page'; else url = hyperlink + act;");
         out.append("\n      var data=ajaxSubmit(fulllink+url,'" + form + "');");
         out.append("\n      if(data.exit>0){\n         alert(data.message); return;");
         out.append("\n      }else {");
         out.append("\n          " + id + "_grid.clearAll(); " + id + "_grid.parse(data,'json'); " + id + "_grid.checkAll(false);");
         out.append("\n          var rc = $$('" + fp + "_recordCount');rc.value=data.rc;");
         out.append("\n          var pn = $$('" + fp + "_pageNumber');pn.value=data.pn;");
         out.append("\n          var pc = $$('" + fp + "_pageCount');pc.value=data.pc;");
         out.append("\n          if(isIE()) {");
         out.append("\n             $$('" + id + "_rc').innerText=data.rc;");
         out.append("\n             $$('" + id + "_pc').innerText=data.pc;");
         out.append("\n             $$('" + id + "_pn').innerText=data.pn;");
         out.append("\n          } else {");
         out.append("\n             $$('" + id + "_rc').textContent=data.rc;");
         out.append("\n             $$('" + id + "_pc').textContent=data.pc;");
         out.append("\n             $$('" + id + "_pn').textContent=data.pn;");
         out.append("\n          }\n");
         out.append("\n          if(data.rc==0||data.pc==1){");
         out.append("\n             $$('" + id + "_firstPage').disabled=true;$$('" + id + "_firstPage').className='greyleftPageMore';");
         out.append("\n             $$('" + id + "_perviousPage').disabled=true;$$('" + id + "_perviousPage').className='greyleftPage';");
         out.append("\n             $$('" + id + "_nextPage').disabled=true;$$('" + id + "_nextPage').className='greyrightPage';");
         out.append("\n             $$('" + id + "_lastPage').disabled=true;$$('" + id + "_lastPage').className='greyrightPageMore';");
         out.append("\n          }\n          else if(data.pn==1&&data.pc>1){");
         out.append("\n             $$('" + id + "_firstPage').disabled=true;$$('" + id + "_firstPage').className='greyleftPageMore';");
         out.append("\n             $$('" + id + "_perviousPage').disabled=true;$$('" + id + "_perviousPage').className='greyleftPage';");
         out.append("\n             $$('" + id + "_nextPage').disabled=false;$$('" + id + "_nextPage').className='rightPage';");
         out.append("\n             $$('" + id + "_lastPage').disabled=false;$$('" + id + "_lastPage').className='rightPageMore';");
         out.append("\n          }\n          else if(data.pn==data.pc){");
         out.append("\n             $$('" + id + "_firstPage').disabled=false;$$('" + id + "_firstPage').className='leftPageMore';");
         out.append("\n             $$('" + id + "_perviousPage').disabled=false;$$('" + id + "_perviousPage').className='leftPage';");
         out.append("\n             $$('" + id + "_nextPage').disabled=true;$$('" + id + "_nextPage').className='greyrightPage';");
         out.append("\n             $$('" + id + "_lastPage').disabled=true;$$('" + id + "_lastPage').className='greyrightPageMore';");
         out.append("\n          }\n          else{");
         out.append("\n             $$('" + id + "_firstPage').disabled=false;$$('" + id + "_firstPage').className='leftPageMore';");
         out.append("\n             $$('" + id + "_perviousPage').disabled=false;$$('" + id + "_perviousPage').className='leftPage';");
         out.append("\n             $$('" + id + "_nextPage').disabled=false;$$('" + id + "_nextPage').className='rightPage';");
         out.append("\n             $$('" + id + "_lastPage').disabled=false;$$('" + id + "_lastPage').className='rightPageMore';");
         out.append("\n          }\n");
      }

      out.append("\n          var o = $$('" + fp + "_order');\n          var od = $$('" + fp + "_orderDirection');");
      out.append("\n          if(o.value!='' && od.value!='') " + id + "_grid.setSortImgState(true,o.value,od.value);\n      }\n   }\n");

      out.append("</script>");
      return out.toString();
   }

   public String getForm() {
      return form;
   }

   public void setForm(String form) {
      this.form = form;
   }

   public String getImagePath() {
      return imagePath;
   }

   public void setImagePath(String imagePath) {
      this.imagePath = imagePath;
   }

   public String getPage() {
      return page;
   }

   public void setPage(String page) {
      this.page = page;
   }
}
