package leetcode.array.rotatearray;

public class Solution {
    public void rotate(int[] nums, int k) {
        int [] temp = nums.clone();
        for (int i = 0; i<nums.length;i++){
            nums[i] = temp[(temp.length - k%temp.length + i)%temp.length];
        }
    }
}
