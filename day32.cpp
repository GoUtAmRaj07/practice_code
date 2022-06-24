#include <string.h>
#include <iostream>

using namespace std;

void reverseString(string s){
    if(s.length() == 0) return;

    string str = s.substr(1);
    reverseString(str);
    cout<<str[0];
}

int main(){
    string s = "this is the string";
    reverseString(s);
    return 0;
}