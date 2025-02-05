public class Main {

    public static int gcd (int a, int b) {
        int temp;
        while ((temp = a % b) != 0) {
            a = b;
            b = temp;
            }
        return b;
    }
    public static void main(String[] args) {

        System.out.println(gcd(156, 177));
        System.out.println(gcd(1071, 462));
    }
}