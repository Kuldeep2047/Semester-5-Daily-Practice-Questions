// Last updated: 11/22/2025, 11:40:02 AM
class Solution {
    public int minimumOperations(int[] nums) {
        return answer(nums);
    }
    public static int answer(int[] arr){
        int n = arr.length;
        int c =0;
        for(int i=0;i<n;i++){
            int ele = arr[i];
            if(ele%3==0){
                continue;
            }else{
                c++;
            }
        }
        return c;
    }
}