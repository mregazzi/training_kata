import java.util.Arrays;

public class ExpressionMatters {
    public static int expressionsMatter(int a, int b, int c)
    {
        //SMELL can we use the Math.ma() function instead ?
        int[] tot =  {a + b + c, a * b * c, a + b * c, a * b + c, (a + b) * c, (a * b) * c,
                (a * b) + c, (a + b) + c, a * (b + c)};
        Arrays.sort(tot);
        return tot[8];
    }
}