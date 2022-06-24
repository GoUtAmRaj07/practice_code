#include <iostream>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        string S;
        cin >> S;
        cout << (count(S.begin(), S.end(), 'N') == 1 ? "NO" : "YES") << '\n';
    }
}// 4
// EEE
// EN
// ENNEENE
// NENN