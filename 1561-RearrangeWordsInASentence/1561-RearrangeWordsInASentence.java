// Last updated: 8/9/2025, 1:40:32 PM
class Solution {
    public String arrangeWords(String text) {
        String[] arr = text.split(" ");
        arr[0] = arr[0].substring(0,1).toLowerCase() + arr[0].substring(1);
        for(int turn=1;turn<arr.length;turn++){
            for(int i=0;i<arr.length-turn;i++){
                if((arr[i+1]).length() < arr[i].length()){
                    String temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        arr[0] = arr[0].substring(0,1).toUpperCase() + arr[0].substring(1);
        String ans = "";
        for(int i=0;i<arr.length;i++){
            if(i != arr.length-1){
                ans += arr[i]+" ";
            }else{
                ans += arr[i];
            }
        }
        return ans;
    }
}