package assignment_4;

import java.util.Scanner;

public class search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m = sc.nextInt();
        int [][]arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int x= sc.nextInt();

        if(serch(arr, n, m, x)){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }

    }
    public static boolean serch(int [][]arr,int n,int m,int x){
        int i=0;
        int j =m-1;
        while(i<n && j>=0){
            if(arr[i][j] == x){
                return true;
            }
            else if(arr[i][j]>x){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }
}
