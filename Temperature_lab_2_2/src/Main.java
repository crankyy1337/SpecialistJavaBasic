
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите температуру в C: ");
        String tempC = scanner.nextLine();
        tempC = tempC.replace(',', '.');
        //double formattedTemp = Double.parseDouble(tempC);

        try {
            double formattedTemp = Double.parseDouble(tempC);
            double tempF = formattedTemp * 9 / 5 + 32;
            System.out.printf("Температура в F: %.2f", tempF);
        } catch (NumberFormatException e) {
            System.out.print("Вы ввели некорректные данные");
            return;
        }

        scanner.close();
    }
}