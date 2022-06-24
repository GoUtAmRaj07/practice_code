#include<bits/stdc++.h>

using namespace std;

int main(){
    int n;
    cout<<"Enter the number of elements : "<<endl;
    cin>>n;
    int arr[n];
    int p=1;

    for(int i = 0; i < n; ++i){
        arr[i] = rand()%100;
        p *= arr[i];
    }
    cout << "Elements of the array are : "<<endl;
    for(int i = 0; i < n; ++i){
        cout<<arr[i]<<" ";
    }
    int arr1[n];
    for(int i = 0; i < n; ++i){
        arr1[i] = p / arr[i];
    }
    cout<<"\nNew product array is : "<<endl;
    for(int i = 0; i < n; ++i){
        cout<<arr1[i]<<" ";
    }
    return 0;

}