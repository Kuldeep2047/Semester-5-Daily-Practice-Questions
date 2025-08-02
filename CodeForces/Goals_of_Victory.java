package CodeForces;
import java.util.Scanner;

public class Goals_of_Victory {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int[]  arr = new int[n-1];
            for(int i=0;i<n-1;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(answer(arr));
        }
    }
    public static int answer(int[] arr){
        int n = arr.length;
        int sum =0;
        for(int i=0;i<n;i++){
            sum += arr[i];
        }
        return -sum;
    }
}
