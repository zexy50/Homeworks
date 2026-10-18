import java.util.Scanner;

public class task16 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число");
		int a = scanner.nextInt();
		System.out.println(palin(a));
	}

	public static int reversNum(int a) {
		int rev = 0;

		while (a != 0) {
			int digit = a % 10;
			rev = rev * 10 + digit;
			a /= 10;
		}
		return rev;
	}

	public static boolean palin(int a) {
		return a == reversNum(a);

	}
}