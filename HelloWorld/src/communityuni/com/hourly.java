package communityuni.com;

public class hourly extends employee {
    private int hoursWorked;

    // Constructor
    public hourly(String name, String address, String phone, String ssn, double rate) {
        super(name, address, phone, ssn, rate);
        
        hoursWorked = 0;
    }

    public void addHours(int moreHours) {
        this.hoursWorked += moreHours;
    }

    @Override
    public double pay() {
        double totalPay = payRate * hoursWorked;
        
        hoursWorked = 0;
        
        return totalPay;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSố giờ đã làm: " + hoursWorked;
    }
}