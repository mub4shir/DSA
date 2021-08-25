package Arrays;
import java.util.Arrays;

public class RemoveElement {
    //Input nums = [3,2,2,3] val = 3 ;
    public static void main(String[] args) {
        int[] nums = {2};
        int val = 3;
        System.out.println(removeElement(nums,val));
    }

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i++] = nums[j];
            }
        }
        return i;
    }
}

