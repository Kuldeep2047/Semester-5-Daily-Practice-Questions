// Last updated: 8/9/2025, 1:44:05 PM
class Solution {
    public int hIndex(int[] citations) {
        int start=0;
        int end=citations.length-1;
        int ans=0;
        while(start<=end){
            int mid = (start+end)/2;
            if(citations[mid]>=citations.length-mid){
                // ans=start;
                end=mid-1;

            }else{
                start=mid+1;
            }
        }
        return citations.length-start;
        
    }
}