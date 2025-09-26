// Last updated: 9/26/2025, 1:29:52 PM
class Solution {
    public void sortColors(int[] nums) {
        answer(nums);
    }
    public void answer(int[] nums){
        int zero =0;
        int one = 0;
        int two =0;
        for(int n : nums){
            if(n==0){
                zero++;
            }else if(n==1){
                one++;
            }else{
                two++;
            }
        }
        int idx =0;
        for(int i=0;i<zero;i++){
            nums[idx++] = 0;
        }
        for(int i=0;i<one;i++){
            nums[idx++] = 1;
        }
        for(int i=0;i<two;i++){
            nums[idx++] = 2;
        }

    }
}