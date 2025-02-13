import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int target = new Random().nextInt(100) + 1;
        System.out.println("Я загадал число от 1 до 100. Отгадайте его!");
        System.out.println("Введите 0 чтобы сдаться.");
        System.out.println();
        /*int q = (int)Math.random() * 100 + 1;
        System.out.println(target);*/
        Scanner input = new Scanner(System.in);
        System.out.print("Введите желаемое кол-во попыток: ");
        int desiredAttempts = input.nextInt();

        int attempt = 0;
        do {
            try {
                System.out.print("Ваш вариант числа: ");
                attempt = input.nextInt();
                if (attempt == 0) {
                    System.out.println("Удачи в следующий раз!");
                    break;
                }
                if (attempt == target)
                    System.out.println("Вы выиграли!");
                else {
                    String res = (attempt >= target) ? "больше" : "меньше";
                    System.out.printf("Введенное число %s загаданного.\n", res);
                    desiredAttempts--;
                }
            } catch (InputMismatchException ex) {
                System.out.println("Введенное число некорректно! Повторите ввод.");
                input.next();
            }
        } while (attempt != target && desiredAttempts != 0);

        input.close();

    }

}