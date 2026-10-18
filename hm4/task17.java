import java.util.Scanner;

public class task17 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число");
		int a = scanner.nextInt();
		table(a);
	}

	public static void table(int a) {

		for (int i = 1 ; i <= a ; i++) {
			for (int j = 1 ; j <= a ; j++){

				System.out.print(i * j + "\t");
			}

			System.out.println();
		}

		
	}
		

}