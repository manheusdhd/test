import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class b2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        boolean[] fixed = new boolean[n];
        System.out.println("Nhap cac phan tu mang nums:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Nhap mang fixed (1 = true, 0 = false):");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            fixed[i] = (val == 1); 
        }
        int[] result = sortWithFixed(nums, fixed);
        System.out.println("Mang sau khi sap xep:");
        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }

    public static int[] sortWithFixed(int[] nums, boolean[] fixed) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!fixed[i]) {
                list.add(nums[i]);
            }
        }
        Collections.sort(list);
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!fixed[i]) {
                nums[i] = list.get(index);
                index++;
            }
        }

        return nums;
    }
}
