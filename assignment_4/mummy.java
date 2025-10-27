package assignment_4;

import java.util.Scanner;

public class mummy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        boolean result = lower(arr, n);
        System.out.println(result);
    }
    public static boolean lower(int [][]arr, int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i][j] !=0){
                    return false;
                }
            }
        }
        return true;
    }
}
