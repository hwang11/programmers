#include<iostream>
#include<vector>
using namespace std;

//두 수의 최대공약수 구하기
long gcd(long a, long b){
    if (a==0) return b;
    else return gcd(b%a,a);
}

//두 수의 최대공배수 구하기
long lcm(long a, long b){
    return a*b/gcd(a,b);
}

long long nlcm(vector<int> num)
{
	long long answer = num[0];
    for(int i=0;i<num.size()-1;i++){
        answer = lcm(answer,num[i+1]);
    }
	return answer;
}

int main()
{
	vector<int> test{2,6,8,14};
	cout << nlcm(test);
}
