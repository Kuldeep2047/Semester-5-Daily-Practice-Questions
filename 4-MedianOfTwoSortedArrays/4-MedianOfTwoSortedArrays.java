// Last updated: 8/9/2025, 1:46:50 PM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        return Median(nums1,nums2);
    }
    public static double Median(int[] nums1,int[] nums2){
        int n = nums1.length;
        int m = nums2.length;
        int[] arr = new int[n+m];
        int c=0;
        for(int i=0;i<n;i++){
            arr[c++] = nums1[i];
        }
        for(int i=0;i<m;i++){
            arr[c++] = nums2[i];
        }
        Arrays.sort(arr);
        int l = m+n;
        if(arr.length%2 != 0){
            return arr[l/2];
        }else{
            return (arr[l/2-1] + arr[l/2])/2.0;
        }
    }
}