package LeetCode;

public class Sum_of_Digits_in_Base_K
 {
    
    public static void main(String[] args){
        int n = 34;
        int k = 6;
        int num = num_in_k(n,k);
        int ans = 0;
        while(num>0){
            ans += num%10;
            num = num/10;
        }
        // return ans;
        System.out.println(ans);
    }
    public static int num_in_k(int n,int k){
        int sum=0;
        int mul =1;
        while (n > 0) {
			int rem = n % k;
			sum = sum + rem * mul;
			n = n / k;
			mul = mul * 10;
	    }
        return sum;
    }
}
