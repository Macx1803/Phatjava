package oop.com;

public class Invoice {
	private String partNumber;
	private String partDecription;
	private int quantity;
	private double price;
	
	public Invoice(String partNumber, String partDecription, int quantity, double price) {
		this.partNumber = partNumber;
		this.partDecription =partDecription;
		
		if(quantity >0) {
			this.quantity=quantity;
		}else {
			this.quantity=0;
		}
		
		if(price>0) {
			this.price=price;
		}else {
			price = 0;
		}
	}
	
	public String partNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber =partNumber;
	}
	
	public String partDecription() {
		return partDecription;
	}
	public void setPartDecription(String partDecription) {
		this.partDecription =partDecription;
	}
	
	public int quantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		if(quantity <0) {
			this.quantity=quantity;
		}else {
			this.quantity=0;
		}
	}
	
	public double price() {
		return price;
	}
	public void setPrice(double price) {
		if(price<0) {
			this.price=price;
		}else {
			price = 0;
		}
	}
	public double getInvoiceAmount() {
        return quantity * price;
	}
	
}
	