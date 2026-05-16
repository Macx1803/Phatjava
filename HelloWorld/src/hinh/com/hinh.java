package hinh.com;

public abstract class hinh {
    protected String mau;

    public hinh(String mau) {
        this.mau = mau;
    }

    public abstract double TinhDienTich();
    public abstract double TinhChuVi();

    public String LayThongTin() {
        return "Màu sắc: " + mau;
    }
}