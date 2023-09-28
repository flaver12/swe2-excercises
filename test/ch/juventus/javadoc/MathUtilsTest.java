package test.ch.juventus.javadoc;

import ch.juventus.javadoc.MathUtils;
import org.junit.Test;

public class MathUtilsTest {

    @Test
    public void testAddition() {
        MathUtils mathUtils = new MathUtils();
        assert(mathUtils.addition(List.of(1.0, 2.0, 3.0)) == 6.0);
    }

    @Test
    public void testSubtraction() {
        MathUtils mathUtils = new MathUtils();
        assert(mathUtils.subtraction(List.of(1.0, 2.0, 3.0)) == -4.0);
    }

    @Test
    public void testMultiplication() {
        MathUtils mathUtils = new MathUtils();
        assert(mathUtils.multiplication(List.of(1.0, 2.0, 3.0)) == 6.0);
    }

    @Test
    public void testDivision() {
        MathUtils mathUtils = new MathUtils();
        assert(mathUtils.division(List.of(1.0, 2.0, 3.0)) == 0.16666666666666666);
    }

}
