// Last updated: 11/30/2025, 8:41:10 AM
1class Solution {
2    public int minMirrorPairDistance(int[] nums) {
3        return answer(nums);
4    }
5    public int answer(int[] arr){
6        int ans = Integer.MAX_VALUE;
7        int n = arr.length;
8
9        Map<Integer, Integer> map = new HashMap<>();
10
11        for(int i=0 ;i<n ;i++){
12            
13            
14            if(map.containsKey(arr[i])){
15                int idx = map.get(arr[i]);
16
17                ans = Math.min(ans, i-idx);
18            }
19            int rev = reverseDigit(arr[i]);
20            map.put(rev, i);
21        }
22        if(ans == Integer.MAX_VALUE){
23            return -1;
24        }else{
25            return ans;
26        }
27        
28    }
29
30    public int reverseDigit(int num){
31        String s = String.valueOf(num);
32
33        StringBuilder sb = new StringBuilder(s).reverse();
34        
35        int n = sb.length();
36
37        int si =0;
38        while(si < n && sb.charAt(si) == '0'){
39            si++;
40        }
41        if(si == n){
42            return 0;
43        }
44
45        String ans = sb.substring(si);
46
47        return Integer.parseInt(ans);
48        
49    }
50}