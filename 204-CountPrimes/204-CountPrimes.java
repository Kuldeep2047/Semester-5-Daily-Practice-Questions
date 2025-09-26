// Last updated: 9/26/2025, 11:20:19 PM
class Solution {
    public int countPrimes(int n) {
        if(n==0 || n==1){
            return 0;
        }
        return answer(n);
    }
    public int answer(int n){
        int[] arr = new int[n];
        arr[0] = 1;//ye prime nhi hai
        arr[1] = 1;
        for(int i=2; i*i < n;i++){
            if(arr[i] ==0){//prime hai
                for(int j = i*i; j<n ; j+=i){
                    arr[j] = 1;
                }
            }
        }
        int ans =0;
        for(int a : arr){
            if(a==0){
                ans++;
            }
        }
        return ans;
    }
}