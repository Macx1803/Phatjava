package communityuni.com;

import java.util.ArrayList;

public class staff {
    private ArrayList<staffmember> staffList;

    public staff() {
        staffList = new ArrayList<staffmember>();
    }

    public void addMember(staffmember member) {
        staffList.add(member);
    }

    public void payday() {
        for (staffmember member : staffList) {
            System.out.println(member.toString());

            double amount = member.pay();

            if (amount == 0) {
                System.out.println("Cảm ơn bạn đã tình nguyện!");
            } else {
                System.out.printf("Lương thực nhận: $%.2f%n", amount);
            }
            
            System.out.println("---------------------------------------");
        }
    }
}