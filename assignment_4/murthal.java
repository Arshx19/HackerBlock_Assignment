package assignment_4;

import java.util.Scanner;

public class murthal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int L = sc.nextInt();
        int[] R = new int[L];
        int maxRank = 0;
        for (int i = 0; i < L; i++) {
            R[i] = sc.nextInt();
            if (R[i] > maxRank) maxRank = R[i];
        }

        System.out.println(minTime(P, L, R, maxRank));
    }

    public static int minTime(int P, int L, int[] R, int maxRank) {
        int low = 0;
        int high = maxRank * P * (P + 1) / 2;
        int ans = high;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (canCook(P, L, R, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static boolean canCook(int P, int L, int[] R, int time) {
        int total = 0;

        for (int i = 0; i < L; i++) {
            int t = time;
            int rank = R[i];
            int k = 1;

            while (t >= k * rank) {
                t -= k * rank;
                total++;
                k++;
            }
        }

        return total >= P;
    }
}
