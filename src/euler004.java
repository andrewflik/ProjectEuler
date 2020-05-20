/*
    Author - Devesh
    Problem - Euler 004
    Time Complexity - O(nlogn)
*/

import java.util.Scanner;
import java.lang.Math;

public class euler004 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t;
        t = inp.nextInt();
        while(t-- > 0){
            long n, temp = 1000, ans = 101101;
            n = inp.nextLong();
            boolean flag = false;
            for(long i=999; i>=101 && !flag; i--, temp=1000){
                temp *= i;
                temp += rev(i);
                if (temp >= n)
                    continue;
                for (long j = 999; j >= 101; j--) {
                    if (temp % j == 0) {
                        if (temp / j < 1000) {
                            ans = temp;
                            flag = true;
                            // System.out.println(j + "/" + temp / j + " = " + ans);
                            break;
                        }
                    }
                }
           }
            System.out.println(ans);
        }
    }
    static long rev(long n){
        long t = n, a = 0;
        while(t > 0){
            a = a*10 + t%10;
            t /= 10;
        }
        return a;
    }
}
