#include <bits/stdc++.h>

using namespace std;

int sumOfElements(int arr[],int start,int end){
    int sum = 0;
    for(int i = start; i <= end; ++i) sum += arr[i];
    return sum;
}

int painterPartition(int arr[],int n,int k){
    if(k == 1) return sumOfElements(arr,0,n-1);
    if(n == 0) return arr[0];
    int result = INT_MAX;
    for(int i = 1; i <= n; ++i) {
        result = min(result,max(painterPartition(arr,i,k-1),sumOfElements(arr,i,n-1)));
    }
    return result;
}

int main(){
    int k;
    cout <<"Enter the numbers of painters : ";
    cin>>k;
    int n;
    cout<<"ENter the size of the array : ";
    cin>>n;
    int arr[n];
    cout<<"Enter the elements of the array : ";
    for(int i=0;i<n;i++) cin>>arr[i];
    int result = painterPartition(arr,n,k);
    cout<<"Value of pointer is : "<<result<<endl;
}