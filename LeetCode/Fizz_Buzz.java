package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Fizz_Buzz{
    public static void main(String[] args){
        int n =16;

        List<String> ans = fizz_buzz(n);
        System.out.println(ans);
    } 

    public static List<String> fizz_buzz(int n){
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