package com.tyss.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.springmvc.beans.ProductInfoBean;
import com.tyss.springmvc.dao.ProductDAO;

@Service
public class ProductServiceImplementation implements ProductService {

	@Autowired
	private ProductDAO dao;
	
	@Override
	public boolean addProduct(ProductInfoBean info) {
		return dao.addProduct(info);
	}

	@Override
	public ProductInfoBean searchProduct(int productId) {
		return dao.searchProduct(productId);
	}

	@Override
	public boolean updateProduct(ProductInfoBean info, int productId) {
		return dao.updateProduct(info, productId);
	}

	@Override
	public boolean deleteProduct(int productId) {
		return dao.deleteProduct(productId);
	}

	@Override
	public List<ProductInfoBean> getAllProducts() {
		return dao.getAllProducts();
	}

}
