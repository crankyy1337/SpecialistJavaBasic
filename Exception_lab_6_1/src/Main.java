import java.util.Scanner;

public class Main {

    public static int factorialCycle(int n) {

        int factorial = 1;
        if (n < 0) throw new IllegalArgumentException("illegal input");
        for (int i = 1; i <= n; i++) {
            factorial = Math.multiplyExact(factorial, i);
        }
        return factorial;

    }

    public static void main(String[] args) {

        System.out.println("Введите целое число для подсчета его факториала: ");

        try (Scanner sc = new Scanner(System.in)) {
            String input = sc.nextLine();
            int inputNumber = Integer.parseInt(input);
            System.out.printf("Факториал числа %d = %d", inputNumber, factorialCycle(inputNumber));
        } catch (IllegalArgumentException | ArithmeticException ex) {
            System.err.print(ex.getMessage());
        }
    }
}