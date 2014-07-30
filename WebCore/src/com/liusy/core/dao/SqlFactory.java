package com.liusy.core.dao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.core.io.Resource;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.context.support.ServletContextResource;
import com.liusy.core.dao.model.Parameters;

import com.liusy.core.dao.model.SqlStatment;

public class SqlFactory implements ServletContextAware {
   private ServletContext servletContext;

   public void setServletContext(ServletContext sc) {
      this.servletContext = sc;
   }

   private Map<String, SqlStatment> sqls;

   private String                   location;

   public String getLocation() {
      return location;
   }

   public void setLocation(String location) {
      this.location = location;
   }

   public SqlStatment getStatment(String key) {
      if (sqls == null) {
         sqls = new HashMap<String, SqlStatment>();
         init();
      }
      return sqls.get(key);
   }

   public String get(String key) {
      if (sqls == null) {
         sqls = new HashMap<String, SqlStatment>();
         init();
      }
      return sqls.get(key).getSql();
   }

   public void init() {
      if (location == null || location.length() == 0) return;

      Document doc;
      SAXReader saxReader = new SAXReader();

      String[] files = location.split(";");
      try {
         for (int i = 0; i < files.length; i++) {
            Resource resource = new ServletContextResource(servletContext, location);
            saxReader.setValidation(false);
            doc = saxReader.read(resource.getFile());
            parse(doc);
         }
      } catch (Exception e) {
      }
   }

   private void parse(Document doc) {
      try {
         Element root = doc.getRootElement();

         for (Iterator iter = root.elementIterator(); iter.hasNext();) {
            Element sqlEle = (Element) iter.next();
            String id = getAttr(sqlEle, "id");
            String cid = getAttr(sqlEle, "countColumn");
            String ord = getAttr(sqlEle, "orderBy");
            String text = sqlEle.getText().trim();
            List paras = sqlEle.elements("parameters");

            SqlStatment ss = new SqlStatment();
            ss.setId(id);
            ss.setSql(text);
            ss.setCountColumn(cid);
            ss.setOrderBy(ord);
            for (int i = 0; i < paras.size(); i++) {
               Element ep = (Element) paras.get(i);
               Parameters p = new Parameters();
               p.setId(getAttr(ep, "id"));
               p.setPrefix(getAttr(ep, "prefix"));
               p.setSuffix(getAttr(ep, "suffix"));
               ss.getParameters().add(p);
            }
            if (!sqls.containsKey(id)) sqls.put(id, ss);
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   private String getAttr(Element el, String attrName) {
      return el.attributeValue(attrName) == null ? "" : el.attributeValue(attrName);
   }
}
