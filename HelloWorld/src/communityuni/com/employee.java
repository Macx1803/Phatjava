package communityuni.com;

public class employee extends staffmember {
	protected String socialSecurityNumber;
	protected double payRate;
	
	public employee(String name, String address, String phone, String ssn, double rate) {
		super(name, address, phone);
		this.socialSecurityNumber=ssn;
		this.payRate =rate;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nSSn" + socialSecurityNumber;
	}
	
	@Override
	public double pay() {
		return payRate;
	}
}
