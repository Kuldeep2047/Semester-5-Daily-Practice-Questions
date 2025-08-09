// Last updated: 8/9/2025, 1:39:24 PM
class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        return answer(nums1,nums2);
    }
    public static int answer(int[] arr1,int[] arr2){
        int ans =0;
        int n = arr1.length;
        int m = arr2.length;
        int i=0, j=0;
        while(i< n && j<m){
            if(arr2[j]>= arr1[i]){
                ans = Math.max(j-i,ans);
                j++;
            }else{
                i++;


            }
        }
        return ans;

    }
}