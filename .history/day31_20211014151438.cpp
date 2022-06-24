#include <iostream>

using namespace std;

bool isSort(int arr[],int n){
    if(n == 1) return true;

    if(arr[n] > arr[n-1]) return true;
    else return false;
}

int main(){
    int n;
    cin>>n;
    int arr[n];
    cout<<"Enter the elements : "<<endl;
    for(int i=0; i<n; i++){
        cin>>arr[i];
    }

    if(isSort(arr,n)) cout<<"\nArray is sorted : "<<endl;
    else cout<<"\nArray is not sorted : "<<endl;>>>>
}