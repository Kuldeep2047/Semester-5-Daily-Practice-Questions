import java.util.Arrays;

public class Maximum_Median_Sum_of_Subsequence_of_Size_3 {
        public static void main(String[] args){
            // Scanner sc = new Scanner(System.in);
            int[] nums = {2,1,3,2,1,3};
            System.out.println(answer(nums));

        }

        public static long answer(int[] nums){
            int n = nums.length;
            Arrays.sort(nums);
            int first_ele_idx = n/3;
            long sum =0;
            // int sum = nums[first_ele_idx];

            for(int i=first_ele_idx; i<n;i+=2){
                sum += nums[i];
            }
            return sum;
        }
    
    }

