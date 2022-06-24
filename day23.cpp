#include <bits/stdc++.h>

using namespace std;

int main(){
    string s;
    cin>>s;
    int count = 0,ans=1;
    char l = 'A';
    for(char c : s) {
        if(c == l){
            ++count;
            ans=max(count,ans);
        }
        else{
            l=c;
            count=1;
        }
    }
    cout<<ans;
}