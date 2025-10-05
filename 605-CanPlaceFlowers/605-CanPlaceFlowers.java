// Last updated: 10/5/2025, 2:19:58 PM
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        return answer(flowerbed , n);
    }

    public static boolean answer(int[] bed, int n){
        if(n==0){
            return true;
        }
        
        for(int  i= 0;i<bed.length ;i++){
            int v = bed[i];
            if(v == 0){

                boolean left = (i == 0) || (bed[i - 1] == 0);
                boolean right = (i == bed.length - 1) || (bed[i + 1] == 0);

                if(left && right){
                    bed[i] = 1;
                    n--;
                }
                if(n == 0){
                    return true;
                }

            }
        }
        return false;
    }
}