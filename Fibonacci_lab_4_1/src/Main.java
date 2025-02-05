public class Main {
    public static void main(String[] args) {

        System.out.println("Ниже представлена постедовательность Фибоначчи: ");

        int n1 = 0, n2 = 1;
        System.out.print(n1 + " " + n2 + " ");

        while ((n1 + n2) < 1000) {
           int n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }

    }
}