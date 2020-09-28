package array.containsduplicate;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

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
