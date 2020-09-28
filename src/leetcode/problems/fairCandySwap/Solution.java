package problems.fairCandySwap;

class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        System.out.println(calcSum(A));
        System.out.println(calcSum(B));

        int [] res = {};
        return res;
    }

    private int calcSum(int[] A){
        int sum = 0;
        for (int i = 0; i < A.length; i++){
            sum = sum + A[i];
        }
        return sum;
    }
}
