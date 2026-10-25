import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите заклинание");
        String spell = scanner.next();

        if (checkPalindrom(spell)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static String reverse(String a) {
        String reverseWorde = "";

        for (int i = a.length() - 1; i >= 0; i--) {
            char ch = a.charAt(i);
            reverseWorde += ch;
        }

        return reverseWorde;
    }

    public static boolean checkPalindrom(String a) {
        if (a.equals(reverse(a))) {
            return true;
        } else {
            for (int i = 0; i < a.length(); i++) {
                String newWord = "";

                for (int j = 0; j < a.length(); j++) {
                    if (i != j) {
                        char ch = a.charAt(j);
                        newWord += ch;
                    }
                }

                if (newWord.equals(reverse(newWord))) {
                    return true;
                }
            }
        }

        return false;
    }
}