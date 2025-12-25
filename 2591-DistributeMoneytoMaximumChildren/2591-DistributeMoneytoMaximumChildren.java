// Last updated: 12/25/2025, 12:34:44 PM
1class Solution {
2    public int distMoney(int money, int children) {
3        return answer(money, children);
4    }
5    public int answer(int money, int n){            
6        if(money <n ){
7            return -1;
8        }
9        money -= n;
10        
11        int count = money /7;
12        int r = money %7;
13
14        if(count == n){
15            if(r == 0){
16                return n;
17            }else{
18                return n-1;
19            }
20        }
21        if(count >n){
22            return n-1;
23        }
24
25
26        if(r == 3 && count == n-1){
27            return n-2;
28            // return n;
29        }
30
31        return count;
32    }
33}