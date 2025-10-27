package assignment_4;

import java.util.Scanner;

public class Kth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            
            long n =sc.nextLong();
            long k= sc.nextLong();
            
            System.out.println(root(k, n));
        }

    }
    public static long power(long x,long k){
        long res =1;
        for(long i=0;i<k;i++){
            if(res>Long.MAX_VALUE/x) return Long.MAX_VALUE;
            res *=x;
        }
        return res;
    }
    public static long root(long k,long n){
        long left =1;
        long right =n;
        long ans =0;
        while(left<=right){
            long mid = left + (right-left)/2;
            if(power(mid, k)<=n){
                ans = mid;
                left = mid+1;
            }
            else{
                right =mid-1;
            }
        }
        return ans;
    }
}
