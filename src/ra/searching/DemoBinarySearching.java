package ra.searching;

import java.util.Scanner;

public class DemoBinarySearching {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao gia tri can tim ");
        int searchNumber = Integer.parseInt(scanner.nextLine());
        int mid;
        int low = 0;
        int high = arr.length - 1;
        boolean check = false;
        while (low <= high){
            // tim ra mid
            mid = (low + high) / 2;
            if(arr[mid] == searchNumber){
                System.out.println("Phan tu "+searchNumber+"nam o vi tri"+mid);
                check = true;
                break;
            }
            if(arr[mid] < searchNumber){
                low = mid + 1;
            } else{
                high = mid - 1;
            }
        }
    }
}
