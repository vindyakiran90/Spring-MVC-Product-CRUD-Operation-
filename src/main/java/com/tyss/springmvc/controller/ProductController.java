package com.tyss.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tyss.springmvc.beans.ProductInfoBean;
import com.tyss.springmvc.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService service;

	@GetMapping("/add")
	public String getProductForm() {
		return "addProduct";
	}

	@PostMapping("/added")
	public String submitForm(ProductInfoBean info, ModelMap map) {
		boolean added = service.addProduct(info);
		if(added) {
			return "hello";
		} else {
			return "addProduct";
		}
	}

	@GetMapping("/search")
	public String getSearchForm() {
		return "searchPro";
	}

	@GetMapping("/searchProduct")
	public String getSearchDetails(int productId, ModelMap map) {
		ProductInfoBean bean = service.searchProduct(productId);
		if(bean != null) {
			map.addAttribute("bean", bean);
			return "searched";
		} else {
			return "searchPro";
		}
	}

	@GetMapping("/productList")
	public String getAll() {
		return "allDetails";
	}

	@GetMapping("/allDetailsOfProduct")
	public String getAllEmployee(ModelMap map) {
		List<ProductInfoBean> list = service.getAllProducts();
		map.addAttribute("list", list);
		if(list != null) {
			return "allDetailsOfProduct";
		} else {
			return "No data found";
		}
	}

	@GetMapping("/delete")
	public String delete() {
		return "deletePro";
	}

	@GetMapping("/deletePro")
	public String deleteEmp(int productId, ModelMap map) {
		boolean deleted = service.deleteProduct(productId);
		if(deleted) {
			map.addAttribute("hello", "Record deleted");
			return "hello";
		} else {
			return "deletePro";
		}
	}
	
	@GetMapping("/update")
	public String update() {
		return "updatePro";
	}
	
	@GetMapping("/updatePro")
	public String updateEmp(ProductInfoBean info, int productId, ModelMap map) {
		boolean updated = service.updateProduct(info, productId);
		if(updated) {
			map.addAttribute("hello", "Record updated");
			return "hello";
		} else {
			return "updatePro";
		}
		
	}

}
