#include <bits/stdc++.h>

using namespace std;
int arr[50][50] = {-1};
int knapsack(int w[], int v[], int n, int wt)
{
    for (int i = 0; i < n + 1; ++i)
    {
        for (int j = 0; j < wt + 1; ++j)
        {
            if (i == 0 || j == 0)
            {
                arr[i][j] = 0;
            }

            else if (w[n - 1] <= j)
            {
                arr[i][j] = max((v[i - 1] + arr[i - 1][j - w[n-1]], arr[i - 1][j]));
            }
            else
            {
                arr[i][j] = arr[i - 1][j];
            }
        }
    }
    return arr[n][wt];
}

int main()
{
    int n,wt;
    cout << "Enter the size of the array  : ";
    cin >> n;
    int weight[n], value[n];
    cout << "Enter the weight and value of the set of elements : ";
    for (int i = 0; i < n; i++)
    {
        cout << "Enter the weight of element : ";
        cin >> weight[i];
        cout << "ENter the value of element : ";
        cin >> value[i];
    }
    cout << "\nEnter the weight of the bag : ";
    cin >> wt;
    int arr[n + 1][wt + 1];
    int result = knapsack(weight, value, n, wt);
    cout << "Maximum profit obtained is : " << result << endl;
}