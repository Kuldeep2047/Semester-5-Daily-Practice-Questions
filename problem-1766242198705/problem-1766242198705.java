// Last updated: 12/20/2025, 8:19:58 PM
1class Solution {
2    public int minOperations(int[] nums) {
3        return answer(nums);
4    }
5
6    public int answer(int[] arr){
7        int n = arr.length;
8        // Map<Integer,Integer> map = new HashMap<>();
9        Set<Integer> set = new HashSet<>();
10        
11        int j = n;
12        for(int i=n-1 ;i>=0 ;i--){
13            if(set.contains(arr[i])){
14                j = i+1;
15                break;
16            }
17
18            set.add(arr[i]);
19            j = i;
20            
21        }
22
23        return (j+2 )/3;
24    }
25}