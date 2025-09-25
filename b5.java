import java.util.Scanner;

public class b5 {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0; 
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) { 
                i++;
                nums[i] = nums[j]; 
            }
        }
        return i + 1; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu mang: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Nhap cac phan tu mang:");
        for (int k = 0; k < n; k++) {
            nums[k] = sc.nextInt();
        }
        int newLength = removeDuplicates(nums);
        System.out.println("Do dai moi cua mang: " + newLength);
        System.out.print("Mang sau khi xoa cac phan tu trung: ");
        for (int k = 0; k < newLength; k++) {
            System.out.print(nums[k] + " ");
        }
    }
}
