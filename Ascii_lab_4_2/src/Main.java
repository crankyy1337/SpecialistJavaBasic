public class Main {
    public static void main(String[] args) {
        System.out.print("    ");
        for (int i = 0; i <= 7; i++)
            System.out.printf("%4X", i);
        System.out.println();

        for (int row = 0; row <= 7; row++) {
            System.out.printf("%4X", row);

            for (int col = 0; col <= 7; col++) {
                char ch = (char) ((col * 16) + row);
                System.out.printf("%4c", ch);
            }

            System.out.println();
        }

    }
}