// Last updated: 10/2/2025, 8:51:42 PM
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        return Maximum_Units(boxTypes , truckSize);
    }
    public static int Maximum_Units(int[][] box , int size){
        Arrays.sort(box , (a, b) -> Integer.compare(b[1], a[1]));
        int ans =0;

        for(int[] arr : box){
            int count = arr[0];
            int unit = arr[1];
            if(count > size){
                count = size;
            }
            ans += (count * unit );
            size -= count;
        }
        return ans;
    }
}