package leetcode.problems.twosum;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int [] nums = {2,7,11,15};
        int target = 9;
        int [] result = solution.twoSum(nums,target);
        System.out.println(result[0]+ ", " +result[1]);
    }
}
