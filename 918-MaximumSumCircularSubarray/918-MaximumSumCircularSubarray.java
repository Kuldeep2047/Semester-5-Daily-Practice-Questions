// Last updated: 12/18/2025, 10:03:27 PM
1class Solution {
2    public int maxSubarraySumCircular(int[] nums) {
3        return Max_Sum(nums);
4    }
5    public static int Max_Sum(int[] arr) {
6        //first take linear sum bu use of Kadans algo
7		int linear_max = Kadans_Algo(arr);
8		int sum = 0;
9
10        //take all sum and chage sign as well
11		for(int i=0;i<arr.length;i++) {
12			sum+=arr[i];
13			arr[i] = -1*arr[i];
14		}
15        
16		int mid_max = Kadans_Algo(arr);
17		int circular_sum = sum + mid_max;
18        if(circular_sum==0){
19            return linear_max;
20        }
21		return Math.max(linear_max, circular_sum);
22		
23		
24	}
25	
26	public static int Kadans_Algo(int[] arr) {
27		int ans=Integer.MIN_VALUE;
28		int sum=0;
29		for (int i = 0; i < arr.length; i++) {
30			sum+=arr[i];
31			ans = Math.max(ans, sum);
32			if(sum<0) {
33				sum=0;
34			}
35		}
36		return ans;
37	}
38}