// Last updated: 8/9/2025, 1:42:36 PM
class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        return New_Sentence(dictionary,sentence);
    }
    public static String New_Sentence(List<String> dic,String sen){
        String[] arr = sen.split(" ");
        for(int i=0;i<arr.length;i++){
            
            
            for(String word : dic){
                int l = word.length();
                if(arr[i].length()>=l && arr[i].substring(0, l).equals(word)){
                    arr[i] = word;
                }
            }
        }
        String ans = "";
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                ans+=arr[i];
            }else{
                ans+=arr[i]+" ";
            }
        }
        return ans;
    }
}