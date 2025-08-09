// Last updated: 8/9/2025, 1:39:36 PM
class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> ll = new ArrayList<>();
        for(int i=1;i<=n;i++){
            ll.add(i);
        }
        int idx=0;
        while(ll.size()>1){
            idx = (idx+k-1)% ll.size();
            ll.remove(idx);
        }
        return ll.get(0);
        
    }
}