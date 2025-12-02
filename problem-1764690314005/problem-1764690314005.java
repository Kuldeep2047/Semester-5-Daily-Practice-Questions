// Last updated: 12/2/2025, 9:15:14 PM
1class Solution {
2    public int maxBalancedSubarray(int[] nums) {
3        return answer(nums);
4    }
5
6    public int answer(int[] arr){
7        int n= arr.length;
8
9        HashMap<String, Integer> map = new HashMap<>();
10        int ans = 0;
11
12        int bal = 0;
13        int xor =0;
14
15        map.put("0#0", -1);
16
17        for(int i=0 ;i<n ;i++){
18            xor ^= arr[i];
19
20            if(arr[i] % 2==0){
21                bal++;
22            }else{
23                bal--;
24            }
25
26            String key = xor + "#" + bal;
27            if(map.containsKey(key)){
28                ans = Math.max(ans, i - map.get(key));
29            }else{
30                map.put(key, i);
31            }
32        }
33        return ans;
34    }
35}