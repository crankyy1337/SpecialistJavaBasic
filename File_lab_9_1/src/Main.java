import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите наименование текстового файла для сохранения ввода (с расширением .txt): ");
        String inputFilename = sc.nextLine();
        Path newFile = Paths.get(inputFilename);

        System.out.print("Введите число желаемых строк: ");
        int inputNum = sc.nextInt();
        sc.nextLine();

        List<String> linesToWrite = new ArrayList<>();
        for (int i = 0; i < inputNum; i++) {
            System.out.printf("Введите строку %d: ", i+1);
            String line = sc.nextLine();
            linesToWrite.add(line);
        }
        try {
            Files.write(newFile, linesToWrite);
/*
            System.out.println("Содержимое введенного вами файла: ");
            if (Files.exists(savedFile)) {
                for (String line : lines) System.out.println(line);
            }
*/
            int linesCount = 0, wordsCount = 0, charsCount = 0;
            List<String> lines = Files.readAllLines(newFile);
            for (String line : lines) {
                linesCount++;
                charsCount += line.length();
                wordsCount += line.split("[\\s.,!?;-]+").length;
            }
            System.out.printf("Кол-во строк в файле: %s, кол-во слов: %s, кол-во символов: %s",
                    linesCount, wordsCount, charsCount);
        } catch (IOException e) {
            System.err.println("Ошибка работы с файлом " + e.getMessage());
        }

    }
}