import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(text);
        boolean found = false;


        while (matcher.find()) {
            System.out.println(matcher.group());
            found = true;
        }

        
        if (!found) {
            System.out.println("NONE");
        }
    }
}