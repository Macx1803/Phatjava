package communityuni.com;

public class Palindrome{
    public static void main(String[] args) {
        String s = "madam";
        if (Panlyndrome(s)) {
            System.out.println("Chuỗi '" + s + "' là chuỗi panlyndrome.");
        } else {
            System.out.println("Chuỗi '" + s + "' KHÔNG PHẢI là chuỗi panlyndrome.");
        }
    }

    public static boolean Panlyndrome(String s) {
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {

            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}