package problems.fairCandySwap;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int a[] = {1,1};
        int b[] = {2,2};
        int res [] = solution.fairCandySwap(a,b);
        System.out.println(res[0] + ", " + res[1]);
    }
}
