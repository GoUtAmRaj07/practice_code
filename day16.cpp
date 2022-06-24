#include <bits/stdc++.h>

using namespace std;
// void reversestr(string &str){
//      int n = str.length();
//      for(int i=0;i<n/2;i++) swap(str[i],str[n-i-1]);
//  }
int main(){
    string str="this is string 1";
    //reversestr(str);
    //reverse(str.begin(), str.end());
    for(int i=str.length()-1;i>=0;i--)
    cout<<str[i];
    return 0;
}