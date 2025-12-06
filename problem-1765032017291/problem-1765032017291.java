// Last updated: 12/6/2025, 8:10:17 PM
1class Solution {
2    public boolean completePrime(int num) {
3        return answer(num);
4    }
5    public boolean answer(int num){
6        if(num < 10){
7            if(isPrime(num) == true){
8                return true;
9            }else{
10                return false;
11            }
12        }
13        String s = String.valueOf(num);
14        int n = s.length();
15
16        for(int i=1 ;i<=n ;i++){
17            String pre = s.substring(0,i);
18            int val = Integer.parseInt(pre);
19            if(isPrime(val) == false){
20                return false;
21            }
22
23            String suffix = s.substring(n-i);
24            int v2 = Integer.parseInt(suffix);
25            if(isPrime(v2) == false){
26                return false;
27            }
28        }
29        return true;
30        
31    }
32
33    public boolean isPrime(int n){
34        if(n < 2){
35            return false;
36        }
37        if(n == 2){
38            return true;
39        }
40        if(n % 2 == 0){
41            return false;
42        }
43        for(int i=3 ;i*i <=n ; i+=2){
44            if(n % i == 0){
45                return false;
46            }
47        }
48        return true;
49    }
50}