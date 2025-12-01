// Last updated: 12/1/2025, 1:32:50 PM
1class Solution {
2    public int lenLongestFibSubseq(int[] arr) {
3        return answer(arr);
4    }
5    public int answer(int[] arr){
6        int n = arr.length;
7        int ans = Integer.MIN_VALUE;
8
9        HashSet<Integer> set = new HashSet<>();
10        for(int a : arr){
11            set.add(a);
12        }
13
14        for(int i=0 ;i<n-1 ;i++){
15            for(int j=i+1; j<n ;j++){
16                int pre = arr[i];
17                int curr = arr[j];
18                int next = pre + curr;
19                int len =2;
20
21                while(set.contains(next)){
22                    len++;
23                    pre = curr;
24                    curr = next;
25                    next = pre + curr;
26                }
27                ans = Math.max(ans, len);
28
29            }
30        }
31    
32        if(ans <= 2){
33            return 0;
34        }else{
35            return ans;
36        }
37    }
38}