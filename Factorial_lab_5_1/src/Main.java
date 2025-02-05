public class Main {

    public static int factorialRec(int n) {
        if (n == 1 || n == 0) return 1;
        else return factorialRec(n-1) * n;
    }

    public static int factorialCycle(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
    public static void main(String[] args) {

        System.out.println(factorialRec(7));
        System.out.println(factorialCycle(7));

    }
}