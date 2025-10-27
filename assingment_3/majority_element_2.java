package assingment_3;

import java.util.Arrays;
import java.util.Scanner;

public class majority_element_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        frequnecyElement(nums, n);

    }
    public static void frequnecyElement(int []nums, int n){
        // int m = nums.length;
        int freq = n/3;
        int count = 0;
        int [] unique = new int[n];
        int [] frq = new int[n];

        for(int i=0;i<n;i++){
            int j;
            for(j=0;j<count;j++){
                if(nums[i] == unique[j]){
                    frq[j]++;
                    break;
                }
            }
            if(j== count){
                unique[count] = nums[i];
                frq[count] = 1;
                count++;
            }
        }
        Arrays.sort(frq); 
        for(int i=0;i<count;i++){
            if(frq[i] >freq){
                System.out.print(unique[i] + " ");
            }
        }
    }
    
}
