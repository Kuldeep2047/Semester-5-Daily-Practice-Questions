// Last updated: 12/20/2025, 9:25:40 PM
1class Solution {
2    public long lastInteger(long n) {
3        return answer(n);
4    }
5
6    public long answer(long n){
7
8        
9        long ans =1;
10        long dis =1;
11        int dir =-1;
12
13        while(n > 1){
14            if(dir == 1 && n % 2 == 0 ){
15                ans = ans + dis;
16                
17            }
18            n = (1 + n)/2;
19            dir = -dir;
20
21            dis = 2* dis;
22        }
23
24        return ans;
25    }
26}