// Last updated: 8/9/2025, 1:36:20 PM
class Solution {
    public int smallestIndex(int[] nums) {
        return answer(nums);
    }
    public static int answer(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(i==digitSum(arr[i])){
                return i;
            }
        }
        return -1;
    }
    public static int digitSum(int n){
        int sum =0;
        while(n>0){
            sum += n%10;
            n=n/10;
        }
        return sum;
    }
}