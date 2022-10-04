import java.util.stream.IntStream;

public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }

        return max;
    }

    public int min() {
        int min = 1000;
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }

        return min;
    }

    public int statistik() {
        int statistik = (IntStream.of(sales).sum() - max() - min()) / (sales.length - 2);
        return statistik;
    }
}
