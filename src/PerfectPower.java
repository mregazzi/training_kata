import java.util.Arrays;

public class PerfectPower {

    public static void main(String[] args) {
        int[] proof = isPerfectPower(3200);
        //System.out.println((int) (Math.log(32) / Math.log(2)));
        if(proof != null) {
            Arrays.stream(proof).forEach(System.out::println);
        }
    }

    public static int[] isPerfectPower(int n) {
        if (n == 1) return null;
        int m;
        int[] proof = null;
        for (m = 1; m < n/2+1; m++) {
            if (((int) Math.pow(m,2)) > n){
                return proof;
            }
            //System.out.println("n, m: " + n +", " + m);
            if (n % m == 0) {
                proof = tryPow(n, m);
                if (proof != null){
                    return proof;
                }
            }
        }
        return proof;
    }

    private static int[] tryPow(int n, int m) {
        int k;
        int top = ((int) (Math.log(n) / Math.log(2)));
        for (k = 1; k <= top; k++) {
            System.out.println("n, m, k: " + n +", " + m +", " + k);
            System.out.println("Potenza:"+(int)Math.pow(m, k));

            int pow = (int) Math.pow(m, k);
            if (pow > n) {
                return null;
            }
            if (pow == n) {
                return new int[] {m, k};
            }
        }
        return null;
    }

    public static int log2(int x)
    {
        return (int) (Math.log(x) / Math.log(2));
    }
}