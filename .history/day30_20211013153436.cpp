#include <iostream>

using namespace std;

void primeSeive(int n){
    int arr[100] = {0};
    for(int i=2;i<=n;i++){
        if(arr[i] == 0){
            for(int j=i*i;j<=n;j+=i){
                arr[j] == 0;
            }
        }
    }

    for(int i=2;i<=n;i++){
        if(arr[i] == 0){
            cout<<i<<" ";
        }
    }
}

int main(){
    int n;
    cin>>n;

    primeSeive(n);

    return 0;
}