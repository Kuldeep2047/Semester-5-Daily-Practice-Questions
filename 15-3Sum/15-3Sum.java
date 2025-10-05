// Last updated: 10/5/2025, 9:25:43 PM
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
                    
                    ans.add(Arrays.asList(arr[i], arr[si], arr[ei]));
                    si++;
                    ei--;

                    while(si<ei && arr[si]==arr[si-1]) si++;
                    while(si < ei && arr[ei] == arr[ei + 1]) ei--;
                    
                }else if(sum<0){
                    si++;
                }else{
                    ei--;
                }
                
            }
        }
        return ans;

    }
}