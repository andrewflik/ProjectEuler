/*
    Author - Devesh
    Problem - 013
    Time Complexity - O(n)
*/

import java.util.Scanner;
public class euler014 {
    static int si = 5000005;
    static int ar[] = new int[si];
    static int maxx[] = new int [si];
    public static void main(String[] args) {
        init();
        Scanner inp = new Scanner(System.in);
        int t;
        t = inp.nextInt();
        while(t-- > 0){
            int n;
            n = inp.nextInt();
            System.out.println(maxx[n]);
        }
    }
    static void init() {
        ar[0] = ar[1] = 1;
        for(int i=2; i<si; i++){
            if(ar[i] == 0)
                ar[i] = solve((long)i) - 1;
            // System.out.println(i + " " + ar[i]);
        }
        maxx[1] = 1;
        for(int i=2; i<si; i++){
            if(ar[i] >= ar[maxx[i-1]])
                maxx[i] = i;
            else
                maxx[i] = maxx[i-1];
        }
    }
    static int solve(long n){
        if(n == 1)
            return 1;
        // Return Precomputed Value
        if(n < si) {
            if (ar[(int)n] != 0)
                return ar[(int)n] + 1;
            if(((int)n&1) == 1)
                ar[(int)n] += solve(n*3+1);
            else
                ar[(int)n] += solve((int)n/2);
            return ar[(int)n] + 1;
        }
        else{
            long p = n;
            int j;
            if((p&1) == 1)
                j = solve(n*3+1);
            else
                j = solve(n/2);
            return j + 1;
        }
    }
}
