import java.util.ArrayList;
import java.util.Scanner;

public class duplicateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array : ");
        int n = sc.nextInt();
        System.out.print("Enter the elements : ");
        int [] arr = new int[n];
        for (int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.println(findDuplicate(arr, n));
    }
    public static int findDuplicate(int[] nums , int n) {
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        fast = nums[0];
        while(slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }

}
