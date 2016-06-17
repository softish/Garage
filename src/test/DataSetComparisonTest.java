package test;

import mathLib.ArrayMismatchException;
import org.junit.Test;

import static mathLib.statistics.DataSetComparison.*;
import static org.junit.Assert.*;

/**
 * Created by softish on 2016-06-17.
 */
public class DataSetComparisonTest {

    @Test
    public void testCorrelationalCoefficeint() throws Exception {
        double[] x = {44, 36, 39, 48, 50, 20, 15};
        double[] y = {100, 79, 80, 101, 112, 55, 41};

        assertEquals(0.9862, correlationalCoefficient(x, y), Math.pow(10, -4));
    }

    @Test(expected = ArrayMismatchException.class)
    public void testCorrelationalCoefficeintDatasetMismatch() throws Exception {
        double[] x = {44, 36, 39, 48, 50, 20, 15};
        double[] y = {100, 79, 80, 101, 112, 55};

        assertEquals(0.9862, correlationalCoefficient(x, y), Math.pow(10, -4));
    }

    @Test
    public void testHasLinearRelationship() throws Exception {
        double[] x = {44, 36, 39, 48, 50, 20, 15};
        double[] y = {100, 79, 80, 101, 112, 55, 41};

        assertTrue(hasLinearRelationship(correlationalCoefficient(x, y)));
    }

    @Test
    public void testCovariance() throws Exception {
        double[] x = {44, 36, 39, 48, 50, 20, 15};
        double[] y = {100, 79, 80, 101, 112, 55, 41};

        assertEquals(297.0, covariance(x, y), Math.pow(10, -4));
    }

    @Test(expected = ArrayMismatchException.class)
    public void testCovatianceDatasetMismatch() throws Exception {
        double[] x = {44, 36, 39, 48, 50, 20, 15};
        double[] y = {100, 79, 80, 101, 112, 55};

        assertEquals(297, covariance(x, y), Math.pow(10, -4));
    }
}