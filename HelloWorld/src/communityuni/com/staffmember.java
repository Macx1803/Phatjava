package communityuni.com;

public abstract class staffmember {
	protected String name;
	protected String address;
	protected String phone;
	
	public staffmember(String name, String address, String phone) {
		this.name=name;
		this.address=address;
		this.phone=phone;
	}
	
	public String toString() {
		return("Name:" + name + "\nAddress: " + address+ "\nPhone: " + phone);
	}
	public abstract double pay();
}
