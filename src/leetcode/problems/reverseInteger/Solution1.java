package problems.reverseInteger;

public class Solution1 {
    public int reverse(int x) {
        StringBuilder temp;
        if (x < 0) {
            temp = new StringBuilder("-");
        }else temp = new StringBuilder();

        String s = Integer.valueOf(java.lang.Math.abs(x)).toString();

        for (int i = 1; i <= s.length(); i++) {
            temp = temp.append(s.charAt(s.length() - i));
        }
        int res = 0;
        try {
            res = Integer.valueOf(String.valueOf(temp));
        } catch (NumberFormatException e) {
        }
        return res;
    }
}
