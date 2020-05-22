/*
    Author - Devesh
    Problem - Euler 012
    Time Complexity - O(nlogn)
*/

import java.util.*;

public class euler012 {
    static int primes[] = new int[10005];
    static int dp[] = new int[100005];
    static ArrayList<Integer> ar = new ArrayList<>();
    static void sieve(){
        Arrays.fill(dp, 0);
        Arrays.fill(primes, 1);
        for(int i=2; i<10005; i++){
            if(primes[i] == 1) {
                ar.add(i);
                for (int j = i + i; j < 10005; j += i) {
                    primes[j] = 0;
                }
            }
        }
    }
    static int totalFactors(int n){
        if(dp[n] != 0)
            return dp[n];
        int c = 1, p = 1, pos = n;
        for(int x: ar){
            c = 1;
            while(n%x == 0){
                n /= x; c++;
            }
            p *= c;
        }
        if(n > 1)
            p *= 2;
        dp[pos] = p;
        return p;
    }
    static int totalFactorsInit(int x){
        if(x%2 == 1)
            return totalFactors((x+1)/2) * totalFactors(x);
        else
            return totalFactors(x/2) * totalFactors(x+1);
    }
    static int solve(int n){
        int i = 1;
        while(totalFactorsInit(i) <= n){
            i++;
        }
        return (i*(i+1))/2;
    }
    public static void main(String[] args) {
        sieve();
        Scanner inp = new Scanner(System.in);
        int t;
        t = inp.nextInt();
        while(t-- > 0){
            int n;
            n = inp.nextInt();
            System.out.println(solve(n));
        }
    }
}
