package com.tyss.springmvc.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="product")
public class ProductInfoBean {

	@Id
	@Column
	private int productId;
	@Column
	private String productName;
	@Column
	private double productPrice;
	@Column
	private String productDescription;
}
