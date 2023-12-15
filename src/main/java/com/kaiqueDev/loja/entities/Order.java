package com.kaiqueDev.loja.entities;

public class Order {

	private Integer code;
	private Double dasic;
	private Double discount;

	public Order() {
	}

	public Order(Integer code, Double dasic, Double discount) {
		super();
		this.code = code;
		this.dasic = dasic;
		this.discount = discount;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Double getDasic() {
		return dasic;
	}

	public void setDasic(Double dasic) {
		this.dasic = dasic;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

}
