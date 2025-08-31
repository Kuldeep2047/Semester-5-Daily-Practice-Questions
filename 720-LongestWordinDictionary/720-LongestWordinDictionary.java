// Last updated: 8/31/2025, 10:58:06 PM
class Solution {
    public String longestWord(String[] words) {
        return answer(words);
    }
    public String answer(String[] arr){
        int n = arr.length;
        Arrays.sort(arr, (a,b)->{
            if(a.length() != b.length()){
                return b.length()-a.length();
            }else{
                return a.compareTo(b);
            }
        });

        Set<String> set = new HashSet<>();
        for(String s : arr){
            set.add(s);
        }

        for(String word : arr){
            boolean ans = true;
            for(int i=1;i<word.length();i++){
                if(! set.contains(word.substring(0,i))){
                    ans = false;

                    break;
                }
            }
            if(ans== true){
                return word;
            }
        }
        return "";
    }
}