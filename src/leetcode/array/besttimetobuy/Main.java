package leetcode.array.besttimetobuy;

public class Main {
    public static void main(String[] args) {
        int[] prices = {1,2,4,7};
//        int[] prices = {397, 6621, 4997, 7506, 8918, 1662, 9187, 3278, 3890, 514, 18, 9305, 93, 5508, 3031, 2692, 6019, 1134, 1691, 4949,
//                5071, 799, 8953, 7882, 4273, 302, 6753, 4657, 8368, 3942, 1982, 5117, 563, 3332, 2623, 9482, 4994, 8163, 9112, 5236, 5029,
//                5483, 4542, 1474, 991, 3925, 4166, 3362, 5059, 5857, 4663, 6482, 3008, 3616, 4365, 3634, 270, 1118, 8291, 4990, 1413, 273,
//                107};
        Solution1 solution = new Solution1();
        System.out.println(solution.maxProfit(prices));
    }
}
