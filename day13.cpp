#include<bits/stdc++.h>
using namespace std;

int main(){
    int n,sum;
    cout<<"ENter the size of the array : ";
    cin>>n;
    int arr[n];
    cout<<"\nEnter the elements of the array : ";
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    int flag = 0;
    cout<<"\nEnter the target sum : ";
    cin>>sum;
    cout<<endl;
    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++){
            if(arr[i] + arr[j] == sum) {
                flag= 1;
                cout<<i<<" "<<j<<endl;
            }
        }
        if(flag) break;
    }
    return 0;
}