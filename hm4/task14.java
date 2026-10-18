import java.util.Scanner;

public class task14 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Введите число ");
		int a = scanner.nextInt();
		System.out.println(sumNumber(a));

	}

	public static int sumNumber(int a) { 
		int sum = 0;
		while (a != 0){
			int digit = a % 10;
			sum += digit;
			a /= 10;
		}

		return sum;
	}
}