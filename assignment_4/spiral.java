package assignment_4;

import java.util.Scanner;

public class spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int [][]arr = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        spiral(arr, row, col);

    }
    public static void spiral(int [][]arr ,int row,int col){
        int left=0;
        int top=0;
        int right = col-1;
        int bot = row-1;

        while(left<=right && top<=bot){
            for(int i=top;i<=bot;i++){
                System.out.print(arr[i][left] + ", ");
            }
            left++;
            for(int i=left;i<=right;i++){
                System.out.print(arr[bot][i] + ", ");
            }
            bot--;
            if(left<=right){
                for(int i=bot;i>=top;i--){
                    System.out.print(arr[i][right] + ", ");
                }
                right--;
            }
            if(top<=bot){
                for(int i=right;i>=left;i--){
                    System.out.print(arr[top][i] + ", ");
                }
                top++;
            }
        }
        System.out.print("END");
    }
}
