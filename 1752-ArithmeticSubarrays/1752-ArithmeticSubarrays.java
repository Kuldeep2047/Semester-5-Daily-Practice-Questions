// Last updated: 8/9/2025, 1:40:09 PM
class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        return Arithmetic_Subarrays(nums,l,r);
    }
    public static List<Boolean> Arithmetic_Subarrays(int[] nums,int[] l,int[] r){
        List<Boolean> ll = new ArrayList<>();
        for(int i=0;i<l.length;i++){
            int start = l[i];
            int end = r[i];
            
            ll.add(isArithmetic(Arrays.copyOfRange(nums,start,end+1)));
        
        }
        return ll;
    }
    public static boolean isArithmetic(int[] nums){
        Arrays.sort(nums);
        int diff = nums[1]-nums[0];
        for(int i = 2;i<nums.length;i++){
            if(nums[i]-nums[i-1] != diff){
                return false;
            }
        }
        return true;
    }
}