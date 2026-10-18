import java.util.Scanner;

public class task15 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите чилсло");
		int a = scanner.nextInt();
		System.out.println(revers(a));
	}

	public static int revers(int a) {
		int rev = 0;
		while (a != 0) {
			int digit = a % 10;
			rev = rev * 10 + digit;
			a /= 10;
		}
		return rev;
	}
}