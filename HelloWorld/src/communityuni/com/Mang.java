package communityuni.com;
import java.util.ArrayList;
import java.util.Scanner;

public class Mang {
	public static boolean isPrime(int n) {
		if  (n<2) return false;
		for (int i=2; i<= Math.sqrt(n); i++) {
			if ( n % i ==0 ) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int [] M = {3, 6, 7, 8, 11, 17, 2, 90, 2, 5, 4, 5, 8};
		ArrayList<Integer> le =new ArrayList<>();
		ArrayList<Integer> chan =new ArrayList<>();
		ArrayList<Integer> nguyenTo =new ArrayList<>();
		ArrayList<Integer> khongPhaiNT =new ArrayList<>();
		for (int x : M) {
			if (x % 2 !=0) le.add(x);
			else chan.add(x);
			
			if(isPrime(x)) nguyenTo.add(x);
			else khongPhaiNT.add(x);
		}
		System.out.print("Dong 1 (So le)");
		le.forEach(n -> System.out.print(n+""));
		System.out.println("-> Tong cong co" + le.size() + "so le.");
		
		System.out.print("Dong 2 (So chan)");
		chan.forEach(n -> System.out.print(n+""));
		System.out.println("-> Tong cong co" + chan.size() + "so chan.");
		
		System.out.print("Dong 3 (So nguyen to)");
		nguyenTo.forEach(n -> System.out.print(n+""));
		System.out.println("-> Tong cong co" + nguyenTo.size() + "so nguyen to.");
		
		System.out.print("Dong 4 (khong phai so nguyen to)");
		khongPhaiNT.forEach(n -> System.out.print(n+""));
		System.out.println("-> Tong cong co" + khongPhaiNT.size() + "khong phai so nguyen to.");
	}
}
