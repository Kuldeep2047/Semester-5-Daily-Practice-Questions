// Last updated: 8/9/2025, 1:46:43 PM
class Solution {
    public int maxArea(int[] height) {
        return Most_water(height);
        
    }
    public static int Most_water(int[] arr){
        int left=0;
        int right=arr.length-1;
        int ans=0;
        while(left<right){
            int width = right-left;
            int height = Math.min(arr[right],arr[left]);
            int curr_sum=width*height;
            ans=Math.max(ans,curr_sum);
            if(arr[left]<arr[right]){
                left++;
            }else{
                right--;
            }
        }
        return ans;
    }
}