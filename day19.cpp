#include <iostream>

using namespace std;

int main(){
    //char str = "THISISTHESAMPLESTRING";
    int row;
    cout<<"Enter the number of rows : ";
    cin>>row;
    int col = 8;
    char arr[row][col];
    for(int i=0; i<row; i++){
        for(int j=0; j<col; j++){
            arr[i][j] = ' ';
        }
    }
    cout<<endl;

    i=0;j=0;
    int k=0;
    int l=str.length();

    while(l!=0){
        if(i!=(row-1)){
            arr[i][j]=str[k];
            k++;
            i++;
        }
        else if(i == (row-1)){
            
        }
    }

    for(int i=0; i<row; i++){
        for(int j=0; j<col; j++){
            cout<<arr[i][j]<<" ";
        }
        cout<<endl;
    }
}