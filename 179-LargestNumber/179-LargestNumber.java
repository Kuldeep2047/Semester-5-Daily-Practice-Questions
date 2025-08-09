// Last updated: 8/9/2025, 1:44:44 PM
class Solution {
    public String largestNumber(int[] nums) {
        return largest_num(nums);
    }
    public static String largest_num(int[] nums){
        int n = nums.length;
        for(int turn =1;turn<n;turn++){
            for(int i=0;i<n-turn;i++){
                String num1 = String.valueOf(nums[i]);
                String num2 = String.valueOf(nums[i + 1]);
                if ((num2 + num1).compareTo(num1 + num2) > 0){
                    int temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                }
            }
        }
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            s.append(nums[i]);
        }
        if(s.charAt(0)=='0'){
            return "0";
        }
        return s.toString();
    }
}