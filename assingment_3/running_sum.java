package assingment_3;

import java.util.Scanner;

public class running_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int []nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        sum(nums, n);

        for(int i=0;i<n;i++){
            System.out.print(nums[i]+ " ");
        }

    }
    public static void sum(int []nums,int n){
        for(int i=1 ;i<n;i++){
            nums[i] = nums[i] + nums[i-1];
        }
        
    }
}
