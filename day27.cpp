#include <bits/stdc++.h>
using namespace std;
#define fast_cin()                    \
    ios_base::sync_with_stdio(false); \
    cin.tie(NULL);                    \
    cout.tie(NULL)

long func(vector<long> freq)
{
    long ans = 0;
    long n = freq.size();
    for (long i = 0; i < n; i++)
    {
        if (freq[i] & 1)
        {
            if (i < n - 1)
                freq[i + 1]++;
        }
        ans += freq[i] / 2;
      
    }
    return ans;
}

void solve()
{
    int n;
    cin >> n;
    vector<long> freq(n);
    for (long i = 0; i < n; i++)
    {
        cin >> freq[i];
    }
    long ans = 0;
    for (long i = 0; i < n; i++)
    {
        if (freq[i] & 1)
        {
            if (i < n - 1)
                freq[i + 1]++;
        }
        ans = (long)(ans + freq[i] / 2);
    }
    // return ans;
    cout<<ans<<endl;
}

int main()
{
    fast_cin();
// #ifndef SOURYA
//     freopen("input.txt", "r", stdin);
//     freopen("output.txt", "w", stdout);
//     freopen("error.txt", "w", stderr);
// #endif
    solve();
    
    return 0;
}