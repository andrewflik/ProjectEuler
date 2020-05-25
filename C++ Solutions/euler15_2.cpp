/*
    Author - Devesh
    Problem - 015
    Time Complexity -  O(n*n)
*/
/*Iterative Approach to Problem 15*/
/*Warning : Take modulus corectly */
/*	(a+b)%m = (a%m + b%m)%m		*/
#include<bits/stdc++.h>
#define mod 1000000007
using namespace std;
int dp[501][501];
void init(){
    dp[1][1] = 2;
    for(int i=2; i<=500; i++)
        dp[1][i] = 1;
    for(int j=2; j<=500; j++)
        dp[j][1] = 1;
}
int main(){
    init();
    int t;
    cin >> t;
    while(t--){
        int n, m, sum = 0;
        cin >> n >> m;
        for(int i=2; i<=n; i++)
            for(int j=2; j<=m; j++)
                dp[i][j] = (dp[i][j-1]%mod + dp[i-1][j]%mod)%mod;
        // Total Sum
        for(int i=1; i<=n; i++)
            for(int j=1; j<=m; j++)
                sum = (sum%mod + dp[i][j]%mod) % mod;
        cout << sum%mod << endl;
    }
}


