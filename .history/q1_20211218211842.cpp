#include <bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin>>t;
    while(t--){
        string str;
        getline(cin, str);
        if(str[0] != str[str.size()-1]) cout<<"NO";
        else cout << "YES";
    }
}