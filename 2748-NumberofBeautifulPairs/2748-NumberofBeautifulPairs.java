// Last updated: 12/27/2025, 8:09:20 PM
1class Solution {
2    public int countBeautifulPairs(int[] nums) {
3        return answer(nums);
4    }
5
6    public int answer(int[] arr){
7        int n = arr.length;
8        int ans =0;
9
10        for(int i=0 ;i<n ;i++){
11            for(int j= i+1 ;j<n ;j++){
12                int a = arr[i];
13                int b = arr[j] % 10;
14
15                a = (String.valueOf(a).charAt(0))-'0';
16                if(gcd(a,b) == 1){
17                    ans++;
18                }
19            }
20        }
21        return ans;
22    }
23
24    public int gcd(int a,int b){
25        while(a %b !=0){
26            int r=a % b;
27            a = b;
28            b = r;
29        }
30        return b;
31    }
32}