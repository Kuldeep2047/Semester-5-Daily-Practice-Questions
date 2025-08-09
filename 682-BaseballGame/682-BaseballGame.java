// Last updated: 8/9/2025, 1:42:35 PM
class Solution {
    public int calPoints(String[] operations) {
        return Baseball_Game(operations);
    }
    public static int Baseball_Game(String[] operations){
        Stack<Integer> st = new Stack<>();
        int sum=0;
        for(int i=0;i<operations.length;i++){
            String ele   = operations[i];
            if (ele.equals("+")) {
                int a = st.pop();
                int b = st.pop();
                st.push(b);
                st.push(a);
                st.push(a + b);
            } else if(ele.equals("D")){
                st.push(2*st.peek());
            }else if(ele.equals("C")){
                st.pop();
            }else{
                st.push(Integer.parseInt(ele));
            }

        }
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;

    }
}