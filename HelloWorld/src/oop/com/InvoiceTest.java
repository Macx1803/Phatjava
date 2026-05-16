package oop.com;

import java.util.ArrayList;
import java.util.Scanner;

public class InvoiceTest {
    private ArrayList<Invoice> list = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void inputList() {
        System.out.println("--- Nhập danh sách Invoice ---");
        while (list.size() < 10) {
            System.out.println("Nhập Invoice thứ " + (list.size() + 1) + ":");
            System.out.print("Mã mặt hàng: ");
            String id = sc.nextLine();

            boolean isDuplicate = false;
            for (Invoice inv : list) {
                if (inv.getPartNumber().equalsIgnoreCase(id)) {
                    isDuplicate = true;
                    break;
                }
            }

            if (isDuplicate) {
                System.out.println("Mã này đã tồn tại! Vui lòng nhập mã khác.");
                continue;
            }

            System.out.print("Mô tả: ");
            String desc = sc.nextLine();
            System.out.print("Số lượng: ");
            int qty = Integer.parseInt(sc.nextLine());
            System.out.print("Đơn giá: ");
            double price = Double.parseDouble(sc.nextLine());

            list.add(new Invoice(id, desc, qty, price));
        }
    }

    public void displayList() {
        System.out.printf("%-15s %-25s %-10s %-10s %-15s\n", 
                          "Mã MH", "Mô tả", "SL", "Giá", "Tổng tiền");
        for (Invoice inv : list) {
            System.out.printf("%-15s %-25s %-10d %-10.2f %-15.2f\n", 
                inv.getPartNumber(), inv.getPartDescription(), 
                inv.getQuantity(), inv.getPrice(), inv.getInvoiceAmount());
        }
    }

    public void sortByPartNumber() {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j).getPartNumber().compareTo(list.get(j+1).getPartNumber()) > 0) {
                    Invoice temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                }
            }
        }
        System.out.println("Đã sắp xếp theo Mã mặt hàng!");
    }

    public void findInvoice() {
        System.out.print("Nhập mã cần tìm: ");
        String id = sc.nextLine();
        for (Invoice inv : list) {
            if (inv.getPartNumber().equalsIgnoreCase(id)) {
                System.out.println("Kết quả tìm thấy: " + inv.getPartDescription());
                return;
            }
        }
        System.out.println("Không tìm thấy mã này.");
    }

    public void deleteInvoice() {
        System.out.print("Nhập mã cần xóa: ");
        String id = sc.nextLine();
        if (list.removeIf(inv -> inv.getPartNumber().equalsIgnoreCase(id))) {
            System.out.println("Đã xóa thành công!");
        } else {
            System.out.println("Không tìm thấy mã để xóa.");
        }
    }

    // Giao diện Menu
    public void menu() {
        int choice;
        do {
            System.out.println("\n--- MENU QUẢN LÝ ---");
            System.out.println("1. Nhập 10 Invoice");
            System.out.println("2. Xuất danh sách");
            System.out.println("3. Sắp xếp theo Mã");
            System.out.println("4. Tìm kiếm theo Mã");
            System.out.println("5. Xóa theo Mã");
            System.out.println("0. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1: inputList(); break;
                case 2: displayList(); break;
                case 3: sortByPartNumber(); break;
                case 4: findInvoice(); break;
                case 5: deleteInvoice(); break;
            }
        } while (choice != 0);
    }

    public static void main(String[] args) {
        new InvoiceTest().menu();
    }
}