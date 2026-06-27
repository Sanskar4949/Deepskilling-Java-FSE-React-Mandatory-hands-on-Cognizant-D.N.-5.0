public class FinancialForecasting {
    static double futureValue(double pv, double rate, int n) {
        if(n == 0) return pv;

        return futureValue(pv * (1 + rate), rate, n - 1);
    }

    public static void main(String[] args) {
        double presentValue = 1000.0;
        double growthRate = 0.10;
        int periods = 5;

        double result = futureValue(presentValue, growthRate, periods);
        System.out.println("Future Value: " + result);
    }
}