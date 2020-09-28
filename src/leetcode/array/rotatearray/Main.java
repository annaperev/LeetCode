package array.rotatearray;


public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2};
        int k = 3;
        Solution solution = new Solution();
        solution.rotate(nums, k);
        for (int i=0;i<nums.length;i++)
        System.out.print(nums[i] + ", ");
    }

}
