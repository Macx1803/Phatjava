package communityuni.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        NhanVien[] dsNV = new NhanVien[2];
        
        for (int i = 0; i < 2; i++) {
            System.out.println("Nhập thông tin cho nhân viên thứ " + (i + 1) + ":");
            System.out.print("Nhập họ: ");
            String ho = sc.nextLine();
            System.out.print("Nhập tên: ");
            String ten = sc.nextLine();
            System.out.print("Nhập số sản phẩm: ");
            int soSP = sc.nextInt();
            
            dsNV[i] = new NhanVien(ho, ten, soSP);
        }
        
        System.out.println("\n--- THÔNG TIN LƯƠNG NHÂN VIÊN ---");
        System.out.println("NV1: " + dsNV[0].toString());
        System.out.println("NV2: " + dsNV[1].toString());
        
        System.out.println("\n--- KẾT QUẢ SO SÁNH ---");
        int hieuSoSP = Math.abs(dsNV[0].getSoSP() - dsNV[1].getSoSP());
        
        System.out.print("Cách 1 (Dùng hàm LonHon): ");
        if (dsNV[0].LonHon(dsNV[1])) {
            System.out.println(dsNV[0].getTen() + " làm nhiều hơn " + dsNV[1].getTen() + " " + hieuSoSP + " sản phẩm.");
        } else if (dsNV[1].LonHon(dsNV[0])) {
            System.out.println(dsNV[1].getTen() + " làm nhiều hơn " + dsNV[0].getTen() + " " + hieuSoSP + " sản phẩm.");
        } else {
            System.out.println("Cả hai nhân viên có số sản phẩm bằng nhau.");
        }
        
        System.out.print("Cách 2 (Không dùng hàm LonHon): ");
        if (dsNV[0].getSoSP() > dsNV[1].getSoSP()) {
            System.out.println(dsNV[0].getTen() + " nhiều hơn.");
        } else if (dsNV[0].getSoSP() < dsNV[1].getSoSP()) {
            System.out.println(dsNV[1].getTen() + " nhiều hơn.");
        } else {
            System.out.println("Hai người bằng nhau.");
        }
        
        sc.close();
    }
}