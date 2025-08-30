//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] integers = {5, 2, -1, 0, 3};
        BinarySearch search = new BinarySearch();
        // System.out.println(search.binarySearch(integers, 11));

        SlidingWindow sum = new SlidingWindow();
        sum.fixedWindow(integers, 3);

    }
}