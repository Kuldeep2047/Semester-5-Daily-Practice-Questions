// Last updated: 8/9/2025, 1:46:42 PM
class Solution {
    public String intToRoman(int num) {
       return Roman(num); 
    }
    public static String Roman(int num){
        StringBuilder ans = new StringBuilder();
        String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] val = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        for(int i=0;i<13;i++){
            if(num==0){
                break;
            }
            int n = num/val[i];
            while(n>0){
                ans.append(roman[i]);
                n--;
            }
            num %= val[i];
        }
        return ans.toString();
    }
}