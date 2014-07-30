package com.liusy.core.web;

import java.util.List;
import java.util.Map;

import com.liusy.core.common.Code;

public interface CommonService {
   
   public Map<String, List<Code>> loadCodes();
   
   public void remove(String codeSetName);

   public List<Code> load(String codeSetName);
   
   public String findResourceCode(String url);
}