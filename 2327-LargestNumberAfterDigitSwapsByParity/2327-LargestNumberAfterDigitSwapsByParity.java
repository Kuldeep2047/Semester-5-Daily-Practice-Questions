// Last updated: 8/9/2025, 1:38:43 PM
class Solution {
    public int largestInteger(int num) {
        return answer(num);
    }
    public static int answer(int num){
        // List<Integer> ll = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        String str =Integer.toString(num);
        while(num>0){
            int r = num%10;
            if(r%2==0){
                even.add(r);
            }else{
                odd.add(r);
            }
            num = num/10;
        }
        StringBuilder sb = new StringBuilder();
        
        Collections.sort(odd);
        Collections.sort(even);
        for(int i=0;i<str.length();i++){
            if((str.charAt(i)-'0') %2==0){
                sb.append(even.get(even.size()-1));
                even.remove(even.size()-1);
            }else{
                sb.append(odd.get(odd.size()-1));
                odd.remove(odd.size()-1);
            }
        }
        int ans=-0;
        for(int i=0;i<sb.length();i++){
            ans = ans*10+(sb.charAt(i)-'0');
        }
        return ans;

    }
}