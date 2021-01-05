public class Array4 {
    public static void main(String[] args) {
        int[] prices = {1050,2000,900,1500,895,2700,1000};
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
        float Monday = 945f;
        float Tuesday = 1600f;
        float Wednesday = 855f;
        float Thursday = 1275f;
        float Friday = 877.1f;
        float Saturday = 2025f;
        float Sunday = 980f;
        float[] days = {Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday};
        for (int j = 0; j < days.length; j++) {
            if (days[j] < days[4]) {
                String Day = "Wednesday";
                System.out.println("the best day to shop is " + Day + " and the price is " + Wednesday);
            }
        }
    }
}
