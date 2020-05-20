/*
    Author - Devesh
    Problem - Euler 007
    Time Complexity - O(nlogn)
*/

import java.util.Scanner;
import java.util.ArrayList;
public class euler007 {
    static int ar[] = new int[10000007];
    static ArrayList<Integer> primes = new ArrayList<Integer>();
    static void sieve(){
        for(int i=2; i<10000007; i++)
            ar[i] = 1;
        for(int i=2; i<10000007; i++){
            if(ar[i] == 1){
                primes.add(i);
                for(int j=i+i; j<10000007; j+=i){
                    ar[j] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        sieve();
        Scanner inp = new Scanner(System.in);
        int t;
        t = inp.nextInt();
        while(t-- > 0){
            int n;
            n = inp.nextInt();
            System.out.println(primes.get(n-1));
        }
    }
}
