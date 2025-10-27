package assingment_3;

import java.util.Scanner;

public class Inverse_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int [] result = Inverse(arr, n);
        for(int i=0;i<n;i++){
            System.out.print(result[i] + " ");
        }

    }
    public static int[] Inverse(int []arr,int n){
        int []inv = new int[n];
        for(int i=0;i<n;i++){
            inv[arr[i]] =i;
        }
        return inv;
    }
}
