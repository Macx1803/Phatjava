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
	
	public String getPartNumber() {
		return partNumber;
	}
	public void getPartNumber(String partNumber) {
		this.partNumber =partNumber;
	}
	
	public String getPartDescription() {
		return partDecription;
	}
	public void getPartDescription(String partDecription) {
		this.partDecription =partDecription;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void getQuantity(int quantity) {
		if(quantity <0) {
			this.quantity=quantity;
		}else {
			this.quantity=0;
		}
	}
	
	public double getPrice() {
		return price;
	}
	public void getPrice(double price) {
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