package mathLib.statistics;

import mathLib.ArrayMismatchException;

/**
 * Created by softish on 2016-06-16.
 */
public class DataSetComparison {

    // dat identifier... dat comment... *facepalm*
    private static double sumSimilarToStandardDeviation(double[] values) {
        double sum = 0.0;

        for (int i = 0; i < values.length; i++) {
            sum += Math.pow(values[i] - Average.arithmeticMean(values), 2);
        }
        
        return sum;
    }

    /**
     * Calculates correlational coefficient between two data sets in search of linear relationship.
     * Definded in the following interval -1 <= rxy <= 1.
     *
     * @param x first data set
     * @param y second data set
     * @return correlational coefficient
     * @throws ArrayMismatchException if data sets are of different sizes.
     */
    public static double correlationalCoefficient(double[] x, double[] y) throws ArrayMismatchException {
        if(x.length != y.length) {
            throw new ArrayMismatchException();
        }

        double rxy;
        double sum = 0.0;

        for (int i = 0; i < x.length; i++) {    // Q: Alternatively: i < x.length && i < y.length;
            sum += ((x[i] - Average.arithmeticMean(x)) * (y[i] - Average.arithmeticMean(y)));
        }

        rxy = sum / (Math.sqrt(sumSimilarToStandardDeviation(x)) * Math.sqrt(sumSimilarToStandardDeviation(y)));

        return rxy;
    }

    public static boolean hasLinearRelationship(double correlationalCoefficient) {
        if(correlationalCoefficient > 0.5 || correlationalCoefficient < -0.5) {
            return true;
        }

        return false;
    }

    public static double covariance(double[] x, double[] y) throws ArrayMismatchException {
        if(x.length != y.length) {
            throw new ArrayMismatchException();
        }

        double cxy;
        double sum = 0.0;
        double avgX = Average.arithmeticMean(x), avgY = Average.arithmeticMean(y);

        for (int i = 0; i < x.length; i++) {
            sum += ((x[i] - avgX) * (y[i] - avgY));
        }

        cxy = sum / x.length;

        return cxy;
    }
}
