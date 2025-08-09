// Last updated: 8/9/2025, 1:46:29 PM
class Solution {
    public void nextPermutation(int[] nums) {
        permutation(nums);
    }
    public static void reverse(int[] arr,int i,int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void permutation(int[] arr){
        int n = arr.length;
        int p=-1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                p=i;
                break;
            }
        }
        if(p==-1){
            reverse(arr,0,n-1);
            return;
        }
        int q=-1;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>arr[p]){
                q=i;
                break;
            }
        }
        int temp = arr[p];
        arr[p] = arr[q];
        arr[q] = temp;
        reverse(arr,p+1,n-1);
    }
}