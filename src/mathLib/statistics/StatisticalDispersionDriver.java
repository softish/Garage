package mathLib.statistics;

/**
 * Created by softish on 2016-06-16.
 */
public class StatisticalDispersionDriver {

    public static void main(String[] args) {
        System.out.println("std.dev.pop: ");
        System.out.println(StatisticalDispersion.standardDeviationPopulation(1, 2, 3, 4));

        System.out.println("var.pop: ");
        System.out.println(StatisticalDispersion.variancePopulation(1, 2, 3, 4));

        System.out.println("std.dev.smpl: ");
        System.out.println(StatisticalDispersion.standardDeviationSample(1, 2, 3, 4));

        System.out.println("var.smpl: ");
        System.out.println(StatisticalDispersion.varianceSample(1, 2, 3, 4));
    }
}
