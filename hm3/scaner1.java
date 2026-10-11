import java.util.Scanner;
public class scaner1{
	public static void main(String[] args){
		Scanner scaner = new Scanner(System.in);
		System.out.println("Введите возраст");
		int age = scaner.nextInt();
		String res = age>=18 ? "Доступ разрешен": "Доступ запрещен";
		System.out.println(res);
	}
}