// Last updated: 9/26/2025, 1:42:27 PM
class Solution {
    public void sortColors(int[] nums) {
        // answer(nums);
        answer2(nums);
    }

    public void answer2(int[] nums){
        int low =0;
        int mid =0;
        int high =nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums, low, mid);
                low++;
                mid++;
            }
            else if(nums[mid] ==1){
                mid++;
            }else{
                swap(nums, mid , high);
                high--;
            }
        }
    }
    public void swap(int[] nums ,int r, int l){
        int t = nums[r];
        nums[r] = nums[l];
        nums[l] = t;
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