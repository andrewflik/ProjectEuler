/*
    Author - Devesh
    Problem - Euler 011
    Time Complexity - O(n*n)
*/

import java.util.Scanner;
public class euler011 {
    static int mat[][] = new int[21][21];
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        for(int i=1; i<=20; i++)
            for(int j=1; j<=20; j++)
                mat[i][j] = inp.nextInt();

        int max = 1, pl = 1, pr = 1, pu = 1, pd = 1, pa = 1, pb = 1, pc = 1, pd_ = 1;
        for(int i=1; i<=20; i++){
            for(int j=1; j<=20; j++){
                // Left
                if(j >= 4){
                    pl = mat[i][j] * mat[i][j-1] * mat[i][j-2] * mat[i][j-3];
                }
                // Right
                if(j <= 16){
                    pr = mat[i][j] * mat[i][j+1] * mat[i][j+2] * mat[i][j+3];
                }
                // Up
                if(i >= 4){
                    pu = mat[i][j] * mat[i-1][j] * mat[i-2][j] * mat[i-3][j];
                }
                // Down
                if(i <= 16){
                    pd = mat[i][j] * mat[i+1][j] * mat[i+2][j] * mat[i+3][j];
                }
                // a - Diagonal
                if(j < 17 &&  i > 3){
                    pa = mat[i][j] * mat[i-1][j+1] * mat[i-2][j+2] * mat[i-3][j+3];
                }
                // b - Diagonal
                if(j > 3 &&  i > 3){
                    pb = mat[i][j] * mat[i-1][j-1] * mat[i-2][j-2] * mat[i-3][j-3];
                }
                // c - Diagonal
                if(j > 3 &&  i < 17){
                    pc = mat[i][j] * mat[i+1][j-1] * mat[i+2][j-2] * mat[i+3][j-3];
                }
                // d - Diagonal
                if(i < 17 &&  j < 17){
                    pd_ = mat[i][j] * mat[i+1][j+1] * mat[i+2][j+2] * mat[i+3][j+3];
                }
                max = Math.max(max, pl);
                max = Math.max(max, pr);
                max = Math.max(max, pu);
                max = Math.max(max, pd);
                max = Math.max(max, pa);
                max = Math.max(max, pb);
                max = Math.max(max, pc);
                max = Math.max(max, pd_);
            }
        }
        System.out.println(max);
    }
}
