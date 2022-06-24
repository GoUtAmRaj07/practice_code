#include <iostream>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        int n;
        cin>>n;
        int arr[n];
        int min = arr[0],sum = 0;
        for(int i=0;i<n;i++){
            cin>>arr[i];
            min = min(arr[i],min);
            sum+=arr[i];
        }
        cout<<sum-min<<endl;
    }
}

//cout << (count(S.begin(), S.end(), 'N') == 1 ? "NO" : "YES") << '\n';