package oop.com;

public class Main {
    public static void main(String[] args) {
        Invoice myInvoice = new Invoice("A101", "Ổ cứng SSD 512GB", 2, 150.0);
        System.out.println("Tổng tiền: " + myInvoice.getInvoiceAmount());
    }
}


