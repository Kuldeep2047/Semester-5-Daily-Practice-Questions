// Last updated: 8/9/2025, 1:40:23 PM
class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        return AP(arr);
    }
    public static boolean AP(int[] arr){
        Arrays.sort(arr);
        int diff = arr[1]-arr[0];
        for(int i=2;i<arr.length;i++){
            if(arr[i]-arr[i-1] != diff){
                return false;
            }
        }
        return true;
    }
}