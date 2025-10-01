// Last updated: 10/1/2025, 10:55:52 PM
class Solution {
    public String largestNumber(int[] nums) {
        return largest_num(nums);
    }
    public static String largest_num(int[] nums){
        int n = nums.length;
        int f = 0;
        for(int i=0; i<n; i++) {
            if(nums[i]!=0) {
                f = 1;
                break;
            }
        }
        if(f==0) {
            return "0";
        }

        String[] arr = new String[n];
        for(int i=0; i<n; i++) {
            arr[i] = Integer.toString(nums[i]);
        }

        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));
        StringBuilder sb  = new StringBuilder();
        for(int i=0; i<n; i++) {
            sb.append(arr[i]);
        }

        return sb.toString();
    }
}