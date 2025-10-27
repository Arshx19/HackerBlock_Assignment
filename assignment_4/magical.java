package assignment_4;

import java.util.Scanner;

public class magical {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int s = sc.nextInt();
        sc.nextLine();

        char[][] arr = new char[n][m];
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = line.charAt(j);
            }
        }

        int remainingStrength = park(arr, n, m, s, k);
        if (remainingStrength != -1) {
            System.out.println("Yes");
            System.out.println(remainingStrength);
        } else {
            System.out.println("No");
        }
    }

    public static int park(char[][] arr, int n, int m, int s, int k) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                char cell = arr[i][j];

                if (cell == '#') {
                    break;
                }

                s--;

                if (cell == '.') {
                    s -= 2;
                } else if (cell == '*') {
                    s += 5;
                }

                if (s < k) {
                    return -1;
                }
            }
        }
        return s;
    }
}
