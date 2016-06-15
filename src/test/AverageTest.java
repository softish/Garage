package test;

import mathLib.EmptyArrayException;
import mathLib.statistics.Average;
import org.junit.Test;
import org.w3c.dom.Document;

import static org.junit.Assert.*;

/**
 * Created by softish on 2016-06-15.
 */
public class AverageTest {

    @org.junit.Test
    public void testArithmeticMean() throws Exception {
        assertEquals(1.5, Average.arithmeticMean(0, 1, 2, 3), Double.MIN_VALUE);
    }

    @Test
    public void testArithmeticMeanArray() throws Exception {
        assertEquals(1.5, Average.arithmeticMean(new double[] {0, 1, 2, 3}), Double.MIN_VALUE);
    }

    @Test(expected = EmptyArrayException.class)
    public void testArithmeticMeanArrayEmpty() throws Exception {
        Average.arithmeticMean(new double[] {});
    }

    @Test
    public void testMedian() {
        assertEquals(2.0, Average.median(1, 2, 3), Double.MIN_VALUE);
    }

    @Test
    public void testMedianEven() {
        assertEquals(3.0, Average.median(1, 2, 3, 4), Double.MIN_VALUE);
    }

    @Test
    public void testMedianUnsorted() {
        assertEquals(2.0, Average.median(3, 2, 1), Double.MIN_VALUE);
    }

    @Test
    public void testMode() {
        assertEquals(2 , Average.mode(1, 1, 2, 5, 9, 7, 8, 5, 2, 3, 5, 3, 2, 2, 2, 2, 2, 2, 2, 1, 4), Double.MIN_VALUE);
    }


}