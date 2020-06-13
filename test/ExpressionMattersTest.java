import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ExpressionMattersTest {
    @Test
    public void checkSmallValues() {
        assertEquals(6, ExpressionMatters.expressionsMatter(2, 1, 2));
        assertEquals(3, ExpressionMatters.expressionsMatter(1, 1, 1));
        assertEquals(4, ExpressionMatters.expressionsMatter(2, 1, 1));
        assertEquals(9, ExpressionMatters.expressionsMatter(1, 2, 3));
        assertEquals(5, ExpressionMatters.expressionsMatter(1, 3, 1));
        assertEquals(8, ExpressionMatters.expressionsMatter(2, 2, 2));
    }

    @Test
    public void checkIntermediateValues() {
        assertEquals( 20, ExpressionMatters.expressionsMatter(5, 1, 3));
        assertEquals(105, ExpressionMatters.expressionsMatter(3, 5, 7));
        assertEquals( 35, ExpressionMatters.expressionsMatter(5, 6, 1));
        assertEquals(  8, ExpressionMatters.expressionsMatter(1, 6, 1));
        assertEquals( 14, ExpressionMatters.expressionsMatter(2, 6, 1));
        assertEquals( 48, ExpressionMatters.expressionsMatter(6, 7, 1));
    }

    @Test
    public void checkMixedValues() {
        assertEquals( 60, ExpressionMatters.expressionsMatter( 2, 10,  3));
        assertEquals( 27, ExpressionMatters.expressionsMatter( 1,  8,  3));
        assertEquals(126, ExpressionMatters.expressionsMatter( 9,  7,  2));
        assertEquals( 20, ExpressionMatters.expressionsMatter( 1,  1, 10));
        assertEquals( 18, ExpressionMatters.expressionsMatter( 9,  1,  1));
        assertEquals(300, ExpressionMatters.expressionsMatter(10,  5,  6));
        assertEquals( 12, ExpressionMatters.expressionsMatter( 1, 10,  1));
    }
}