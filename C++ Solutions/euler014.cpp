/*
	Author - Devesh
	Problem - 014
	Time Complexity - O(n*depth of recursion)
*/
#include<bits/stdc++.h>
#define ll long
using namespace std;
const int si = 5000005;
ll ar[si];
ll maxx[si];
ll dp(ll n){
    if(n == 1)
        return 1;
    // Return Precomouted Value
    if(n < si){
		// Important -> Would cause segmentation fault since the value of
		// n can go large, so be careful not to query it on array rather
		// put a condition so as to avoid segmentation fault!
        if(ar[n] != 0)
            return ar[n] + 1;
		if(n&1)
			ar[n] += dp(n*3+1);
		else
			ar[n] += dp(n/2);
		return ar[n] + 1;
    }
    else{
        ll p = n, j;
        if(p&1)
            j = dp(n*3+1);
        else
            j = dp(n/2);
        return j + 1;
    }
}
void init(){
    fill(ar, ar+si, 0);
    fill(maxx, maxx+si, 0);
    for(int i=2; i<si; i++){
        if(ar[i] == 0)
            ar[i] = dp(i) - 1;
    //    cout << i << " : " << ar[i] << endl;
    }
    // Store max
    maxx[1] = 2;
    for(int i=2; i<si; i++){
        if(ar[i] >= ar[maxx[i-1]])
            maxx[i] = i;
        else
            maxx[i] = maxx[i-1];
       // cout << ar[i] << " " << ar[maxx[i]] << endl;
    }
}
int main(){
    init();
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        cout << maxx[n] <<endl;
    }
}



