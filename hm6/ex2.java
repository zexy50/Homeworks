import java.util.regex.Pattern;
import java.util.Scanner;

public class ex2 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите логин");
		String login = scanner.nextLine();

		if (Pattern.matches("[a-z][a-z0-9_]{2,11}", login)){
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}