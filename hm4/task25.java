import java.util.Scanner;

public class task25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();

        task(a);
    }

    public static void task(int a) {
        if (a == 0) {
            return;
        }
        
        task(a - 1);
        System.out.println(a);
        
    }
}