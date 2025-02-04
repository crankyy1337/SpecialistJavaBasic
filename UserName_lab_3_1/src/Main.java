import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи имя: ");
        String input = scanner.nextLine();

        String userName = input.isBlank() ? "Незнакомец" : input;
        System.out.printf("Привет, %s!", userName);
    }
}
