// Last updated: 8/9/2025, 1:41:11 PM
class Solution {
    public int minDeletion(int[] nums) {
        return answer(nums);
    }
    public static int answer(int[] arr){
        List<Integer> ll = new ArrayList<>();
        for(int n:arr){
            ll.add(n);
        }
        int c =0;
        int i=0;
        while(i < ll.size()-1){
            if(i%2 ==0 && ll.get(i).equals(ll.get(i + 1))){
               
                    ll.remove(i+1);
                    c++;
                
            }else{
                i++;
            }
        }
        if(ll.size() % 2 != 0){
            c++;
        }
        return c;
    }
}