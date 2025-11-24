// Last updated: 11/24/2025, 8:36:54 PM
class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        return answer(nums);
    }

    public List<Boolean> answer(int[] arr){
        List<Boolean> ll = new ArrayList<>();
        int val =0;
        for(int ele : arr){
            val = ele + (val*2);
            val = val %5;
            if(val== 0){
                ll.add(true);
            }else{
                ll.add(false);
            }
        }

        return ll;
    }
}