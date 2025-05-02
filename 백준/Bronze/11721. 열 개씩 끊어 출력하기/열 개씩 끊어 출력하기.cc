#include <iostream>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    string str;
    cin >> str;

    for (int i = 0; i < (str.size() / 10) + 1; i++)
    {
        cout << str.substr(i * 10, 10) << '\n';
    }
    return 0;
}