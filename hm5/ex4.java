import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество ступеней:");
        int n = scanner.nextInt();

        int res = steps(n, false);

        System.out.println(res);
    }

    public static int steps(int n, boolean Two) {
        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            return 0;
        }

        int ways = steps(n - 1, false);

        if (Two == false) {
            ways += steps(n - 2, true);
        }

        return ways;
    }
}