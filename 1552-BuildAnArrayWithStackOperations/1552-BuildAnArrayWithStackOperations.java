// Last updated: 8/9/2025, 1:40:33 PM
class Solution {
    public List<String> buildArray(int[] target, int n) {
        return answer(target,n);

    }
    public static List<String> answer(int[] target,int n){
        List<String> ll = new ArrayList<>();
        int k =1;
        int i=0;
        while(i<target.length){
            if(target[i]==k){
                ll.add("Push");
                k++;
                i++;
            }else{
                if(i==target.length){
                    break;
                }
                ll.add("Push");
                ll.add("Pop");
                k++;
            }
        }
        return ll;
    }
}