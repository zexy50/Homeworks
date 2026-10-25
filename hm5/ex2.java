import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер массива:");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Введите элементы массива:");

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Введите количество энергии");
        int energy = scanner.nextInt();
        System.out.println(chech(numbers , energy));
    }

    public static int chech(int[] a, int b) {
        int max = 0;

        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            int count = 0;

            for (int j = i; j < a.length; j++) {
                sum += a[j];

                if (sum > b) {
                    break;
                } else {
                    count++;
                }
            }

            if (count > max) {
                max = count;
            }
        }

        return max;
    }
}