package assingment_3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class pair_of_roses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n =sc.nextInt();
            int [] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int mo = sc.nextInt();
            roses(arr, n, mo);
            System.out.println();
            t--;
        }
    }
    public static void roses(int[] arr, int n, int mo) {
    Arrays.sort(arr); 

    int left = 0;
    int right = n - 1;
    int pair1 = 0;
    int pair2 = 0;
    int minDiff = Integer.MAX_VALUE;

    while (left < right) {
        int sum = arr[left] + arr[right];
        if (sum == mo) {
            int diff = arr[right] - arr[left];
            if (diff < minDiff) {
                minDiff = diff;
                pair1 = arr[left];
                pair2 = arr[right];
            }
            left++;
            right--;
        } else if (sum < mo) {
            left++;
        } else {
            right--;
        }
    }

    System.out.println("Deepak should buy roses whose prices are " + pair1 + " and " + pair2 + ".");
}

}
