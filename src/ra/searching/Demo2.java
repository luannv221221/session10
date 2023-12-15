package ra.searching;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        // nhapaj vao 1 so bat ky tu ban phim kiem tra so do co ton tai trong mang hay khong
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                System.out.println(num+"co trong mang");
                check = true;
                break;

            }
        }
        if(!check){
            System.out.println("Khong tim thay");
        }
    }
}
