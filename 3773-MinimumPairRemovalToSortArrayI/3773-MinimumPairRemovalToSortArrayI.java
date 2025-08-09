// Last updated: 8/9/2025, 1:36:47 PM
class Solution {
    public int minimumPairRemoval(int[] nums) {
        int m = nums.length;
        List<Integer> list = new ArrayList<>();
        for(int n:nums){
            list.add(n);
        }
        int c=0;
        while(! isPossible(list)){
            int idx =-1;
            int msum = Integer.MAX_VALUE;
            for(int i=0;i<list.size()-1;i++){
                int sum = list.get(i)+list.get(i+1);
                if(sum<msum){
                    msum = sum;
                    idx = i;
                }
            }
            int com = list.get(idx) + list.get(idx+1);
            list.set(idx,com);
            list.remove(idx+1);
            c++;
        }
        return c;
        
    }
    public static boolean isPossible(List<Integer> ll){
        int l = ll.size();
        for(int i=1;i<l;i++){
            if(ll.get(i) < ll.get(i-1)){
                return false;
            }
        }
        return true;
    }
}