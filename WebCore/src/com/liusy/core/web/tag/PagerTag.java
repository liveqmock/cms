package com.liusy.core.web.tag;

import javax.servlet.ServletRequest;
import javax.servlet.jsp.JspException;

public class PagerTag extends BaseTag {
   private static final long serialVersionUID = 1L;

   private Object            pager;
   private String            action;

   public String getAction() {
      return action;
   }

   public void setAction(String action) {
      this.action = action;
   }

   public int doStartTag() throws JspException {
      return EVAL_BODY_BUFFERED;
   }

   public int doEndTag() throws JspException {
      StringBuffer out = new StringBuffer("<table ");

      ServletRequest req = pageContext.getRequest();
      pager = req.getAttribute(this.property);

      if (pager == null) return EVAL_PAGE;

      if (this.id != null) out.append(" id=\"" + this.id + "\"");
      else out.append(" id=\"pager\"");

      if (this.width != null) out.append(" width=\"" + this.width + "\"");
      if (this.cellPadding != null) out.append(" cellpadding=\"" + this.cellPadding + "\"");
      if (this.cellSpacing != null) out.append(" cellspacing=\"" + this.cellSpacing + "\"");
      if (this.styleClass != null) out.append(" class=\"" + this.styleClass + "\"");
      else out.append(" class=\"pageTurn\"");

      if (this.disabled != null && this.disabled.equalsIgnoreCase("true")) {
         out.append(" disabled ");
      }
      out.append(" >\n");
      out.append("   <tr>\n");
      out.append("      <td align=\"left\" width=\"70%\" >\n");

      String act = (action == null || "".equals(action)) ? "" : "'"+action+"'";
      int rc = Integer.valueOf(getProperty(pager, "recordCount"));
      if (rc > 0) {
         out.append("         &nbsp;共&nbsp;<b>");
         out.append(getProperty(pager, "recordCount"));
         out.append("</b>&nbsp;条&nbsp;&nbsp;第&nbsp;<b>");
         out.append(getProperty(pager, "pageNumber"));
         out.append("</b>&nbsp;页/共&nbsp;<b>");
         out.append(getProperty(pager, "pageCount"));
         out.append("</b>&nbsp;页&nbsp;&nbsp;&nbsp;&nbsp;");
         out.append("<input type=\"text\" value=\"" + getProperty(pager, "pageSize") + "\"");
         out.append(" onKeyPress=\"setPageSize("+act+")\"");
         out.append(" name=\"" + this.property + ".pageSize\" maxlength=\"3\" id=\"");
         out.append(this.property + "_pageSize\" style=\"width:25px;\"/>\n");
         out.append("条/页\n");
      }
      else {
         out.append("&nbsp;");
      }
      out.append("      </td>\n");
      out.append("      <td align=\"right\" width=\"30%\" >\n");
      out.append("         <div class=\"pageTurnWrap\">\n");

      int pn = Integer.valueOf(getProperty(pager, "pageNumber"));
      int pc = Integer.valueOf(getProperty(pager, "pageCount"));
      if (pn == 1) {
         out.append("            <a href=\"#\" class=\"greyleftPageMore\" title=\"第一页\" >&nbsp;</a>\n");
         out.append("            <a href=\"#\" class=\"greyleftPage\" title=\"上一页\" >&nbsp;</a>\n");
      }
      else {
         out.append("            <a href=\"#\" class=\"leftPageMore\" onClick=\"goFirstPage("+act+")\" title=\"第一页\" >&nbsp;</a>\n");
         out.append("            <a href=\"#\" class=\"leftPage\" onClick=\"goPreviousPage("+act+")\" title=\"上一页\" >&nbsp;</a>\n");
      }
      if (rc == 0 || pn == pc) {
         out.append("            <a href=\"#\" class=\"greyrightPage\" title=\"下一页\" >&nbsp;</a>\n");
         out.append("            <a href=\"#\" class=\"greyrightPageMore\" title=\"最后一页\" >&nbsp;</a>\n");
      }
      else {
         out.append("            <a href=\"#\" class=\"rightPage\" onClick=\"goNextPage("+act+")\" title=\"下一页\" >&nbsp;</a>\n");
         out.append("            <a href=\"#\" class=\"rightPageMore\" onClick=\"goLastPage("+act+")\" title=\"最后一页\" >&nbsp;</a>\n");
      }
      out.append("         </div>\n");
      out.append("      </td>\n");
      out.append("   </tr>\n");
      out.append("</table>\n");

      TagUtils.write(pageContext, out.toString());
      return EVAL_PAGE;
   }
}
