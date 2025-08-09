// Last updated: 8/9/2025, 1:40:10 PM
class Solution {
    public int[] frequencySort(int[] nums) {
        return answer(nums);
    }
    public static int[] answer(int[] nums){
        Integer[] newNums = new Integer[nums.length];
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int val = nums[i];
            map.put(val,map.getOrDefault(val,0)+1);
            newNums[i] = val;

        }

        Arrays.sort(newNums,(a,b)->{
            int fa = map.get(a);
            int fb = map.get(b);
            if(fa==fb){
                return b-a;
            }else{
                return fa - fb;
            }
        });

        for(int i=0;i<n;i++){
            nums[i] = newNums[i];
        }
        return nums;
    }
}