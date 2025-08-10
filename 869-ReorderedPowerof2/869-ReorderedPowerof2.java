// Last updated: 8/10/2025, 10:32:45 AM
class Solution {
    public boolean reorderedPowerOf2(int n) {
        int[] freq = freq_ele(n);
        for(int i=0;i<31;i++){
            int power = (int)Math.pow(2,i);
            if(isSame_freq(freq,freq_ele(power))){
                return true;
            }
        }
        return false;
        
    }
    public static int[] freq_ele(int n){
        int[] arr = new int[10];
        while(n>0){
            int r = n%10;
            arr[r]++;
            n = n/10;
        }
        return arr;
    }
    public static boolean isSame_freq(int[] a,int[] b){
        for(int i=0;i<10;i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    }
}