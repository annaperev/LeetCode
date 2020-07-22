package problems.reverseInteger;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.reverse(123));
        System.out.println(solution.reverse(-123));
        System.out.println(solution.reverse(120));
        System.out.println(solution.reverse( 2147483647));
        System.out.println(solution.reverse(-2147483412));
        System.out.println(solution.reverse(1534236469));
        System.out.println("max: " + Integer.MAX_VALUE + " min: " + Integer.MIN_VALUE);
    }
}
