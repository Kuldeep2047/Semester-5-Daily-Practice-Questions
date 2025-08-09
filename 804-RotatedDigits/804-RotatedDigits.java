// Last updated: 8/9/2025, 1:42:14 PM
class Solution {
    public int rotatedDigits(int n) {
        return valid_digit(n);
    }
    public static int valid_digit(int n){
        int c=0;
        for(int i=1 ;i<=n;i++){
            if(isrotated(i)){
                c++;
            }
        }
        return c;
    }
    public static boolean isrotated(int m){
        String str = String.valueOf(m);
        String n = "";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='0' || ch=='1' || ch=='8'){
                n+=ch;
            }
            else if(ch=='2'){
                n+="5";
            }else if(ch=='5'){
                n+="2";
            }else if(ch=='6'){
                n+="9";
            }else if(ch=='9'){
                n+="6";
            }else if(ch=='3' || ch=='4' ||ch=='7'){
                return false;
            }
        }
        return Integer.parseInt(n)!=m;

    }
}