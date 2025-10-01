// Last updated: 10/1/2025, 9:52:02 PM
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        return numberOfBoats(people ,limit);
    }
    public static int numberOfBoats(int[] arr , int limit){

        Arrays.sort(arr);
        int boat =0;
        int l = 0;
        int r = arr.length-1;
        while(l<=r){
            if(arr[l] + arr[r] <= limit){
                boat++;
                l++;
                r--;
            }else{
                boat++;
                r--;
            }
        }
        return boat;

    }
}