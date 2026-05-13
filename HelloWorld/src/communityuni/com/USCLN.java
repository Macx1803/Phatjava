package communityuni.com; 
import java.util.Scanner;

public class USCLN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- 1. Tìm Ước số chung lớn nhất ---");
        System.out.print("Nhập số nguyên dương a: ");
        int a = sc.nextInt();
        System.out.print("Nhập số nguyên dương b: ");
        int b = sc.nextInt();
        System.out.println("=> UCLN của " + a + " và " + b + " là: " + timUCLN(a, b));

        System.out.println("\n--- 2. Kiểm tra số hoàn thiện ---");
        System.out.print("Nhập số n: ");
        int nPerfect = sc.nextInt();
        if (isPerfectNumber(nPerfect)) {
            System.out.println("=> " + nPerfect + " là số hoàn thiện.");
        } else {
            System.out.println("=> " + nPerfect + " không phải là số hoàn thiện.");
        }


        System.out.println("\n--- 3. Kiểm tra chữ số toàn chẵn ---");
        System.out.print("Nhập số n: ");
        int nEven = sc.nextInt();
        if (checkAllDigitsEven(nEven)) {
            System.out.println("=> Số " + nEven + " có các chữ số toàn là chữ số chẵn.");
        } else {
            System.out.println("=> Số " + nEven + " có chứa chữ số lẻ.");
        }


        sc.close();
    }


    public static int timUCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static boolean isPerfectNumber(int n) {
        if (n <= 1) return false;
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) sum += i;
        }
        return sum == n;
    }

    public static boolean checkAllDigitsEven(int n) {
        n = Math.abs(n);
        if (n == 0) return true;
        while (n > 0) {
            if ((n % 10) % 2 != 0) return false;
            n /= 10;
        }
        return true;
    }

    public static double calculateS(double x, int n) {
        double s = 0;
        for (int i = 0; i <= n; i++) {
            s += Math.pow(x, 2 * i + 1) / factorial(2 * i + 1);
        }
        return s;
    }

    public static long factorial(int n) {
        long f = 1;
        for (int i = 1; i <= n; i++) f *= i;
        return f;
    }
}