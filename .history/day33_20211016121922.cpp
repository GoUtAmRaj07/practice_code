#include <bits/stdc++.h>

using namespace std;

void conversion(string s,int n){
    if(s.length() == 0) return;
    int i = 0;
    if(s[i] == 'p' && s[i+1] == 'i')
    {
        cout<<"3.14";
        conversion(s,i+2);
    }
    else{
        cout<<s[i];
        conversion(s,i+1);
    }
}

int main(){
    string s;
    cout<<"Enter the string : \n";
    getline(cin, s);

    int n = s.length();
    conversion(s,0);

    return 0;
}