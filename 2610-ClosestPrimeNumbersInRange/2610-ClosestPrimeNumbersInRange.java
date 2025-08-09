// Last updated: 8/9/2025, 1:38:13 PM
class Solution {
    public int[] closestPrimes(int left, int right) {
        return PrimeSieve(right,left);
    }
    public static int[] PrimeSieve(int n,int left) {
		int[] ans =new int[n+1];
		ans[0] = ans[1] =1;
		for(int i=2;i*i<=n;i++) {
			if(ans[i]==0) { 
				for(int j=2;i*j<=n;j++) {
					ans[i*j]=1;
				}
			}
		}
        List<Integer> ll = new ArrayList<>();
        for(int i=left;i<=n;i++){
            if(ans[i]==0){
                ll.add(i);
            }
        }
        if (ll.size() < 2) return new int[]{-1, -1};

        int[] arr = {ll.get(0), ll.get(1)};
        int d = arr[1] - arr[0];
        // arr[0] = ll.get(0)
        for(int i=2;i<ll.size();i++){
            if(ll.get(i)-ll.get(i-1)<d){
                arr[0] = ll.get(i-1);
                arr[1] = ll.get(i);
                d = ll.get(i) - ll.get(i-1);
            }
        }
        return arr;
		
	}
}