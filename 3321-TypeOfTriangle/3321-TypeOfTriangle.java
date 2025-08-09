// Last updated: 8/9/2025, 1:37:27 PM
class Solution {
    public String triangleType(int[] nums) {
        return answer(nums);
    }
    public static String answer(int[] arr){
        int a = arr[0];
        int b =arr[1];
        int c = arr[2];
        if((a+b<=c) || (b+c<=a) || (c+a<=b)){
            return "none";
        }
        else if(a==b && b==c){
            return "equilateral";
        }else if(a==b || b==c || c==a){
            return "isosceles";
        }else{
            return "scalene";
        }
    }
}