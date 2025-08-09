// Last updated: 8/9/2025, 1:38:05 PM
class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        return Number_of_Integer(banned,n,maxSum);
    }
    public static int Number_of_Integer(int[] banned,int n,int maxSum){
        int[] arr=  new int[10001];
        int c=0;
        int sum=0;
        for(int i=0;i<banned.length;i++){
            arr[banned[i]]=1;
        }
        for(int i=1;i<=n;i++){
            if(arr[i]==1){
                continue;
            }
            sum+=i;
            if(sum>maxSum){
                break;
            }
            c++;
        }
        return c;
    }
    
}