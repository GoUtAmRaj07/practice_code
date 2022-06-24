#include <iostream>

using namespace std;

int maxSum(int arr[], int n, int v)
{
    if (v == 0 || n == 0)
        return 0;
    else
    {
        return max(arr[n-1]+maxSum(arr, n - 1, v - 1), maxSum(arr, n - 1, v));
    }
}
int main()
{
    int n;
    cout<<"Enter the number of elements";
    cin>>n;
    int arr[n];
    cout << " Enter the elementsof the array : ";
    for (int i = 0; i < n; i++)
        cin >> arr[i];
    int max;
    cout << "Enter the maximum number of elements to pick : ";
    cin >> max;
    int maxsum = maxSum(arr, n, max);
    cout << "\nMaxsum of " << max << " elements : " << maxsum;
    return 0;
}