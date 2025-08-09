// Last updated: 8/9/2025, 1:40:07 PM
class Solution {
    public int countVowelStrings(int n) {
        int a,e,i,o,u;
        a = e=i=o=u=1;
        for(int j=1;j<n;j++){
            a = a+e+i+o+u;
            e = e+i+o+u;
            i = i+o+u;
            o = o +u;
            u = u;
        }
        return a+e+i+o+u;
        
    }
}