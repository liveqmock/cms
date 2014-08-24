package com.liusy.cms.dao.impl;

import org.springframework.stereotype.Repository;

import com.liusy.cms.dao.CatalogDao;
import com.liusy.cms.model.Catalog;
import com.liusy.core.dao.impl.HibernateDaoImpl;

@Repository("catalogDao")
public class CatalogDaoImpl extends HibernateDaoImpl<Catalog>  implements CatalogDao{

}
