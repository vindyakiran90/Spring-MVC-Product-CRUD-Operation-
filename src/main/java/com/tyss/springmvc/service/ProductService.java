package com.tyss.springmvc.service;

import java.util.List;

import com.tyss.springmvc.beans.ProductInfoBean;

public interface ProductService {
	boolean addProduct(ProductInfoBean info);
	ProductInfoBean searchProduct(int productId);
	boolean updateProduct(ProductInfoBean info, int productId);
	boolean deleteProduct(int productId);
	List<ProductInfoBean> getAllProducts();
}
