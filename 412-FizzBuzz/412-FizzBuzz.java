// Last updated: 8/9/2025, 1:43:24 PM
class Solution {
    public List<String> fizzBuzz(int n) {
        return Fizz_Buzz(n);
    }
    public static List<String> Fizz_Buzz(int n){
        List<String> ll = new ArrayList<>();
        int c3 =1;
        int c5 =1;
        
        for(int i=1;i<=n;i++){
            String s = "";
            if(c3==3){
                s += "Fizz";
                c3 =0;
            }
            if(c5==5){
                s += "Buzz";
                c5 =0;
            }
            if(s==""){
                s+=i;
            }
            c3++;
            c5++;
            ll.add(s);
        }
        return ll;
    }
}