package com.springmvc.Dao;


import java.util.List;

import javax.transaction.Transactional;

import org.apache.taglibs.standard.lang.jstl.test.beans.PublicBean1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.springmvc.Entity.Profile;

@Repository
public class ProfileDao {
	@Autowired
	public HibernateTemplate hibernateTemplate;
	
	
	@Transactional
	public void createProduct(Profile profile) {
		  this.hibernateTemplate.saveOrUpdate(profile);
	
	}
	
	

	public Profile getproduct(int id) {
		Profile profile = this.hibernateTemplate.get(Profile.class, id);
		return profile;
	}
	
	public List<Profile> getallProduct() {
		List<Profile> Profiles = this.hibernateTemplate.loadAll(Profile.class);
		return Profiles;
	}
	
	@Transactional
	public void deleteProduct(int id) {
		Profile profile = this.hibernateTemplate.get(Profile.class, id);
		this.hibernateTemplate.delete(profile);
	}
	
	@Transactional
	public void updatetproduct(Profile profile) {
		this.hibernateTemplate.update(profile);
	}
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
}
