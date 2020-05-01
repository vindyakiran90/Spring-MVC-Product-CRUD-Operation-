package com.tyss.springmvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.tyss.springmvc.beans.ProductInfoBean;

@Repository
public class ProductDAOImplementation implements ProductDAO {

	@PersistenceUnit
	private EntityManagerFactory factory;
	
	@Override
	public boolean addProduct(ProductInfoBean info) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(info);
			transaction.commit();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			manager.close();
		}
	}

	@Override
	public ProductInfoBean searchProduct(int productId) {
		EntityManager manager = factory.createEntityManager();
		ProductInfoBean info = manager.find(ProductInfoBean.class, productId);
		manager.close();
		if(info != null) {
			return info;
		} else {
			return null;
		}
	}

	@Override
	public boolean updateProduct(ProductInfoBean info, int productId) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			String jpql = "update ProductInfoBean p set p.productPrice = :productPrice where p.productId = :productId";
			Query query = manager.createQuery(jpql);
			query.setParameter("productPrice", info.getProductPrice());
			query.setParameter("productId", productId);
			query.executeUpdate();
			transaction.commit();
			return true;
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			manager.close();
		}
	}

	@Override
	public boolean deleteProduct(int productId) {
		EntityManager manager = factory.createEntityManager();
		ProductInfoBean productInfoBean = manager.find(ProductInfoBean.class, productId);

		if(productInfoBean != null) {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.remove(productInfoBean);
			transaction.commit();
			manager.close();
			return true;
		}
		return false;
	}

	@Override
	public List<ProductInfoBean> getAllProducts() {
		EntityManager manager = factory.createEntityManager();
		String jpql = "select p from ProductInfoBean p";
		TypedQuery<ProductInfoBean> query = manager.createQuery(jpql, ProductInfoBean.class);
		List<ProductInfoBean> info = query.getResultList();
		manager.close();
		if(info != null) {
			return info;
		} else {
			return null;
		}
	}

}
