import java.util.Scanner;
public class scaner4{
	public static void main(String[] args){
		Scanner scaner = new Scanner(System.in);
		System.out.println("Введите  первое число");
		int a = scaner.nextInt();
		System.out.println("Введите  второе число");
		int b = scaner.nextInt();
		System.out.println("+,-,/,*");
		char oper = scaner.next().charAt(0);
		switch (oper) {
            case '+':
                System.out.println(a + b);
                break;

            case '-':
                System.out.println(a - b);
                break;

            case '*':
                System.out.println(a * b);
                break;

            case '/':
                if (b == 0) {
                    System.out.println("На ноль делить нельзя");
                } else {
                    System.out.println(a / b);
                }
                break;
              default:
        		System.out.println("Нет такой операции");
        }
	}
}

	