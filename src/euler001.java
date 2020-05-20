/*
    Author - Devesh
    Problem - Euler 001
    Time Complexity - O(1)
*/

import java.util.Scanner;
public class euler001 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t;
        t = inp.nextInt();
        while(t-- > 0){
            long n;
            n = inp.nextLong();
            --n;
            // S3 + S5 - S15 -> Inclusion-Exclusion Principle
            long s3 = ((n/3)*(6+(n/3-1)*3))/2;
            long s5 = ((n/5)*(10+(n/5-1)*5))/2;
            long s15 = ((n/15)*(30+(n/15-1)*15))/2;
            System.out.println(s3 + s5 - s15);
        }
    }
}
