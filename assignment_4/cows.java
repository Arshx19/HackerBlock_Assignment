package assignment_4;

import java.util.Arrays;
import java.util.Scanner;

public class cows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nos = sc.nextInt();  //no. of stall
        int noc = sc.nextInt();  // no. of cows

        int [] stall = new int[nos];
        for(int i=0;i<stall.length;i++){
            stall[i] =sc.nextInt();
        }
        Arrays.sort(stall);
        System.out.println(maximumDistance(stall, noc));

    }
    public static int maximumDistance(int []stall,int noc){
        int n= stall.length;
        int lo=0;
        int hi = stall[n-1] - stall[0];
        int ans=0;
        while (lo<=hi) {
            int mid = (lo +hi)/2;
            if(isitpossible(stall,noc,mid)){
                ans =mid;
                lo = mid +1;
            }
            else{
                hi = mid -1;
            }        
        }
        return ans;
    }
    public static boolean isitpossible(int []stall, int noc,int mid){
        int pos=stall[0];
        int cow =1;
        for(int i=1;i<stall.length;i++){
            if(stall[i]-pos>=mid){
                cow++;
                pos =stall[i];
            }
            if(noc ==cow){
                return true;
            }
        }
        return false;
    }
}
