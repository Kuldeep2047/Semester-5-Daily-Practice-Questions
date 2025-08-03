import java.util.HashSet;
import java.util.Set;

public class Make_Array_Zero_by_Subtracting_Equal_Amounts {
    public int minimumOperations(int[] nums) {
        return answer(nums);
    }
    public static int answer(int[] nums){
        // int n = nums.length;
        // int c=1;
        // Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        for(int n:nums){
            if(n!=0){
                set.add(n);
            }
        }
        return set.size();
    }
}
