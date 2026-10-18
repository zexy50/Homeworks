import java.util.Scanner;

public class task23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 1 число");
        int a = scanner.nextInt();

        System.out.println("Введите 2 число");
        int b = scanner.nextInt();

        System.out.println(nod( a, b));
    }

    public static int nod(int a, int b) {
        if (b == 0) {
            return a;
        }
        return nod(b, a % b);
    }
}