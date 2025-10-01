// Last updated: 10/1/2025, 10:04:12 PM
class Solution {
    public boolean lemonadeChange(int[] bills) {
        return LemonadeChange(bills);
    }
    public static boolean LemonadeChange(int[] arr){
        int n = arr.length;
        int five =0;
        int ten =0;
        for(int i = 0;i<n ;i++){
            if(arr[i] == 5){
                five++;
            }
            else if(arr[i] == 10){
                if(five > 0){
                    five --;
                    ten++;
                }else{
                    return false;
                }
            }
            else if(arr[i] == 20){
                if(ten>0 && five>0){
                    ten--;
                    five--;
                }else if(five >=3){
                    five -= 3;

                }else{
                    return false;
                }
            }
        }
        return true;

    }
}