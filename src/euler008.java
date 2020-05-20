/*
    Author - Devesh
    Problem - Euler 008
    Time Complexity - O(n*k)
*/

import java.util.Scanner;
public class euler008 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t;
        t = inp.nextInt();
        while(t-- > 0){
            int n, k;
            long a = 0, ans = 1;
            String s, aa;
            n = inp.nextInt();
            k = inp.nextInt();
            aa = inp.nextLine();
            s = inp.nextLine();
            for(int i=0; i<n-k; i++){
                ans = 1;
                for(int j=i; j<k+i; j++){
                    ans *= s.charAt(j) - '0';
                }
                if(ans > a)
                    a = ans;
            }
            System.out.println(a);
        }
    }
}
