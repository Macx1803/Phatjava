package communityuni.com;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demsoam {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Mời bạn nhập chuỗi bất kỳ: ");
        String input = sc.nextLine();
        
        System.out.println("Các số nguyên âm tìm được trong chuỗi là:");
        NegativeNumberInStrings(input);
        
        sc.close();
    }

    /**
     */
    public static void NegativeNumberInStrings(String str) {
        String regex = "-\\d+";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        boolean found = false;
        while (matcher.find()) {
            System.out.println(matcher.group());
            found = true;
        }

        if (!found) {
            System.out.println("Không tìm thấy số nguyên âm nào trong chuỗi bạn vừa nhập.");
        }
    }
}