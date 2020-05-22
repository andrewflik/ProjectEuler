/*
	Author - Devesh
	Problem - 012 
	Time Complexity - O(nlogn + logn)
 */

/*
 Since n & n+1 are co-prime, there prime factors will be distinct and hence
 our problem splits into prime factorization of two smaller number and we can also
 store the results of them, to reuse them again.
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
/*int totalFactorInit(int x){
	if(x&1)
		return totalFactor(x) * totalFactor((x+1)/2);
	else
		return totalFactor(x/2) * totalFactor(x+1);
}*/
int solve(int n){
	int number = 1;
int i = 2;
int cnt = 0;
int Dn1 = 2;
int Dn = 2; 
while (cnt <= n) {
    if (i % 2 == 0) {
        Dn = totalFactor(i + 1);
        cnt = Dn * Dn1;
    } else {
        Dn1 = totalFactor((i + 1) / 2);
        cnt = Dn*Dn1;
    }
    i++;
}
number = i * (i - 1) / 2;
return number;/*
		int x = 1;
	while(totalFactorInit(x) <= n){
//		cout << x << " : " << totalFactorInit(x) << endl;
		x++;
	}
	return (x*(x+1))/2;*/
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
