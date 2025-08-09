// Last updated: 8/9/2025, 1:36:39 PM
class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        return Basket(fruits,baskets);
    }
    public static int Basket(int[] fruits,int[] baskets){
        int n = fruits.length;
        boolean[] used = new boolean[n];
        // Arrays.sort(fruits);
        // Arrays.sort(baskets);
        int ans = 0;

        for(int i=0;i<n;i++){
            int q = fruits[i];
            boolean placed = false;

            for(int j=0;j<n;j++){
                if(!used[j] && baskets[j]>=q){
                    used[j] = true;
                    placed = true;
                    break;
                }
            }
            if(!placed){
                ans++;
            }
        }
        return ans;
    }
}