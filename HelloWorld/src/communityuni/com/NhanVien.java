package communityuni.com;
public class NhanVien {
	private String ho;
	private String ten;
	private int soSP;
	
	public NhanVien(String ho, String ten, int soSP) {
		this.ho =ho;
		this.ten=ten;
		if (soSP < 0) {
			this.soSP =0;
		}else {
			this.soSP = soSP;
		}
	}
	
	public String getHo() {
		return ho;	
	}
	public void setHo(String ho) {
		this.ho =ho;
	}
	
	public String getTen() {
		return ten;	
	}
	public void setTen(String ten) {
		this.ten =ten;
	}
	
	public int getSoSP() {
		return soSP;	
	}
	public void setSoSP(int soSP) {
		if(soSP<0) {
			this.soSP = 0;
		}else {
			this.soSP =soSP;
		}
	}
	
	public double getLuong() {
		double donGia;
		if(soSP >=1 && soSP <=199) {
			donGia = 0.5;	
		}else if(soSP >=200 && soSP<=399) {
			donGia =0.55;
		}else if(soSP >=400 && soSP <=599) {
			donGia = 0.6;
		}else if(soSP >=600) {
			donGia =0.65;
		}else {
			donGia =0;
		}
		return this.soSP * donGia;
	}
	public boolean LonHon(NhanVien nv2) {
        return this.soSP > nv2.soSP;
    }

    @Override
    public String toString() {
        return ho + " " + ten + " (Số SP: " + soSP + ", Lương: " + getLuong() + ")";
    }
}
