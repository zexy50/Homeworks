import java.util.Scanner;
public class scaner6{
	public static void main(String[] args){
		Scanner scaner = new Scanner(System.in);
		// System.out.println("Введите пароль");
		// int password = scaner.nextInt();
		String passwordTrue = "java123";
		String password;
		do{
			System.out.println("Введите пароль");
			password = scaner.nextLine();
			
		}while (!password.equals(passwordTrue));

	System.out.println("Вход выполнен");
	}
}