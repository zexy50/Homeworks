import java.util.Scanner;

public class task22 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Введите число ");
		int a = scanner.nextInt();
		System.out.println(sum(a));
	}

	public static int sum( int a ){
		if (a == 1) {
			return 1;
		}
		return a + sum(a-1);

	}
}