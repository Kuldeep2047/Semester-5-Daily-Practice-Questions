// Last updated: 11/22/2025, 8:07:07 PM
class Solution {
    public int minimumFlips(int n) {
        return answer(n);
    }
    public static int answer(int n){
        int c =0;

        String str = Integer.toBinaryString(n);
        
        StringBuilder sb = new StringBuilder(str).reverse();

        String r = sb.toString();
        int len = str.length();

        for(int i=0 ;i<len ;i++){
            if(str.charAt(i) != r.charAt(i)){
                c++;
            }
        }
        // System.out.println(c);
        return c;
        
    }
}