import java.util.Scanner;

public class Lab1_Bai4_Delta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập vào 3 hệ số a,b,c: ");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		
		double delta = Math.pow(b, 2) - 4 * a * c;
		double Candelta = Math.sqrt(delta);
		
		System.out.println("Giá trị delta: " + delta);
		System.out.println("Giá trị căn delta: " + Candelta);

	}

}
