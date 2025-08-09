// Last updated: 8/9/2025, 1:37:24 PM
class Solution {
    public int maximumPrimeDifference(int[] nums) {
        return answer(nums);
    }

    public static int answer(int[] nums){
        int i=0;
        int j = nums.length-1;
        // Arrays.sort(nums);
        while(i<=j){
            boolean a = isPrime(nums[i]);
            boolean b = isPrime(nums[j]);
            if(a && b){
                return j-i;
            }else if(!a && b){
                i++;
                // j--;
            }else if(a && !b){
                j--;
            }else{
                i++;
                j--;
            }
            
        }
        return 0;
    }

    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}