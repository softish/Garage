package mathLib.statistics;

import mathLib.EmptyArrayException;

/**
 * Created by softish on 2016-06-15.
 */
public class StatisticalDispersion {

    private static double variance(double... values) {
        double variance = 0;

        for (double value : values) {
            variance += Math.pow(value - Average.arithmeticMean(values), 2);
        }

        return variance;
    }

    // Q: neater divide between set and population? -> class lvl?
    public static double variancePopulation(double... values) {
        double variance = 0;

        variance = variance(values);
        variance /= values.length;

        return variance;
    }

    public static double standardDeviationPopulation(double... values) {
        return Math.sqrt(variancePopulation(values));
    }

    public static double varianceSample(double... values) {
        double variance = 0;

        variance = variance(values);
        variance /= (values.length - 1);

        return variance;
    }

    public static double standardDeviationSample(double... values) {
        return Math.sqrt(varianceSample(values));
    }

    public static double varianceRange(double... values) {
        if(values == null || values.length == 0) {
            throw new EmptyArrayException();
        }

        double min = values[0];
        double max = values[values.length - 1];

        for (int i = 0; i < values.length; i++) {
            if(values[i] < min)
                min = values[i];

            if(values[i] > max)
                max = values[i];

        }

        return max - min;
    }
}
