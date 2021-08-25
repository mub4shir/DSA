package Arrays;

public class removeDuplicates {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,4,4,4};
        System.out.println(remove(nums));
    }

    private static int remove(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }

        }
        return i+1;
    }
}
