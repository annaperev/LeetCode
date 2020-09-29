package leetcode.problems.addtoArrayFormofInteger;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int [] array = {9,9};
        int K = 777;
        List<Integer> list = solution.addToArrayForm(array, K);
        for(Integer i:list){
            System.out.print(i + " ");
        }
    }
}
