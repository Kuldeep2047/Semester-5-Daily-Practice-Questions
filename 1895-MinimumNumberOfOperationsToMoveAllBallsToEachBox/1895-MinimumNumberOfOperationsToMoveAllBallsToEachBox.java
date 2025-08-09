// Last updated: 8/9/2025, 1:39:43 PM
class Solution {
    public int[] minOperations(String boxes) {
        return number_of_operation(boxes);
        
    }
    public static int[] number_of_operation(String boxes) {
		int n = boxes.length();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			int last = n-1;
			int sum =0;
			while(last>i) {
				if(boxes.charAt(last)=='1') {
					sum+=(last-i);
				}
				last--;
			}
			arr[i] = sum;
		}
		
		for(int i=0;i<n;i++) {
			int start = 0;
			int sum =0;
			while(start<i) {
				if(boxes.charAt(start)=='1') {
					sum+=(i-start);
				}
				start++;
			}
			arr[i] += sum;
		}
        return arr;
		
		
	}
}