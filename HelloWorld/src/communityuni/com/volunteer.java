package communityuni.com;

public class volunteer extends staffmember {
    public volunteer(String name, String address, String phone) {
        super(name, address, phone);
    }

    @Override
    public double pay() {
        return 0.0;
    }
}
