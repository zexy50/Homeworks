import java.util.Scanner;
public class scaner7{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите ваши баллы");
		int grade = scanner.nextInt();
		int grade1 = grade >= 90 ? 5
                  : grade >= 75 ? 4
                  : grade >= 60 ? 3
                  : 2;
         System.out.println("Ваши оценка: " + grade1);
	}
}