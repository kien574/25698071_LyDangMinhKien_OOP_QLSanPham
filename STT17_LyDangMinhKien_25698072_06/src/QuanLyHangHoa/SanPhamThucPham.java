package QuanLyHangHoa;

import java.time.LocalDate;

public class SanPhamThucPham extends SanPham{
	private LocalDate ngayHetHan;

	public SanPhamThucPham(String maSanPham, String tenSanPham, LocalDate ngaySanXuat, double giaNhap, int soLuongTon,
			LocalDate ngayHetHan) {
		super(maSanPham, tenSanPham, ngaySanXuat, giaNhap, soLuongTon);
		this.ngayHetHan = ngayHetHan;
	}
	

	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}


	public void setNgayHetHan(LocalDate ngayHetHan) {
		this.ngayHetHan = ngayHetHan;
	}


	@Override
	public boolean giaBan() {
		
		if(this.ngayHetHan <= this.ngaySanXuat) {
			return 0;
		}
		return giaNhap + (giaNhap * 0.1) +_ ngay;
	}


	@Override
	public String toString() {
		return "SanPhamThucPham [ngayHetHan=" + ngayHetHan + "]";
	}
	
	

	
	
	
	
}
