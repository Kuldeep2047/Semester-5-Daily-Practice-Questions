// Last updated: 8/9/2025, 1:37:37 PM
class Solution {
    public int minOperations(List<Integer> nums, int k) {
        return answer(nums,k);
    }
    public static int answer(List<Integer> nums,int k){
        int n = nums.size()-1;
        int c=0;
        boolean[] arr = new boolean[k+1];
        int count =0;
        while(n >=0){
            int ele = nums.get(n);
            c++;
            if(ele<=k && !arr[ele]){
                arr[ele] = true;
                count++;
                if(count==k){
                    return c;
                }

            }
            n--;

        }
        return c;
        

    }
}