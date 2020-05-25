/*
    Author - Devesh
    Problem - O(n*n)
    Time Complexity -     
*/
#include<bits/stdc++.h>
#define mod 1000000007
using namespace std;
int dp[501][501];
void init(){
    for(int i=1; i<=500; i++)
        for(int j=1; j<=500; j++)
            dp[i][j] = 0;
}
int solve(int n, int m, int i, int j){
    int s = 0;
    if(dp[i][j] != 0)
        return dp[i][j];
    if(i == n && j == m)
        return 1;    // Base Case
    
    // Right
    if(j+1 <= m)
        s += solve(n, m, i, j+1);
    // Down
    if(i+1 <= n)
        s += solve(n, m, i+1, j);
    if(dp[i][j] == 0)
        dp[i][j] = s%mod;
    return s%mod;
}
int main(){
    init();
    int t;
    cin >> t;
    while(t--){
        int n, m;
        cin >> n >> m;
        cout << solve(n+1, m+1, 1, 1)%mod << endl;
        init();	// Reset DP states
    }
}

