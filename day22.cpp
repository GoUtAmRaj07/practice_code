#include <bits/stdc++.h>

using namespace std;

double findMedianSortedArrays(vector<int> &nums1, vector<int> &nums2)
{
    vector<int> arr;
    arr = nums1;
    for (int i = 0; i < nums2.size(); ++i)
        arr.push_back(nums2[i]);
    if (arr.size() % 2 == 0)
    {
        cout << "added numbers are : " << arr[arr.size() / 2] << " and" << arr[(arr.size() / 2) - 1] <<endl;
        return (arr[arr.size() / 2] + arr[(arr.size() / 2) - 1]) / 2;
    }
    else
    {
        cout << "added numbers are : " << arr[(arr.size() / 2)]<<endl;
        return arr[(arr.size() / 2)];
    }
}

int main()
{
    vector<int> v1, v2;
    int n1, n2, e;
    cout << "Enter size of vector 1 : ";
    cin >> n1;
    cout << "Enter size of vector 2 : ";
    cin >> n2;
    cout << "Enter elements of vector 1 : ";
    for (int i = 0; i < n1; ++i)
    {
        cin >> e;
        v1.push_back(e);
    }
    cout << "Enter elements of vector 2 : ";
    for (int i = 0; i < n2; ++i)
    {
        cin >> e;
        v2.push_back(e);
    }
    double result;
    result = findMedianSortedArrays(v1, v2);
    cout << "Result is : " << result << endl;
}