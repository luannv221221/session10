package ra.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,1,4,6,2};
        
        // sap xep mang tang dan voi giai thuat bubble sort
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr.length - 1 -i ; j++) {
                if(arr[j] > arr[j+1]){
                    // đổi vị trí
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
