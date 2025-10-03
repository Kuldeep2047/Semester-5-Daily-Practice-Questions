// Last updated: 10/3/2025, 12:19:48 PM
class Solution {
    public String largestNumber(int[] nums) {
        return largest_num(nums);
    }
    public static String largest_num(int[] nums){
        String[] arr=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        
        if(arr[0].equals("0")){
            return "0";
        }

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]);
        }
        return sb.toString();
    
    }
}