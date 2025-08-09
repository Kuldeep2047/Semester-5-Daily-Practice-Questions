// Last updated: 8/9/2025, 1:41:26 PM
class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        return answer(low,high);
    }
    public static List<Integer> answer(int low,int high){
        List<Integer> ans = new ArrayList<>();
        Queue<Integer> que = new LinkedList<>();
        for(int i=1;i<=9;i++){
            que.offer(i);
        }
        while(!que.isEmpty()){
            int num = que.poll();
            if(num>= low && num<= high){
                ans.add(num);
            }
            int last_digit = num %10;
            if(last_digit < 9){
                int next_digit = (num*10) + (last_digit+1);
                if(next_digit<=high){
                que.offer(next_digit);
            }
            }

        }
        return ans;
    }
}