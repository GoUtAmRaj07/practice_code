#include <iostream>

using namespace std;

bool uglynumber(int n)
{
    while (n % 2 == 0)
    {
        n = n / 2;
    }
    while (n % 5 == 0)
    {
        n = n / 5;
    }
    while (n % 3 == 0)
    {
        n = n / 3;
    }
    if (n == 1)
        return true;
    else
        return false;
}

int main()
{
    int n;
    cout << "Enter a number : ";
    cin >> n;
    bool result = uglynumber(n);
    if (result)
        cout << "The number is ugly!!";
    else
        cout << "The number is not ugly!";

    cout << endl << (3/2);
}