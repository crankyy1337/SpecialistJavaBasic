import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static int[] inputArray (){
        System.out.print("Введите размер одномерного массива: ");

        try(Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            int[] nums = new int[size];
            for (int i = 0; i < nums.length; i++) {
                System.out.printf("n[%d] = ", i);
                nums[i] = sc.nextInt();
            }

            return nums;
        }
    }
    public static int[] analyzeArray(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int sum = 0;

        for (int num : nums) {
            sum += num;
            if (num < min) min = num;
            if (num > max) max = num;
        }

        return new int[] {min, max, sum};
    }

    public static double med(int[] nums) {
        Arrays.sort(nums);

            if (nums.length % 2 == 1) {
                return nums[(nums.length / 2)];
            } else {
                return (nums[(nums.length / 2) - 1] + nums[nums.length / 2]) / 2D;
            }
        }


    public static void print(int min, int max, int sum, double med) {
        System.out.printf("min = %d\nmax = %d\nsum = %d\nmed = %.2f\n", min, max, sum, med);
    }

    public static void main(String[] args) {

        int[] m = inputArray();
        int[] n = analyzeArray(m);
        double p = med(m);
        print(n[0], n[1], n[2], p);
    }
}