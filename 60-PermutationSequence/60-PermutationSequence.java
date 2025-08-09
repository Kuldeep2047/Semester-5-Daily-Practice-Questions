// Last updated: 8/9/2025, 1:45:55 PM
class Solution {
    public String getPermutation(int n, int k) {
        // String ques = "";
        // for(int i=1;i<=n;i++){
        //     ques+=i;
        // }
        // List<String> ll = new ArrayList<>();
        // permutation(ques,"",ll);
        // Collections.sort(ll);
        // return ll.get(k-1);


        String ans ="";
        int fact =1;
        List<Integer> ll = new ArrayList<>();
        for(int i=1;i<=n;i++){
            fact = fact*i;
            ll.add(i);
        }
        k--;
        for(int i=n;i>0;i--){
            fact = fact/i;
            int idx = k/fact;
            ans += ll.get(idx);

            k = k%fact;
            ll.remove(idx);

        }
        return ans;
        
    }
    // public static void permutation(String ques,String ans,List<String> ll){
    //     if(ques.length()==0){
    //         ll.add(ans);
    //         return;
    //     }
    //     for(int i=0;i<ques.length();i++){
    //         char ch = ques.charAt(i);
    //         String s1 = ques.substring(0,i);
    //         String s2 = ques.substring(i+1);
    //         permutation(s1+s2,ans+ch,ll);
    //     }
    // }
}