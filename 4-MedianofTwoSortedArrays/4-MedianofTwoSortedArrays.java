// Last updated: 12/18/2025, 10:59:02 PM
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        return answer(nums1,nums2);
4    }
5    public static double answer(int[] nums1,int[] nums2){
6        int n = nums1.length;
7        int m = nums2.length;
8        int[] arr = new int[n+m];
9
10        int c=0;
11        for(int i=0;i<n;i++){
12            arr[c++] = nums1[i];
13        }
14
15        for(int i=0;i<m;i++){
16            arr[c++] = nums2[i];
17        }
18        Arrays.sort(arr);
19        
20        int l = m+n;
21        if(arr.length%2 != 0){
22            return arr[l/2];
23        }else{
24            return (arr[l/2-1] + arr[l/2])/2.0;
25        }
26    }
27}