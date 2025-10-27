package assignment_4;

import java.util.Scanner;

public class book {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {
            int nob = sc.nextInt();      // number of books
            int nos = sc.nextInt();      // number of students
            int[] page = new int[nob];
            for (int i = 0; i < nob; i++) {
                page[i] = sc.nextInt();
            }
            System.out.println(MinimumPage(page, nos));
        }

        sc.close();
    }

    public static int MinimumPage(int[] page, int nos) {
        int lo = 0;
        int hi = 0;
        int maxBook = 0;
        for (int p : page) {
            hi += p;
            maxBook = Math.max(maxBook, p);
        }
        lo = maxBook;

        int ans = hi;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (isPossible(page, nos, mid)) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }

    public static boolean isPossible(int[] page, int nos, int mid) {
        int student = 1;
        int readPage = 0;
        for (int i = 0; i < page.length; i++) {
            if (readPage + page[i] <= mid) {
                readPage += page[i];
            } else {
                student++;
                readPage = page[i];
                if (student > nos) return false;
            }
        }
        return true;
    }
}
