public class Main {
    public static void main(String[] args) {
        long[] sales = {500, 200, 600, 1000};
        SalesManager salesMan = new SalesManager(sales);
        System.out.println("Расчет среднего: " + salesMan.statistik());
    }
}
