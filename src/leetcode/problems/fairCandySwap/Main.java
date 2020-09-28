package leetcode.problems.fairCandySwap;

//https://leetcode.com/problems/fair-candy-swap/

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int a[] = {2};
        int b[] = {1,3};
        int res [] = solution.fairCandySwap(a,b);
        System.out.println(res[0] + ", " + res[1]);
    }
}
