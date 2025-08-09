// Last updated: 8/9/2025, 1:41:39 PM
class Solution {
    public String strWithout3a3b(int a, int b) {
        return New_String(a,b);
    }
    public String New_String(int a,int b){
        StringBuilder s = new StringBuilder();
        while(a>0 || b>0){
            if(a>b && b!=0){
                s.append("aab");
                a-=2;
                b--;
            }else if(b>a && a!=0){
                s.append("bba");
                b-=2;
                a--;
            }else if(a>0){
                s.append("a");
                a--;
            }else{
                s.append("b");
                b--;
            }
        }
        return s.toString();

    }
}