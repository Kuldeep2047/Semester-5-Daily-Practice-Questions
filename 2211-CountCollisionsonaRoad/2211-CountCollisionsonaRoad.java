// Last updated: 12/24/2025, 3:14:28 PM
1class Solution {
2    public int countCollisions(String directions) {
3        return answer(directions);
4    }
5
6    public int answer(String str){
7        int left=0;
8        int right=str.length()-1;
9
10        while(left<=right && str.charAt(left)=='L') {
11            left++;
12        }
13
14        while(left<=right && str.charAt(right)=='R') {
15            right--;
16        }
17
18        int ans = 0;
19
20        for(int i=left;i<=right;i++) {
21            if(str.charAt(i)!='S') {
22                ans++;
23            }
24        }
25
26        return ans;
27    }
28}