package QuanLyHangHoa;

import java.time.LocalDate;

public abstract class SanPham {
	protected String maSanPham;
	protected String tenSanPham;
	protected LocalDate ngaySanXuat;
	protected double giaNhap;
	protected int soLuongTon;
	
	public SanPham(String maSanPham, String tenSanPham, LocalDate ngaySanXuat, double giaNhap, int soLuongTon) {
		this.maSanPham = maSanPham;
		this.tenSanPham = tenSanPham;
		this.ngaySanXuat = ngaySanXuat;
		this.giaNhap = giaNhap;
		this.soLuongTon = soLuongTon;
		
	}
	

	public String getMaSanPham() {
		return maSanPham;
	}

	public void setMaSanPham(String maSanPham) {
		this.maSanPham = maSanPham;
	}

	public String getTenSanPham() {
		return tenSanPham;
	}

	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}

	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}

	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}

	public double getGiaNhap() {
		return giaNhap;
	}

	public void setPrice(double giaNhap) {
		this.giaNhap = giaNhap;
	}

	public int getSoLuongTon() {
		return soLuongTon;
	}

	public void setSoLuongTon(int soLuongTon) {
		this.soLuongTon = soLuongTon;
	}

	

	
	
	@Override
	public String toString() {
		return "SanPham [maSanPham=" + maSanPham + ", tenSanPham=" + tenSanPham + ", ngaySanXuat=" + ngaySanXuat
				+ ", giaNhap=" + giaNhap + ", soLuongTon=" + soLuongTon + "]";
	}


	public abstract boolean giaBan();
	
	
}
