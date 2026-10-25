import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество энергии:");
        int energy = scanner.nextInt();

        int min = energy;

        for (int i = 0; i <= n / 6; i++) {
            int a = n - i * 6;

            int four = a / 4;
            int one = a % 4;

            int count = i + four + one;

            if (count < min) {
                min = count;
            }
        }

        System.out.println(min);
    }
}