// Last updated: 8/9/2025, 1:41:04 PM
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        return answer(nums1,nums2);
    }
    public static List<List<Integer>> answer(int[] a1,int[] a2){
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(unique(a1,a2));
        ans.add(unique(a2,a1));
        return ans;
    }
    public static List<Integer> unique(int[] a1,int[] a2){
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        List<Integer> ll = new ArrayList<>();
        for(int n:a1){
            s1.add(n);
        }
        for(int n:a2){
            s2.add(n);
        }
        for(int n:s1){
            if(!s2.contains(n)){
                ll.add(n);
            }
        }
        return ll;
    }
}