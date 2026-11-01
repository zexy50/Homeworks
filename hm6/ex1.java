import java.util.regex.Pattern;
import java.util.Scanner;

public class ex1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку");
        String str = scanner.nextLine();

        if (Pattern.matches("[A-Z][A-Z]-[0-9]{3}", str)){
            System.out.println("Yes");

        }else{
            System.out.println("No");
        }
    }
}