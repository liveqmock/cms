package com.liusy.cms.dao.impl;

import org.springframework.stereotype.Repository;

import com.liusy.cms.dao.CatalogItemDao;
import com.liusy.cms.model.CatalogItem;
import com.liusy.core.dao.impl.HibernateDaoImpl;
@Repository("catalogItemDao")
public class CatalogItemDaoImpl extends HibernateDaoImpl<CatalogItem>  implements CatalogItemDao{

}
