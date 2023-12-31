package leetcode;

/**
 * @see <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/">
 * Best Time to Buy and Sell Stock</a>
 */
public class P0121_BestTimeToBuyAndSellStock {

    public static void main(String... args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        int result = getResult(prices);

        System.out.println(result);
    }

    public static int getResult(int[] prices) {
        int minProfit = Integer.MAX_VALUE;
        int maxProfit = 0;
        int currentProfit;

        for (int price : prices) {
            if (price < minProfit) {
                minProfit = price;
            }
            currentProfit = price - minProfit;
            if (maxProfit < currentProfit) {
                maxProfit = currentProfit;
            }
        }
        return maxProfit;
    }
}
