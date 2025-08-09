// Last updated: 8/9/2025, 1:40:14 PM
class Solution {
    public int maxSum(int[] nums1, int[] nums2) {
        return maximum_sum(nums1,nums2);
    }
    public static int maximum_sum(int[] arr1,int[] arr2){
    	int i=0;
    	int j=0;
    	int s1=0;
    	int s2=0;
    	long ans=0;
    	while(i<arr1.length && j<arr2.length) {
    		if(arr1[i]<arr2[j]) {
    			i++;
    		}else if(arr2[j]<arr1[i]) {
    			j++;
    		}else {
    			long sum1=0;
    			for(int k=s1;k<=i;k++) {
    				sum1+=arr1[k];
    			}
    			long sum2=0;
    			for(int k=s2;k<=j;k++) {
    				sum2+=arr2[k];
    			}
    			ans = ans + Math.max(sum1, sum2);
    			i++;
    			j++;
    			s1=i;
    			s2=j;
    		}
    	}
    	long sum1=0;
		for(int k=s1;k<arr1.length;k++) {
			sum1+=arr1[k];
		}
		long sum2=0;
		for(int k=s2;k<arr2.length;k++) {
			sum2+=arr2[k];
		}
		ans = ans + Math.max(sum1, sum2);
		return (int)(ans%(1000000000+7));
    }
}