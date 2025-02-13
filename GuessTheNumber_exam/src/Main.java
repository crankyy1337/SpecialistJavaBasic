import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Я загадал число от 1 до 100. Отгадайте его!");
        System.out.println("Введите 0 чтобы сдаться.");
        int target = new Random().nextInt(100) + 1;
        /*int q = (int)Math.random() * 100 + 1;
        System.out.println(target);*/

        int attempt;
        do {
            Scanner input = new Scanner(System.in);
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
            }
        } while (attempt != target);

    }
}