#include <iostream>
using namespace std;

int main()
{
    int month, date;
    cin >> month >> date;

    int arr[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    string days[] = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
    int acc = 0;

    for (int i = 0; i < month - 1; i++)
    {
        acc += arr[i];
    }
    acc += date;
    acc %= 7;
    cout << days[acc] << '\n';
    return 0;
}