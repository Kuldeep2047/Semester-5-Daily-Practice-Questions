// Last updated: 9/30/2025, 3:42:55 PM
class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        TreeMap<Integer,Integer> hm=new TreeMap<>(); // Using Treemap
        for (int[] i : nums1){
            hm.put(i[0],i[1]);
        }
        for (int[] i : nums2){
            if (hm.containsKey(i[0])){
                hm.put(i[0],hm.get(i[0])+i[1]);
            }
            else{
                hm.put(i[0],i[1]);
            }
        }
        
        int n=0;
        int[][] arr2=new int[hm.size()][2];
        for (int i : hm.keySet()){
            arr2[n]=new int[]{i,hm.get(i)};
            n++;
        } 
        return arr2;
    }
}