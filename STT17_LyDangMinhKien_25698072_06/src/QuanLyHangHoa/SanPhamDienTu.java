package QuanLyHangHoa;

import java.time.LocalDate;

public class SanPhamDienTu extends SanPham{
	private LocalDate thoiGianBaoHanh;

	

	public SanPhamDienTu(String maSanPham, String tenSanPham, LocalDate ngaySanXuat, double giaNhap, int soLuongTon,
			LocalDate thoiGianBaoHanh) {
		super(maSanPham, tenSanPham, ngaySanXuat, giaNhap, soLuongTon);
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}

	public LocalDate getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}

	public void setThoiGianBaoHanh(LocalDate thoiGianBaoHanh) {
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}
	
	@Override
	public boolean giaBan() {
		return giaNhap + (giaNhap * 0.1) + (thoiGianBaoHanh * 50000);
	}

	@Override
	public String toString() {
		return "SanPhamDienTu [thoiGianBaoHanh=" + thoiGianBaoHanh + "]";
	}
	
	
	
	
	
}
