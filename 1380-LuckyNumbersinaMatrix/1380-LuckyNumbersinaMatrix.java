// Last updated: 9/30/2025, 7:54:14 PM
class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        return answer(matrix);
    }
    public List<Integer> answer(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;
        List<Integer> row = new ArrayList<>();
        List<Integer> col = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < m; j++) {
                min = Math.min(min, arr[i][j]);
            }
            row.add(min);
        }

        for (int j = 0; j < m; j++) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                max = Math.max(max, arr[i][j]);
            }
            col.add(max);
        }

        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<row.size() ;i++){
            int ele = row.get(i);
            if(col.contains(ele)){
                ans.add(ele);
            }
        }
        return ans;
    }
}