
public class CT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Tạo ra 2 sản phẩm
		SanPham Sp1 = new SanPham();
		SanPham Sp2 = new SanPham(2,"Bánh Xoài","Đồ ăn nhẹ","bx.jpg");
		
		//nạp dữ liệu cho sp1 
		Sp1.setMaSP(1);
		Sp1.setTenSP("Cà phê đen");
		Sp1.setLoaiSP("Đồ uống");
		Sp1.setAnhSP("CF.jpg");
		
		String ThongtinSp1 = Sp1.toString();
		String ThongtinSp2 = "Mã SP là " + Sp2.getMaSP();
		       ThongtinSp2 += " Tên SP là " + Sp2.getTenSP();
		       ThongtinSp2 += " Loại SP là " + Sp2.getLoaiSP();
		       ThongtinSp2 += " Ảnh SP là " + Sp2.getAnhSP();
		       
		System.out.println(ThongtinSp1);
		System.out.println(ThongtinSp2);
	}

}
