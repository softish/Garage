package mathLib.statistics;

import mathLib.EmptyArrayException;
import mathLib.Sorter;

/**
 * Created by softish on 2016-06-15.
 */
public class Average {

    /**
     * Calculates the arithmetic mean of a set of values.
     *
     * @param values the values
     * @return the arithmetic mean
     * @throws EmptyArrayException if values are em
     */
    public static double arithmeticMean(double... values) {
        double x = 0;

        if(values == null || values.length == 0) {
            throw new EmptyArrayException();
        }

        for(Double value : values) {
            x += value;
        }

        return x / values.length;
    }

    public static double median(double... values) {
        double x = 0;

        Sorter sorter = new Sorter(values);
        values = sorter.selectionSort();

        if(values.length % 2 == 1) {
            x = values[values.length / 2];
        } else {
            int lesser = (int) Math.floor(values.length / 2);
            int greater = (int) Math.ceil(values.length / 2);
            x = arithmeticMean(values[lesser], values[greater]);
        }

        return x;
    }

    public static double mode(double... values) {
        // possible strategies: replace with bucketsortstyleapproach
        double mode = 0;
        int occurrences = 0;
        int oldOccurrences = 0;

        for(int i = 0; i < values.length; i++) {

            for(int j = 0; j < values.length; j++) {
                if(i != j) {
                    if(values[i] == values[j]) {
                        occurrences++;

                        // W: inefficient
                        if(occurrences > oldOccurrences) {
                            mode = values[j];
                            oldOccurrences = occurrences;
                        }
                    }
                }
            }
            occurrences = 0;
        }

        return mode;
    }
}
