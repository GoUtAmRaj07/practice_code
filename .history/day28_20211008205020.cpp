#include<bits/stdc++.h>

using namespace std;

vector<int> arrayRotation(vector<int> v ; int n){
    vector<int> v1,v2;
    int i=0;
    for(i=0;i<n;i++){
        v1.push_back(v[i]);
    }
    for(;i<v.size()-n;i++){
        v2.push_back(v[i]);
    }
    for(int j=0;j<n;j++) v2.push_back(v1[j]);
    return v2;
}

int main(){
    int n,j;
    cout<<"Enter the size of the array : ";
    cin>>n;
    vector<int> arr;
    for(int i=0;i<n;++i) arr.push_back(rand()%n);
    cout<<endl;
    for(int i=0;i<n;++i)cout<<arr[i]<<" ";

    cout<<"\nEnter the value you want to rotate the array : ";
    int v;
    cin>>v;
    vector<int> v = arrayRotate(arr,v);
    cout<<"\nArray after rotation : \n"
    for(int i=0;i<n;++i)cout<<v[i]<<" ";
}