// Last updated: 9/28/2025, 4:26:00 PM
class Solution {
    public int largestPerimeter(int[] nums) {
        return perimeter(nums);
    }
    public int perimeter(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        for(int i = n-3 ;i>=0;i--){
            int a = arr[i];
            int b = arr[i+1];
            int c = arr[i+2];
            if(a+b >c){
                return a+b+c;
            }
        }
        return 0;
    }
}