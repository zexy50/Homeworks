import java.util.Scanner;

public class task26 {
	public static void main (String[] args){
		Scanner scanner = new Scanner (System.in);
		System.out.println("Введите число ");
		int a = scanner.nextInt();
		System.out.println(fibonacci(a));
	}

	public static int fibonacci( int a){
		if (a == 0){
			return 0;
		}
		if (a == 1){
			return 1;
		}
		return fibonacci(a - 1) + fibonacci(a - 2);
	}
}