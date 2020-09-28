package leetcode.array.containsduplicate;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for (int l: nums){
            if (set.contains(l)){
                return true;
            }else set.add(l);
        }
        return false;
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] == nums[j])
//                    return true;
//            }
//        }
//        return false;
    }
}
