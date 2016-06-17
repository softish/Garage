package test;

import mathLib.EmptyArrayException;
import org.junit.Test;
import mathLib.statistics.StatisticalDispersion;

import static org.junit.Assert.*;

/**
 * Created by softish on 2016-06-15.
 */
public class StatisticalDispersionTest {

    @Test
    public void testVariancePopulation() throws Exception {
        assertEquals(1.25, StatisticalDispersion.variancePopulation(1, 2, 3, 4), Double.MIN_VALUE);
    }

    @Test
    public void testStandardDeviationPopulation() throws Exception {
        assertEquals(1.118033988749895, StatisticalDispersion.standardDeviationPopulation(1, 2, 3, 4), Double.MIN_VALUE);
    }

    @Test
    public void testVarianceSample() throws Exception {
        assertEquals(1.6666666666666667, StatisticalDispersion.varianceSample(1, 2, 3, 4), Double.MIN_VALUE);
    }

    @Test
    public void testStandardDeviationSample() throws Exception {
        assertEquals(1.2909944487358056, StatisticalDispersion.standardDeviationSample(1, 2, 3, 4), Double.MIN_VALUE);
    }

    @Test(expected = EmptyArrayException.class)
    public void testVarianceRangeExeption() throws Exception {
        StatisticalDispersion.varianceRange(new double[0]);
    }

    @Test
    public void testVarianceRange() throws Exception {
        assertEquals(3, StatisticalDispersion.varianceRange(1, 2, 3, 4), Double.MIN_VALUE);
    }
}