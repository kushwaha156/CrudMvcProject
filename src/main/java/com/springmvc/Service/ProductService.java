package com.springmvc.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.Dao.ProfileDao;
import com.springmvc.Entity.Profile;
@Service
public class ProductService {
	@Autowired
	private ProfileDao profileDao;
	
	
	
	public List<Profile> getlistproduct(){
		
		return this.profileDao.getallProduct();
		
	}
}
