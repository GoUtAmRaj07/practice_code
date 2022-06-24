#include <bits/stdc++.h>

using namespace std;

void conversion(string s){
    if(s.length() == 0) return;
    if(s[0] == 'p' && s[1] == 'i')
    {
        cout<<"3.14";
        conversion(s.substr(2));
    }
    else{
        cout<<s[0];
        conversion(s.substr(1));
    }
}

int main(){
    string s;
    cout<<"Enter the string : \n";
    getline(cin, s);

    int n = s.length();
    conversion(s);

    return 0;
}