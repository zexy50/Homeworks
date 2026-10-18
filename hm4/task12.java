import java.util.Scanner;

public class task12 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите 1 чилсло");
		int a = scanner.nextInt();
		System.out.println("Введите 2 чилсло");
		int b = scanner.nextInt();
		System.out.println(del(a,b));

	}

	public static int del(int a, int b) {
		while (b != 0) {
			int f = b;
			b = a % b;
			a = f;
		}
		return a;
	}
}