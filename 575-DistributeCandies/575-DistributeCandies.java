// Last updated: 8/9/2025, 1:42:50 PM
class Solution {
    public int distributeCandies(int[] candyType) {
        Arrays.sort(candyType);
        return Candies_no(candyType);
        
    }
    
    public static int Candies_no(int[] arr){
        int n = arr.length;
        int c=1;
        for(int i=0;i<n-1;i++){
            if(arr[i]!=arr[i+1]){
                c++;
            }
        }
        if(c>=n/2){
            return n/2;
        }else{
            return c;
        }
    }
}