package AmazonOA;

public class DietPlanPerformance {
    public int dietPlanPerformance(int[] calories, int k, int lower, int upper) {
        int n = calories.length;
        int result = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += calories[i];
            if (i >= k - 1) {
                if (sum < lower) {
                    result--;
                } else if (sum > upper) {
                    result++;
                }
                sum -= calories[i - k + 1];
            }
        }
        return result;
    }
}
