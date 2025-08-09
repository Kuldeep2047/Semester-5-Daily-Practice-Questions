// Last updated: 8/9/2025, 1:44:56 PM
class Solution {
    public int maxProduct(int[] nums) {
        return Maximum_Product(nums);
    }

    public static int Maximum_Product(int[] nums){
        int pro=1;
        int left_pro = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            pro *= nums[i];
            left_pro = Math.max(left_pro, pro);
            if(pro==0){
                pro=1;
            }
        }
        pro=1;
        int right_pro = Integer.MIN_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            pro *= nums[i];
            right_pro = Math.max(right_pro, pro);
            if(pro==0){
                pro=1;
            }
        }
        return Math.max(right_pro,left_pro);
    }
}