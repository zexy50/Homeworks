import java.util.Scanner;

public class task21 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Введите число ");
		int a = scanner.nextInt();
		System.out.println(factorial(a));
	}

	public static int factorial( int a ){
		if (a == 0 || a == 1) {
			return 1;
		}
		return a * factorial(a-1);

	}
}