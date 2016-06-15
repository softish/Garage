package mathLib;

/**
 * Created by softish on 2016-06-15.
 *
 * (Could perhaps be designed to accept any data type)
 */
public class Sorter {
    private double[] dataset;

    public Sorter(double[] dataset) {
        this.dataset = dataset;
    }

    public double[] selectionSort() {

        for(int spot = 0; spot < dataset.length - 1; spot++) {
            int posMin = spot;

            for(int next = spot; next < dataset.length; next++) {
                if(dataset[spot] < dataset[posMin]) {
                    posMin = next;
                }
            }

            swap(spot, posMin);
        }

        return dataset;
    }

    private void swap(int source, int destination) {
        double tmp = dataset[source];
        dataset[source] = dataset[destination];
        dataset[destination] = tmp;
    }

    // tmp
    public boolean isSorted(double[] dataset) {
        if(dataset == null || dataset.length == 0) {
            return true;
        }

        boolean sorted = true;
        double previous = dataset[0];

        for (int i = 0; i < dataset.length; i++) {
            if(previous > dataset[i]) {
                sorted = false;
            }
        }

        return sorted;
    }
}
