import java.util.Scanner;
public class scaner5{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int oper;
        do {
            System.out.println("1.Поздороваться");
            System.out.println("2.Показать случайное число");
            System.out.println("0.Выйти");
            
            System.out.print("Введите команду: ");
            oper = scanner.nextInt();

            switch (oper) {
                case 1:
                    System.out.println("Привет");
                    break;

                case 2:
                    System.out.println("Введите любое число:");
                    int rand = scanner.nextInt();
                    System.out.println("Это число: " + rand);
                    break;

                case 0:
                    System.out.println("Выход");
                    break;

                default:
                    System.out.println("Нет такой операции");
            }

        } while ( oper != 0);
    }
}