/*
    Author - Devesh
    Problem - Euler 005
    Time Complexity - O(nlogn)
*/

import java.util.Scanner;
import java.lang.Math;
public class euler005_2 {
    static boolean primes[] = new boolean[42];
    static void sieve(){
        // Initialize
        for(int i=1; i<=40; i++)
            primes[i] = true;

        for(int i=2; i<=Math.sqrt(40); i++){
            if(primes[i]) {
                for (int j = i + i; j <= 40; j += i) {
                    primes[j] = false;
                }
            }
        }
    }
    static void solve(int n){
        long min = 1;
        for(int i=2; i<=n; i++){
            long ans = i, curr = i;
            if(primes[i]){
                long k = (long)i;
                while(n >= ans){
                    curr = ans;
                    ans *= k;
                }
                min *= curr;
            }
        }
        System.out.println(min);
    }
    public static void main(String[] args) {
        sieve();
        Scanner inp = new Scanner(System.in);
        int t;
        t = inp.nextInt();
        while(t-- > 0){
            int n;
            n = inp.nextInt();
            solve(n);
        }
    }
}
