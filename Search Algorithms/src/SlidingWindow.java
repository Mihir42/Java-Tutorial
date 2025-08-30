public class SlidingWindow {

    public void fixedWindow(int[] arr, int k) {
        if(arr.length < k) {
            System.out.println("Window is bigger then array length, not possible to compile");
        } else {
            int sum = 0;

            // Initial window
            for(int i = 0; i < k; i++) {
                sum += arr[i];
            }

            System.out.println(sum);

            // Moving window
            for(int i = k; i < arr.length; i++) {
                sum = sum + arr[i];
                sum = sum - arr[i - k];
                System.out.println(sum);
            }
        }
    }

    public void dynamic(int[] arr) {

    }
}
