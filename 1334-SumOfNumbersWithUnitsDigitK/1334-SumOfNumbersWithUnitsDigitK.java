// Last updated: 8/9/2025, 1:41:16 PM
class Solution {
    public int minimumNumbers(int num, int k) {
        return answer(num,k);
    }
    public static int answer(int num,int k){
        if(num==0){
            return 0;
        }
        for(int i=1;i<=10;i++){
            if(k*i > num){
                return -1;
            }
            if((num-k*i)%10 == 0){
                return i;
            }
        }
        return -1;
    }
}