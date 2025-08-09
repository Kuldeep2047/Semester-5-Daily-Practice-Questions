// Last updated: 8/9/2025, 1:40:01 PM
class Solution {
    public int minPartitions(String n) {
        return Partition(n);
    }

    public static int Partition(String n){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n.length();i++){
            if(n.charAt(i)-'0'>max){
                max = n.charAt(i)-'0';
            }
        }
        return max;
    }
}