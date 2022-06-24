#include <bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin>>t;
    while(t--){
        string str;
        cin.ignore();
        getline(cin, str);
        if(str[0] != str[str.size()-1]) cout<<"NO";
        else cout << "YES";
    }
}// 4
// EEE
// EN
// ENNEENE
// NENN