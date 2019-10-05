#include<iostream>
using namespace std;
string xAtEnd(string str)
{
    //base case
    if(str.length()==0)
    {
        return str;
    }

    //recursive case
    char ch=str[0];
    string ros=str.substr(1);

    string recursion_result= xAtEnd(ros);

    if(ch=='x')
    {
        return recursion_result+ch;
    }
    else
    {
        return ch+recursion_result;
    }
}
int main()
{
    cout<<xAtEnd("xvghxxyxtxxcadccsrdaxdex")<<endl;
    return 0;
}
