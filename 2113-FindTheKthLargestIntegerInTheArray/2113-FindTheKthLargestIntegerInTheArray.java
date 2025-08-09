// Last updated: 8/9/2025, 1:39:18 PM
import java.math.*;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        return KthLargest(nums,k);
        
    }
    public static String KthLargest(String[] nums,int k){
        List<BigInteger> ll = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            ll.add(new BigInteger(nums[i]));
        }
        Collections.sort(ll);
        return ll.get(nums.length-k).toString();
    }
}