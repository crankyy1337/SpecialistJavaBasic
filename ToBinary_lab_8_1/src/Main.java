public class Main {

    public static char[] toBinary(int n) {
        final int size = 32;
        char[] bits = new char[size];

        for(int i = size-1; i >=0; i--) {
            bits[i] = ( (n & 1) == 0) ? '0' : '1';
            n >>= 1;
        }

        return bits;
    }
    public static void main(String[] args) {

    System.out.println(toBinary(55283222));
    System.out.println(toBinary(5));
    System.out.println(toBinary(0));
    System.out.println(toBinary(-12345678));

    }
}