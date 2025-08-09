// Last updated: 8/9/2025, 1:37:33 PM
class Solution {
    public int differenceOfSums(int n, int m) {
        return answer(n,m);
    }
    public static int answer(int n,int m){
        int a =0;
        int b=0;
        for(int i=0;i<=n;i++){
            if(i%m!=0){
                a+=i;
            }else{
                b+=i;
            }
        }
        return a-b;
    }
}