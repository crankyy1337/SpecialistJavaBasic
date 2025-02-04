import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи целое число ворон: ");

        try {

            int count = scanner.nextInt();

            int count2 = count % 100;
            String v;
            if (count2 >= 11 && count2 <= 14){
                v = "ворон";
            } else v = switch (count % 10) {
                case 1 -> "ворона";
                case 2, 3, 4 -> "вороны";
                default -> "ворон";
            };

            System.out.printf("На ветке %d %s", count, v);

        } catch (InputMismatchException e) {
            System.out.print("Вы ввели некорректные данные");
        }

    }

}