import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число");
        int base = scanner.nextInt();

        System.out.println("Введите степень");
        int exponent = scanner.nextInt();

        System.out.println(task(base, exponent));
    }

    public static int task(int base, int exponent) {
        int res = 1;

        for (int i = 0; i < exponent; i++) {
            res = res * base;
        }

        return res;
    }
}