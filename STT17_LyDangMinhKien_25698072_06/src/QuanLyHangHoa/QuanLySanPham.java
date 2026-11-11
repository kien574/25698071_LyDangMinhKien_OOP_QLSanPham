package QuanLyHangHoa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class QuanLySanPham {
	private ArrayList<SanPham> sp;

	public QuanLySanPham() {
		sp = new ArrayList<>();
	}
	
	public boolean themSanPham(SanPham p) {
		if (p == null || timSanPham(p.getMaSanPham()) != null) {
            return false;
        }
        sp.add(p);
        return true;
	}
	public SanPham timSanPham(String maSanPham) {
        for (SanPham p : sp) {
            if (p.maSanPham.equalsIgnoreCase(maSanPham)) {
                return p;
            }
        }
        return null;
    }
	public List<SanPham> getDanhSach() {
        return new ArrayList<>(sp);
    }

    public List<SanPham> getGiaban() {
        ArrayList<SanPham> kq = new ArrayList<>();

        for (SanPham p : sp) {
            if (p.giaBan()) {
                kq.add(p);
            }
        }
        return kq;
    }
	public boolean xoaSanPham(String maSanPham) {
		SanPham p = timSanPham(maSanPham);

        if (p == null) {
            return false;
        }
        return sp.remove(p);
    }
	public boolean capNhatSoLuongTon(
            String maSanPham, int soLuongTon) throws Exception {

        SanPham p = timSanPham(maSanPham);

        if (!(p instanceof SanPham)) {
            return false;
        }

     
        ((SanPham) p).setSoLuongTon(soLuongTon);
        return true;
    }

	 public List<SanPhamDienTu> getSanPhamDienTu60() {
	        ArrayList<SanPhamDienTu> kq = new ArrayList<>();

	        for (SanPham p : sp) {
	            if (p instanceof SanPhamDienTu) {
	            	SanPhamDienTu dt = (SanPhamDienTu) p;

	                if (dt.getSoLuongTon() == 60) {
	                    kq.add(dt);
	                }
	            }
	        }
	        return kq;
	    }
	
	 public void inDanhSach(List<? extends SanPham> danhSach) {
	        if (danhSach.isEmpty()) {
	            System.out.println("Danh sach rong.");
	            return;
	        }
	        for (SanPham p : danhSach) {
	            System.out.println(p);
	            System.out.println(
	                "Dat chuan: " +
	                (p.giaBan() ? "Co" : "Khong")
	            );
	        }
	    }
	
	
	
	
}
