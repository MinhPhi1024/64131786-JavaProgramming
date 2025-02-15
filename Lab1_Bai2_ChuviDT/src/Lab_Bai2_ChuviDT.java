import java.util.Scanner;

public class Lab_Bai2_ChuviDT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào 2 cạnh của hình chữ nhật: ");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		
		double Chuvi = (a + b) * 2;
		double DienTich = a * b;
		double CanhNho = Math.min(a, b);
		
		System.out.println("Chu vi HCN: " + Chuvi);
		System.out.println("Diện tích HCN: " + DienTich);
		System.out.println("Cạnh nhỏ HCN: " + CanhNho);

	}

}
