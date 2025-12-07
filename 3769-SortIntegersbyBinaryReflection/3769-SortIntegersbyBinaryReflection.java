// Last updated: 12/7/2025, 8:16:13 PM
1class Solution {
2    public int[] sortByReflection(int[] nums) {
3        return answer(nums);
4    }
5
6    public int[] answer(int[] nums){
7        Integer ans[] = new Integer[nums.length];
8        for(int i=0; i<ans.length; i++){
9            ans[i] = nums[i];
10        }
11
12        Arrays.sort(ans, (a,b)-> {
13            int binA = binary(a);
14            int binB = binary(b);
15            if(binA==binB){ 
16                return a-b;
17            }
18            else{
19                return binA-binB;
20            }
21        });
22
23        int[] f = new int[nums.length];
24        for(int i=0; i<nums.length; i++) f[i] = ans[i];
25        return f;
26    }
27
28    public int binary(int n) {
29        String bin = Integer.toBinaryString(n);
30        String rev = new StringBuilder(bin).reverse().toString();
31        return Integer.parseInt(rev, 2);
32    }
33}