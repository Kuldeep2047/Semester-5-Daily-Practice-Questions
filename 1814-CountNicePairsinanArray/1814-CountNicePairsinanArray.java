// Last updated: 12/25/2025, 1:14:13 PM
1class Solution {
2    public int countNicePairs(int[] nums) {
3        return answer(nums);
4    }
5
6    public int answer(int[] arr){
7        int n = arr.length;
8
9        HashMap<Integer,Integer> map = new HashMap<>();
10
11        for(int i=0 ;i<n ;i++){
12            int rev = reverse(arr[i]);
13            int key = arr[i] - rev;
14
15            map.put(key, map.getOrDefault(key,0)+1);
16        }
17
18        long ans =0;
19        for(int k : map.keySet()){
20            int v = map.get(k);
21            ans += (long)(v)*(v-1)/2;
22        }
23        return (int)(ans % 1000000007);
24
25    }
26
27    public int reverse(int n){
28        int num =0;
29        while(n>0){
30            int r = n %10;
31            num = num *10 +r;
32            n = n/10;
33        }
34        return num;
35    }
36}