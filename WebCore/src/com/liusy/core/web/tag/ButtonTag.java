package com.liusy.core.web.tag;

import javax.servlet.jsp.JspException;

import com.liusy.core.util.Const;
import com.liusy.core.web.UserSession;

public class ButtonTag extends BaseTag {
   private static final long serialVersionUID = 1L;

   private String            code;

   private String            icon;

   public int doStartTag() throws JspException {
      return EVAL_BODY_BUFFERED;
   }

   public int doEndTag() throws JspException {
      UserSession session = (UserSession) pageContext.getSession().getAttribute(Const.SESSION);
      // 权限检查
      if (this.code != null && !this.code.equals("") && !session.getPrivileges().containsKey(this.code)) return EVAL_PAGE;

      StringBuffer out = new StringBuffer("");

      out.append("<a ");
      if (this.id != null) out.append(" id=\"" + this.id + "\"");

      if (this.name != null) out.append(" name=\"" + this.name + "\"");

//      if (this.code != null) out.append(" code=\"" + this.code + "\"");

      if (this.styleClass != null)
         out.append(" class=\"" + this.styleClass + "\"");
      else out.append(" class=\"btnStyle\"");

      if (this.disabled != null) {
      }

      if (this.onclick != null) out.append(" href=\"javascript:" + this.onclick + ";\"");

      if (this.title != null) out.append(" title=\"" + this.title + "\"");

      out.append(" ><strong>");
      if (this.icon != null) out.append("<span class=\"" + this.icon + "\">&nbsp;</span>");
      out.append(getBodyContent().getString());
      out.append("</strong></a>");

      TagUtils.write(pageContext, out.toString());
      return EVAL_PAGE;
   }

   public void release() {
      super.release();
   }

   public String getCode() {
      return code;
   }

   public void setCode(String code) {
      this.code = code;
   }

   public String getIcon() {
      return icon;
   }

   public void setIcon(String icon) {
      this.icon = icon;
   }
}
