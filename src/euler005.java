/*
    Author - Devesh
    Problem - Euler 005
    Time Complexity - O(nlogn)
*/

import java.util.Scanner;
public class euler005 {
    static long ar[] = new long[41];
    static void solve(){
        for(int i=1; i<=40; i++)
            ar[i] = i;
        for(int i=3; i<=40; i++){
            ar[i] = lcm(ar[i-1], ar[i]);
            System.out.print(ar[i] + " ");
        }
    }
    static long lcm(long a, long b){
        return (a*b)/gcd(a, b);
    }
    static long gcd(long a, long b){
        if(a == 0)
            return b;
        return gcd(b%a, a);
    }
    public static void main(String[] args) {
        solve();
        Scanner inp = new Scanner(System.in);
        int t;
        t = inp.nextInt();
        while(t-- > 0){
            int n;
            n = inp.nextInt();
            System.out.println(ar[n]);
        }
    }
}
