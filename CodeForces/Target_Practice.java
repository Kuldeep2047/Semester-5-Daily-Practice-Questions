package CodeForces;
import java.util.*;
public class Target_Practice {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            char[][] arr = new char[10][10];
            for(int i=0;i<10;i++){
                String s = sc.next();
                for(int j=0;j<10;j++){
                    arr[i][j] = s.charAt(j);
                }
            }
            answer(arr);
        }
    }
    public static void answer(char[][] arr){
        int[][] pre = {
            {1,1,1,1,1,1,1,1,1,1},
            {1,2,2,2,2,2,2,2,2,1},
            {1,2,3,3,3,3,3,3,2,1},
            {1,2,3,4,4,4,4,3,2,1},
            {1,2,3,4,5,5,4,3,2,1},
            {1,2,3,4,5,5,4,3,2,1},
            {1,2,3,4,4,4,4,3,2,1},
            {1,2,3,3,3,3,3,3,2,1},
            {1,2,2,2,2,2,2,2,2,1},
            {1,1,1,1,1,1,1,1,1,1},
        };
        int sum =0;
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(arr[i][j] == 'X'){
                    sum += pre[i][j];
                }
            }
        }
        System.out.println(sum);

    }

}
