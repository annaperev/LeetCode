package leetcode.problems.addtoArrayFormofInteger;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {

        int carry = 0;
        int i = A.length-1;
        int sum = 0;
        List<Integer> res = new ArrayList();

        while (i>=0 || K > 0 ){
            int a = (i >= 0)?A[i]:0;

            sum = a + K%10 + carry;
            res.add(0,sum%10);

            carry = sum/10;

            i--;
            K = K /10;
        }

        if(carry != 0){
            res.add(0,carry);
        }
        return res;
    }
}
