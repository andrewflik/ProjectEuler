/*
	Author - Devesh
	Problem - 012 
	Time Complexity - O(nlogn + logn)
 */
#include<bits/stdc++.h>
using namespace std;
const int size = 1e5+5;
bool prime[size];
vector<int> facts;
void sieve(){
	fill(prime, prime+size, true);
	prime[1] = false;
	for(int i=2; i<=sqrt(size); i++){
		if(prime[i]){
			facts.push_back(i);
			for(int j=i*2; j<size; j+=i)
				prime[j] = false;		
		}
	}
}
int totalFactor(int x){
	int tot = 1;
	if(x == 1)
		return 1;
	if(x <= 3)
		return 2;
	int p = 1;
	for(auto n: facts){
		int c = 1;
		while(x%n == 0)
			x /= n, c++;
		p *= c;
	}
	if(x > 1)
		p *= (1+1);
	return p;
}
int solve(int n){
	int x = 1, d = 2;
	while(totalFactor(x) <= n){
		x += d;
		d++;
	}
	return x;
}
int main(){
	sieve();
	int t;
	cin >> t;
	while(t--){
		int n;
		cin >> n;
		cout << solve(n) << endl;
	}
}
