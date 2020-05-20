/*
    Author - Devesh
    Problem - Euler 006
    Time Complexity - O(1)
*/

import java.util.Scanner;
public class euler006 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t;
        t = inp.nextInt();
        while(t-- > 0){
            int n;
            n = inp.nextInt();
            long squareOfSum = (long)Math.pow((((long)n*(n+1))/2), 2);
            long sumOfSquares = (((long)n*(n+1)*(2*n+1))/6);
            System.out.println(squareOfSum - sumOfSquares);
        }
    }
}
