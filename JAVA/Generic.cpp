#include<iostream>

using namespace std;

template<class T>
T Add(T i, T j)
{
    T ans;
    ans = i + j;
    return ans;
}

int main()
{
    int a = 10, b = 11, iRet = 0;
    float x = 90.9f, y = 67.0f, fRet = 0.0f;
    double p = 94.5, q = 6.3, dRet = 0.0f;

    iRet = Add(a,b);
    fRet = Add(x,y);
    dRet = Add(p,q);
    cout<<"Addition of integers : "<<iRet<<"\n";
    cout<<"Addition of floats : "<<fRet<<"\n";
    cout<<"Addition of double : "<<dRet<<"\n";

    return 0;
}
