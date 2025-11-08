// Last updated: 11/8/2025, 8:52:25 PM
class Solution {
    public int longestSubarray(int[] nums) {
        return answer(nums);
    }

    public static int answer(int[] arr){

        List<Integer> ll = new ArrayList<>();
        int n = arr.length;

        int[] left = buildLeft(arr);
        int[] right = buildRight(arr);

        int ans =0;
        for(int a : left){
            ans = Math.max(ans, a);
        }

        for(int i=0; i<n;i++){
            int best = Best_Bridge(arr, left, right, i);
            
            ans = Math.max(ans, best);
        }

        return ans;
        
    }

    public static int[] buildRight(int[] arr){
        int n = arr.length;
        int[] right = new int[n];
        Arrays.fill(right, 1);

        for(int i= n-2 ;i>=0 ;i--){
            if(arr[i] <= arr[i+1]){
                right[i] = right[i+1] +1;
            }
        }
        return right;
    }

    public static int[] buildLeft(int[] arr){
        int n = arr.length;
        int[] left = new int[n];

        Arrays.fill(left, 1);
        for(int i=1 ;i<n ;i++){
            if(arr[i] >= arr[i-1]){
                left[i] = left[i-1] +1;
            }
        }
        return left;
        
    }

    public static int Best_Bridge(int[] arr ,int[] l, int[] r, int k){
        int left =0;
        int right =0;

        if(k>0){
            left = l[k-1];
        }
        if(k+1 < arr.length ){
            right = r[k+1];
        }

        int ans =1 ;

        if(k>0 && k+1 < arr.length && arr[k - 1] <= arr[k+1]){

            ans = Math.max(ans , left + right +1);
        }
        else{
            ans = Math.max(ans , left +1);
            ans = Math.max(ans , right +1);
        }

        return ans;

        
    }
}









