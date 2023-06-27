import java.util.Arrays;

public class Question1 {
    public static void ans(int[] arr) {
        int lastNIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[lastNIndex];
                arr[lastNIndex] = temp;
                lastNIndex++;
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {0,1,0,3,12};
        ans(arr);
        System.out.println(Arrays.toString(arr));
    }
}
