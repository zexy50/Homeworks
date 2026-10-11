import java.util.Scanner;
public class scaner2{
	public static void main(String[] args){
		Scanner scaner = new Scanner(System.in);
		System.out.println("Введите число");
		int number = scaner.nextInt();
		String res = (number%2)==0 ? "Четное ": "Не четное";
		System.out.println(res);
	}
}