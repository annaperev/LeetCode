package array.removedublicates;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,3};
        Solution solution = new Solution();
        // nums is passed in by reference. (i.e., without making a copy)
        int len = solution.removeDuplicates(nums);

// any modification to nums in your function would be known by the caller.
// using the length returned by your function, it prints the first len elements.
        for (int i = 0; i < len; i++) {
            System.out.println((nums[i]));
        }
    }
}
