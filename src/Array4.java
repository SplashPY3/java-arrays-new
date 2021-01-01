public class Array4 {
    public static void main(String[] args) {
        String[] shops = new String[7];
        int[] prices = {1050,2000,900,1500,895,2700,1000};
        int[] discounts = {10, 20, 5, 15, 2, 25, 2};
        float res1 = prices[0] * 0.1f;
        float res2 = prices[1] * 0.2f;
        float res3 = prices[2] * 0.05f;
        float res4 = prices[3] * 0.15f;
        float res5 = prices[4] * 0.02f;
        float res6 = prices[5] * 0.25f;
        float res7 = prices[6] * 0.02f;
        float[] results = {res1, res2, res3, res4, res5, res6, res7};
        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i] - results[i]);
        }
    }
}
