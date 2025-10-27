package assignment_4;

import java.util.Scanner;

public class spiral2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m= sc.nextInt();
        int [][]arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j =0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        spiral(arr, n, m);

    }
    public static void spiral(int [][]arr,int n,int m){
        int top=0;
        int left=0;
        int right =m-1;
        int bot = n-1;

        while(left<=right && top<=bot){
            for(int i=left;i<=right;i++){
                System.out.print(arr[top][i] + ", ");
            }
            top++;
            for (int i = top; i <= bot; i++) {
                System.out.print(arr[i][right] + ", ");
            }
            right--;
            if (top <= bot) {
                for (int i = right; i >= left; i--) {
                    System.out.print(arr[bot][i] + ", ");
                }
                bot--;
            }
            if (left <= right) {
                for (int i = bot; i >= top; i--) {
                    System.out.print(arr[i][left] + ", ");
                }
                left++;
            }
        }
        System.out.print("END");
    }
}