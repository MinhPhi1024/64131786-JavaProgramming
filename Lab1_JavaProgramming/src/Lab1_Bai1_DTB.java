
import java.util.Scanner;

public class Lab1_Bai1_DTB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập họ và tên sinh viên: ");
        String hoTen = scanner.nextLine();
        
        System.out.print("Nhập điểm trung bình: ");
        double diemTrungBinh = scanner.nextDouble();
        
        System.out.println(hoTen + " " + diemTrungBinh + " điểm");	

	}

}
