// Last updated: 12/20/2025, 11:44:18 AM
1class Solution {
2    public boolean isPossible(int[] nums) {
3        return answer(nums);
4    }
5    public boolean answer(int[] arr){
6        int n = arr.length;
7        Map<Integer, Integer> map = new HashMap<>();
8        for(int i=0 ;i<n ;i++){
9            map.put(arr[i], map.getOrDefault(arr[i],0)+1); //-> ye frequency map hai
10        }
11
12        Map<Integer,Integer> vacancy = new HashMap<>();
13
14        for(int i=0 ;i<n ;i++){
15            if(map.get(arr[i])<=0){
16                continue;
17            }
18            else if(vacancy.getOrDefault(arr[i], 0) > 0){
19                map.put(arr[i], map.getOrDefault(arr[i],0)-1);
20
21                vacancy.put(arr[i], vacancy.getOrDefault(arr[i], 0)-1);
22                vacancy.put(arr[i]+1, vacancy.getOrDefault(arr[i]+1, 0)+1);
23            }
24            else if(map.getOrDefault(arr[i]+1, 0) > 0 &&
25         map.getOrDefault(arr[i]+2, 0) > 0){
26
27                map.put(arr[i], map.getOrDefault(arr[i], 0)-1);
28                map.put(arr[i]+1, map.getOrDefault(arr[i]+1, 0)-1);
29                map.put(arr[i]+2, map.getOrDefault(arr[i]+2, 0)-1);
30
31                vacancy.put(arr[i]+3, vacancy.getOrDefault(arr[i]+3, 0)+1);
32            }
33            else{
34                return false;
35            }
36
37        }
38        return true;
39    }
40}