// Last updated: 11/15/2025, 10:54:34 PM
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
            ans=Math.max(ans, width*height);
            
            if(arr[left]<arr[right]){
                left++;
            }else{
                right--;
            }
        }
        return ans;
    }
}