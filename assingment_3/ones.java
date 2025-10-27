package assingment_3.sorted_zeres;

import java.util.Arrays;
import java.util.Scanner;

public class ones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sorted(arr, n);
    }
    public static void sorted(int []arr,int n){
        Arrays.sort(arr);

        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
