package com.mbook.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Orders extends BaseEntity {
	@Column
	String address;
	@Column
	String fullname;
	@Column
	String methodPay;
	@Column
	String numberPhone;
	@Column
	String discount;
	@Column
	Long total;
	@Column
	Long totalMoneyProduct;
	@Column
	int quantity;
	@Column
	int ship;
	
	@OneToOne
	@JoinColumn(name = "cart_id",referencedColumnName = "id")	
	Cart bill;

	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Orders(String address, String fullname, String methodPay, String numberPhone, String discount, Long total,
			Long totalMoneyProduct, int quantity, int ship, Cart bill) {
		super();
		this.address = address;
		this.fullname = fullname;
		this.methodPay = methodPay;
		this.numberPhone = numberPhone;
		this.discount = discount;
		this.total = total;
		this.totalMoneyProduct = totalMoneyProduct;
		this.quantity = quantity;
		this.ship = ship;
		this.bill = bill;
	}

	public String getAddress() {
		return address;
	}

	public String getFullname() {
		return fullname;
	}

	public String getMethodPay() {
		return methodPay;
	}

	public String getNumberPhone() {
		return numberPhone;
	}

	public String getDiscount() {
		return discount;
	}

	public Long getTotal() {
		return total;
	}

	public Long getTotalMoneyProduct() {
		return totalMoneyProduct;
	}

	public int getQuantity() {
		return quantity;
	}

	public int getShip() {
		return ship;
	}

	public Cart getBill() {
		return bill;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public void setMethodPay(String methodPay) {
		this.methodPay = methodPay;
	}

	public void setNumberPhone(String numberPhone) {
		this.numberPhone = numberPhone;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public void setTotalMoneyProduct(Long totalMoneyProduct) {
		this.totalMoneyProduct = totalMoneyProduct;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setShip(int ship) {
		this.ship = ship;
	}

	public void setBill(Cart bill) {
		this.bill = bill;
	}
	
	
}
