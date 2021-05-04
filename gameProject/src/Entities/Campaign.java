package Entities;

import Abstract.Entity;

public class Campaign implements Entity {

	private int discountRate;
	private double unitPrice;

	public Campaign(int discountRate, double unitPrice) {
		super();
		this.discountRate = discountRate;
		this.unitPrice = unitPrice;
	}

	public int getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getUnitPriceAfterDiscount() { // Ýndirim
		return this.unitPrice - (this.unitPrice * this.discountRate / 100);
	}
}
