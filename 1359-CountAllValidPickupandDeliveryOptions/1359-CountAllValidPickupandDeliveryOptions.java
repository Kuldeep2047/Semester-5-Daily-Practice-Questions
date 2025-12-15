// Last updated: 12/15/2025, 8:06:22 PM
1class Solution {
2    public int countOrders(int n) {
3        return answer(n);
4    }
5    public int answer(int n){
6        int mod = 1000000007;
7
8        //for pickup
9        long f1= 1;
10        for(int i=1 ;i<=n ;i++){
11            f1 *= i;
12            f1 = f1 % mod;
13        }
14
15        //for delivery
16        long f2 = 1;
17        for(int i=1 ;i<=n ;i++){
18            f2 *= (2* i -1);
19            f2 = f2 % mod;
20        }
21
22        return (int)((f1*f2 ) %mod);
23    }
24}