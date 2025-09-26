// Last updated: 9/27/2025, 12:18:36 AM
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        return answer(nums);
    }
    public List<List<Integer>> answer(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i>0 && arr[i] == arr[i-1]){
                continue;
            }
            int si =i+1;
            int ei = n-1;
            int sum =0;
            
            while(si<ei){
                sum = (arr[i]+ arr[si] + arr[ei]);
                if(sum ==0){
                    List<Integer> ll = new ArrayList<>();
                    ll.add(arr[i]);
                    ll.add(arr[si]);
                    ll.add(arr[ei]);
                    ans.add(ll);
                    si++;
                    ei--;
                }else if(sum<0){
                    si++;
                }else{
                    ei--;
                }
                while(si<ei && si>i+1 && arr[si]==arr[si-1]) si++;
                while(si<ei && ei<arr.length-1 && arr[ei]==arr[ei+1]) ei--;
            }
        }
        return ans;

    }
}