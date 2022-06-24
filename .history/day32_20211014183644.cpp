#include <string.h>
#include <iostream>

using namespace std;

string reverseString(string s,int n,int i){
    if(n-1 == i) return s[i];
    reverseString(s,n-1,i+1);
    return s[i];
}

int main(){
    string s = "this is the string";
    int n = s.length(),i=0;
    string str = reverseString(s,n,i);
    cout<<str<<endl;
}