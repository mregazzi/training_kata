public class HalvingSum {
    public int halvingSum(int num) {
        int sum = num;
        int divisor = 2;
        do {
            sum += num / divisor;
            divisor *= 2;
        } while (num / divisor >= 1);

        return sum;
    }

    int halvingSum2(int n) {
        if (n == 1) return 1;
        return n + halvingSum(n / 2);
    }

    int recursiveHalvingSum(int n) {
        if (n == 1) return 1;
        return n + recursiveHalvingSum(n / 2);
    }
}
