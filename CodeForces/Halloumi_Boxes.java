package CodeForces;

import java.util.Scanner;

public class Halloumi_Boxes {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- >0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++) { 
				arr[i] = sc.nextInt();
			}
			if(isAnswer(arr,k)) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
    }
    public static boolean isAnswer(int[] arr, int k) {
		int n = arr.length;
		int f=1 ; //flag for sorted array
		for(int i=0;i<n-1;i++) {
			if(arr[i]>arr[i+1]) {
				f=0;
				break;
			}
		}
		if(f==1) {
			return true;
		}else {
			if(k==1) {
				return false;
			}else {
				return true;
			}
		}
		
	}
}
