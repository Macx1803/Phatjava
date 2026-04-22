package communityuni.com; // Lưu ý phải trùng với tên package của bạn

import java.util.Random;
import java.util.Scanner;

public class Bt22thg4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        String answer;

        do {
            int soCuaMay = rd.nextInt(101); 
            int soLanDoan = 0;
            boolean daThang = false;

            System.out.println("\n--- CHÀO MỪNG BẠN ĐẾN VỚI GAME ĐOÁN SỐ ---");
            System.out.println("Máy đã chọn một số trong khoảng [0..100]. Bạn có tối đa 7 lần thử!");

            while (soLanDoan < 7) {
                soLanDoan++;
                System.out.print("Lần đoán thứ " + soLanDoan + ", mời bạn nhập số: ");
                int soNguoiChoi = sc.nextInt();

                if (soNguoiChoi == soCuaMay) {
                    System.out.println("Chúc mừng! Bạn đã đoán ĐÚNG số " + soCuaMay + ".");
                    daThang = true;
                    break;
                } else if (soNguoiChoi < soCuaMay) {
                    System.out.println("Sai rồi! Số bạn đoán NHỎ HƠN số của máy.");
                } else {
                    System.out.println("Sai rồi! Số bạn đoán LỚN HƠN số của máy.");
                }

                if (soLanDoan < 7) {
                    System.out.println("Bạn còn " + (7 - soLanDoan) + " lần thử.");
                }
            }

            if (!daThang) {
                System.out.println("Game Over! Bạn đã hết 7 lần đoán. Số của máy là: " + soCuaMay);
            }

            System.out.print("\nBạn có muốn chơi tiếp không? (c/k): ");
            sc.nextLine(); 
            answer = sc.nextLine();

        } while (answer.equalsIgnoreCase("c"));

        System.out.println("Cảm ơn bạn đã chơi game. Hẹn gặp lại!");
        sc.close();
    }
}