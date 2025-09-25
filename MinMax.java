import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu mang: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Nhap cac phan tu mang:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int[] result = findMinMax(nums);
        System.out.println("Min = " + result[0] + ", Max = " + result[1]);

        sc.close();
    }
    public static int[] findMinMax(int[] nums) {
        int min, max;
        int i;
        if (nums.length % 2 == 0) {
            if (nums[0] < nums[1]) {
                min = nums[0];
                max = nums[1];
            } else {
                min = nums[1];
                max = nums[0];
            }
            i = 2; 
        } else {
            min = max = nums[0];
            i = 1; 
        }
        while (i < nums.length - 1) {
            int a = nums[i];
            int b = nums[i + 1];

            if (a < b) {
                if (a < min) min = a;
                if (b > max) max = b;
            } else {
                if (b < min) min = b;
                if (a > max) max = a;
            }

            i += 2; 
        }
        return new int[]{min, max};
    }
}
