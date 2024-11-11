#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
const int MOD = 1e9 + 7;

ll getFib(int n) {
    if (n == 1) return 1;
    if (n == 2) return 2;
    
    ll a = 1, b = 2;
    for (int i = 3; i <= n; i++) {
        ll temp = b;
        b = a + b;
        a = temp;
    }
    return b;
}

int calculateX(ll target) {
    vector<ll> fibs;
    ll curr = 1;
    int idx = 1;
    while (curr <= target) {
        fibs.push_back(curr);
        idx++;
        curr = getFib(idx);
    }
    
    int n = fibs.size();
    vector<int> dp(target + 1, 0);
    dp[0] = 1;

    for (ll fib : fibs) {
        for (ll sum = target; sum >= fib; sum--) {
            if (dp[sum - fib]) {
                dp[sum] = (dp[sum] + dp[sum - fib]) % MOD;
            }
        }
    }
    
    return dp[target];
}

int main() {
    int n;
    cin >> n;
    
    vector<int> a(n);
    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }
    
    ll prefixSum = 0;
    for (int i = 0; i < n; i++) {
        prefixSum += getFib(a[i]);
        cout << calculateX(prefixSum) << "\n";
    }
    
    return 0;
}