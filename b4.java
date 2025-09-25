import java.util.Scanner;

public class b4{
    public static int[] findSubarray(int[] arr, int target) {
        int left = 0;
        int currentSum = 0;
        for (int right = 0; right < arr.length; right++) {
            currentSum += arr[right];
            while (currentSum > target && left <= right) {
                currentSum -= arr[left];
                left++;
            }
            if (currentSum == target) {
                return new int[]{left, right};
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tư mang: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Nhap phan tu mang:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Nhap gia tri target: ");
        int target = sc.nextInt();
        int[] result = findSubarray(nums, target);

        if (result[0] != -1) {
            System.out.println("( "
                    + result[0] + " ," + result[1]+")" );
            System.out.print("Subarray: ");
            for (int i = result[0]; i <= result[1]; i++) {
                System.out.print(nums[i] + " ");
            }
        } else {
            System.out.println("Khong tim thay subarray.");
        }
    }
}
