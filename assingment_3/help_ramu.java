package assingment_3;

import java.util.Scanner;

public class help_ramu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 

        while (t > 0) {

            int[] costs = new int[4];
            for (int i = 0; i < 4; i++) {
                costs[i] = sc.nextInt();
            }

            int n = sc.nextInt(); 
            int m = sc.nextInt(); 

            int[] rickshaw = new int[n];
            for (int i = 0; i < n; i++) {
                rickshaw[i] = sc.nextInt();
            }

            int[] cab = new int[m];
            for (int i = 0; i < m; i++) {
                cab[i] = sc.nextInt();
            }
            t--;
            transport(costs, rickshaw, cab);
        }
        
    }
    public static void transport(int []costs,int []rickshaw,int []cab){
        int c1 = costs[0];
        int c2 = costs[1];
        int c3 = costs[2];
        int c4 = costs[3];

        int rickshaw_Cost = 0;
        for(int i=0;i<rickshaw.length;i++){
            rickshaw_Cost += Math.min(rickshaw[i]*c1,c2);
        }
        rickshaw_Cost = Math.min(rickshaw_Cost,c3);

        int cab_cost = 0;
        for(int i=0;i<cab.length;i++){
            cab_cost += Math.min(cab[i] *c1,c2);
        }
        cab_cost = Math.min(cab_cost,c3);

        int total = Math.min(rickshaw_Cost + cab_cost, c4);
        System.out.println(total);
    }
}
