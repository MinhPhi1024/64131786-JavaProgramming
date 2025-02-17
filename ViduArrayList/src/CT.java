import java.util.ArrayList;

public class CT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Khai báo danh sách sản phẩm
		ArrayList <SanPham> dsSanPham;
		//Xin mới
		dsSanPham  = new ArrayList<SanPham> ();
		
		//Nhập 3 sản phẩm
		//SanPham sp1 = new SanPham(0,"Bia","Đồ uống","bia.jpg");
		SanPham sp2 = new SanPham(1,"Bánh Xoài","Đồ ăn nhẹ","bx.jpg");
		SanPham sp3 = new SanPham(2,"Kem","Tráng miệng","kem.jpg");
		
		//Thêm sản phẩm vào danh sách
		dsSanPham.add(new SanPham(0,"Bia","Đồ uống","bia.jpg"));
		//dsSanPham.add(sp1);
		dsSanPham.add(sp2);
		dsSanPham.add(sp3);
		
		//in thông tin sản ra màn hình
		//Cách 1
		for (SanPham x: dsSanPham) 
			System.out.println(x.toString());
		
		//Cách2
		for (int i = 0; i< dsSanPham.size();i++) {
			SanPham sp = dsSanPham.get(i);
			System.out.println(sp.toString());
		}
		
	}

}
