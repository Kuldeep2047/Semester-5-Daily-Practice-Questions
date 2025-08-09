// Last updated: 8/9/2025, 1:40:56 PM
class Solution {
    public int numberOfSteps(int num) {
        int c = 0;
        while(num>0){
            if(num%2==0){
                num = num/2;
                c++;
            }else{
                num -=1;
                c++;
            }
        }
        return c;
        
    }
}