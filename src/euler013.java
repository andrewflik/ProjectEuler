/*
    Author - Devesh
    Problem - 013
    Time Complexity - O(n)
*/
import java.math.BigInteger;
import java.util.Scanner;
public class euler013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger bg = new BigInteger("0");
        BigInteger k = new BigInteger("0");
        int n; String s, in;
        n = sc.nextInt();
        s = sc.nextLine(); // Escape '\n'
        for(int i=0; i<n; i++){
            bg = sc.nextBigInteger();
            k = k.add(bg);
        }
        in = k.toString();
        System.out.println(in.substring(0, 10));
    }
}
