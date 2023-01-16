public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new int[]{60, 9, 100, 90});
        int max = salesManager.max();
        System.out.println(max);
        int min = salesManager.min();
        int average = salesManager.average();
        System.out.println(min);
        System.out.println(average);
    }
}