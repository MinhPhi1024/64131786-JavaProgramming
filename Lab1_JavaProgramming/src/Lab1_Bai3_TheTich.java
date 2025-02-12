/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class Lab1_Bai3_TheTich {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập cạnh của khối lập phương:");
		double canh = scanner.nextDouble();
		
		double TheTich = Math.pow(canh, 3);
		
		System.out.print("Thể tích: " + TheTich);
	}

}
