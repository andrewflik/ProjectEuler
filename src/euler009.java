/*
    Author - Devesh
    Problem - Euler 009
    Time Complexity - O(n/3)
*/

import java.util.Scanner;
public class euler009 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t;
        t = inp.nextInt();
        while(t-- > 0){
            int n, p = -1;
            n = inp.nextInt();
            // 3a < n -> a < n/3
            // and hence check till a <= n/3 only
            for(int a=1, b, c; a <= n/3; a++){
                b = (n * n - 2 * n * a) / (2 * n - 2 * a);
                c = n - (a + b);
                if ((a * a + b * b) == c * c)
                    p = Math.max(p, a * b * c);
            }
            System.out.println(p);
        }
    }
}
