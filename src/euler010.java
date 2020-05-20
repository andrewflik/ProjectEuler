/*
    Author - Devesh
    Problem - Euler 010
    Time Complexity - O(nlogn)
*/

import java.util.Scanner;
public class euler010 {
    static int ar[] = new int[1000005];
    static long pre[] = new long[1000005];
    static void sieve(){
        for(int i=1; i<1000005; i++) {
            ar[i] = 1;
            pre[i] = 0;
        }
        for(int i=2; i<1000005; i++){
            if(ar[i] == 1){
                pre[i] = (long)i;
                for(int j=i+i; j<1000005; j+=i){
                    ar[j] = 0;
                }
            }
        }
        for(int i=1; i<1000005; i++)
            pre[i] += pre[i-1];
    }
    public static void main(String[] args) {
        sieve();
        Scanner inp = new Scanner(System.in);
        int t;
        t = inp.nextInt();
        while(t-- > 0){
            int n, p = -1;
            n = inp.nextInt();
            System.out.println(pre[n]);
        }
    }
}
