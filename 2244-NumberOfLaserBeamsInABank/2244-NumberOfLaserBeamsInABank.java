// Last updated: 8/9/2025, 1:38:55 PM
class Solution {
    public int numberOfBeams(String[] bank) {
        return number_of_beams(bank);
    }
    public static int number_of_beams(String[] bank){
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<bank.length;i++){
            int c =0;
            for(int j=0;j<bank[i].length();j++){
                if(bank[i].charAt(j)=='1'){
                    c++;
                }
            }
            if(c>0){
                l.add(c);
            }
        }
        int ans=0;
        for(int i=0;i<l.size()-1;i++){
            ans += l.get(i)*l.get(i+1);
        }
        return ans;
    }
}