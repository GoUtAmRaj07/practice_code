#include <iostream>

using namespace std;

int main(){
    int m,n;
    cout<<"Enter the size of the array : ";
    cin>>m>>n;
    int arr1[m],arr2[n],arr3[m+n];
    cout<<"ENter the elements of the first array : ";
    for(int i=0;i<m;i++)cin>>arr1[i];
    cout<<"enter the element of the second array : ";
    for(int i=0;i<n;i++)cin>>arr2[i];
    for(int i=0;i<=m;i++){
        if(i<m) arr3[i] = arr1[i];
        else {
            for(int j=0;j<n;j++,i++) arr3[i] = arr2[j];
        }
    }
    cout<<"elements of the array are : ";
    cout<<endl;

    for(int i=0;i<m+n;i++) cout<<arr3[i]<<" ";

    int median = 0;

    if((m+n)%2==0){
        int val;
        float med;
        val = (m+n)/2;
        cout<<endl<<"Value of if block val is : "<<val<<endl;
        med = (arr3[val]+arr3[val-1])/2;
        cout<<endl<<"Median of the new array is : "<<med;

    }
    else{
        int val = (m+n)/2;
        cout<<endl<<"Value of else block val is : "<<val<<endl;
        median = arr3[val];
        cout<<endl<<"Median of the new array is : "<<median;
    }

    return 0;
}