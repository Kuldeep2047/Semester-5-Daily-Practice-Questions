// Last updated: 8/9/2025, 1:42:47 PM
class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        return isValid(p1,p2,p3,p4);
    }
    public static boolean isValid(int[] p1,int[] p2,int[] p3,int[] p4){
        Set<Integer> set = new HashSet<>();
        set.add(distance(p1,p2));
        set.add(distance(p1,p3));
        set.add(distance(p1,p4));
        set.add(distance(p2,p3));
        set.add(distance(p2,p4));
        set.add(distance(p3,p4));
        if(set.size()==2 && !set.contains(0)){
            return true;
        }else{
            return false;
        }

    }
    public static int distance(int[] arr1,int[] arr2){
        return (int)(Math.pow(arr2[0]-arr1[0],2)+ Math.pow(arr2[1]-arr1[1],2));
    }
}