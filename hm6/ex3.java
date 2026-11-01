import java.util.Scanner;
import java.util.regex.Pattern;




public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String text = scanner.nextLine();

        String result = "";

        for (int i = 0; i < text.length(); i++) {
            String ch = "" + text.charAt(i);

            if (Pattern.matches("[0-9]", ch)) {
                result += "#";
            } else {
                result += ch;
            }
        }

        System.out.println(result);
    }
}