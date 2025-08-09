// Last updated: 8/9/2025, 1:45:31 PM
class Solution {
    public List<Integer> grayCode(int n) {
        return answer(n);
    }
    public static List<Integer> answer(int n){
        int size = (int)Math.pow(2,n);
        List<Integer> ll = new ArrayList<>();
        for(int i=0;i<size;i++){
            ll.add( i^ (i>>1));
        }
        return ll;
    }
}