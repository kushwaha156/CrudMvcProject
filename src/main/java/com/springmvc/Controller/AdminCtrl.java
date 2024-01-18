package com.springmvc.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.view.RedirectView;

import com.springmvc.Dao.ProfileDao;
import com.springmvc.Entity.Profile;
import com.springmvc.Service.ProductService;



@Controller
public class AdminCtrl {
	@Autowired
	private ProfileDao profileDao;
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/AdminHome")
	public String adminctrl(Model model) {		
		List<Profile> getList= this.profileDao.getallProduct();
		model.addAttribute("products" ,getList );
		return "adminHome";
	}
	@RequestMapping("/delete/{id}")
	public RedirectView deletetheproduct(@PathVariable("id") int id , HttpServletRequest request) {
		this.profileDao.deleteProduct(id);
		RedirectView rreRedirectView= new RedirectView();
		rreRedirectView.setUrl(request.getContextPath() +"/AdminHome");
				
		return rreRedirectView;	
	}
	
	@RequestMapping("/update/{id}")
	public String updatedetail(@PathVariable("id") int id ,Model model) {
		
		System.out.println(model);
		
		Profile prfile= this.profileDao.getproduct(id); 
		System.out.println("prfile-->>>>>"+prfile);
		model.addAttribute("title", "Update the Product Detail");
		model.addAttribute("product" , prfile);
				
		return "UpdateForm";	
	}
	
	@RequestMapping(path="/updateProduct" , method = RequestMethod.POST)	
	public RedirectView updateProduct(@ModelAttribute Profile profile , HttpServletRequest request) {
		
		System.out.println(profile);
		 this.profileDao.createProduct(profile);
		RedirectView rreRedirectView= new RedirectView();
		rreRedirectView.setUrl(request.getContextPath() +"/AdminHome");
				
		return rreRedirectView;	
	}
	
	@RequestMapping("/admin-Page")
	public String adminpage(Model model) {
		model.addAttribute("title", "Add Product detail");
		System.out.println("admin page open ");
		return "adminPage";
	}
	@RequestMapping(path="/addProduct" , method = RequestMethod.POST)	
	public RedirectView addProduct(@ModelAttribute Profile profile , HttpServletRequest request) {
		 
		if(Profile.isValid(profile)) {
			this.profileDao.createProduct(profile);
		}
		
		RedirectView rreRedirectView= new RedirectView();
		rreRedirectView.setUrl(request.getContextPath() +"/AdminHome");
				
		return rreRedirectView;	
	}
}
