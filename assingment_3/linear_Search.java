package assingment_3;

import java.util.Scanner;

public class linear_Search{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(linear(arr, n, target));
    }
    public static int linear(int [] arr,int n,int target){
        for(int i =0;i<n;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}