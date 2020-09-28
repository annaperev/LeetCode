package leetcode.problems.fairCandySwap;

class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int aSum = calcSum(A);
        int bSum = calcSum(B);
        int honestCandyNumber = (aSum+bSum)/2;

        int [] res = {0,0};

        for(int a:A){
            for(int b:B){
                if ((b-a) == honestCandyNumber-aSum){
                    res[0]=a;
                    res[1]=b;
                    break;
                }
            }
        }

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
