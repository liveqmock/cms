package com.liusy.core.dao.impl;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.sql.Types;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.liusy.core.dao.JdbcDao;

public class RsExtractor implements ResultSetExtractor {
   public Object extractData(ResultSet rs) throws SQLException, DataAccessException {
      List<Map<String, String>> list = new ArrayList<Map<String, String>>();
      ResultSetMetaData rsmd = rs.getMetaData();
      int count = rsmd.getColumnCount();
      String[] columnName = new String[count];
      int[] typeName = new int[count];
      for (int k = 0; k < count; k++) {
         columnName[k] = rsmd.getColumnName(k + 1);
         typeName[k] = rsmd.getColumnType(k + 1);
      }

      while (rs.next()) {
         Map<String, String> map = new HashMap<String, String>();
         for (int i = 0; i < count; i++) {
            if (typeName[i] == Types.DATE) {
               SimpleDateFormat format = new SimpleDateFormat(JdbcDao.DATE_FORMAT);
               Date date = rs.getDate(i + 1);
               if (rs.wasNull())
                  map.put(columnName[i], null);
               else {
                  String datestr = format.format(date);
                  map.put(columnName[i], datestr);
               }
            } else if (typeName[i] == Types.TIMESTAMP) {
               SimpleDateFormat format = new SimpleDateFormat(JdbcDao.TIMESTAMP_FORMAT);
               Timestamp stamp = rs.getTimestamp(i + 1);
               if (rs.wasNull())
                  map.put(columnName[i], null);
               else {
                  String datestr = format.format(new Date(stamp.getTime()));
                  map.put(columnName[i], datestr);
               }
            } else if (typeName[i] == Types.TIME) {
               Time itmp = rs.getTime(columnName[i]);
               if (rs.wasNull())
                  map.put(columnName[i], null);
               else {
                  SimpleDateFormat format = new SimpleDateFormat(JdbcDao.TIME_FORMAT);
                  String tstr = format.format(itmp);
                  map.put(columnName[i], tstr);
               }
            } else if (typeName[i] == Types.INTEGER) {
               int itmp = rs.getInt(columnName[i]);
               if (rs.wasNull())
                  map.put(columnName[i], null);
               else {
                  map.put(columnName[i], new Integer(itmp).toString());
               }
            } else if (typeName[i] == Types.BIGINT) {
               long itmp = rs.getLong(columnName[i]);
               if (rs.wasNull())
                  map.put(columnName[i], null);
               else {
                  map.put(columnName[i], new Long(itmp).toString());
               }
            } else if (typeName[i] == Types.DECIMAL || typeName[i] == Types.NUMERIC || typeName[i] == Types.FLOAT) {
               double itmp = rs.getDouble(columnName[i]);
               if (rs.wasNull())
                  map.put(columnName[i], null);
               else {
                  map.put(columnName[i], new Double(itmp).toString());
               }
            } else {
               Object otmp = rs.getObject(columnName[i]);
               if (rs.wasNull())
                  map.put(columnName[i], null);
               else {
                  map.put(columnName[i], otmp.toString());
               }
            }
         }
         list.add(map);
      }
      return list;
   }
}
