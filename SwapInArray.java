import java.util.Arrays;

public class SwapInArray {
    public static void main(String[] args) {
        int[] arr = {3, 4, 7, 9, 8};
        swap(arr, 2,4);
        System.out.println(Arrays.toString(arr));
    }

        static void swap(int[] arr, int index1 , int index2){
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
            
    }
}
