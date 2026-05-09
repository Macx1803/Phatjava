package communityuni.com;

public class executive extends employee{
	private double bonus;
	
	public executive(String name, String address, String phone,String ssn, double rate) {
		super(name, address, phone, ssn ,rate);
		
		bonus = 0;
	}
	
	public void awardBonus(double execBonus) {
		this.bonus = execBonus;
	}
	
	@Override
	public double pay() {
		double totalPay	= super.pay() + bonus;
		
		bonus = 0;
		return totalPay;
	}

}
