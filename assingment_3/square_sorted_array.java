package assingment_3;

import java.util.Arrays;
import java.util.Scanner;

public class square_sorted_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        square(arr, n);

    }
    public static void square(int [] arr,int n){
        for(int i=0;i<n;i++){
            arr[i] = arr[i]*arr[i];
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }

}
