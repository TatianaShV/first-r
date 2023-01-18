public class Main {
    public static void main(String[] args) {

SalesManager salesManager = new SalesManager(new long[] {60, 9, 100, 90});
long max = salesManager.max();

        System.out.println(max);
        long min = salesManager.min();
        long average = salesManager.average();
        System.out.println(min);
        System.out.println(average);
    }
}