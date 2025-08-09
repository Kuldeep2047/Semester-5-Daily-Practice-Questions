// Last updated: 8/9/2025, 1:45:59 PM
class Solution {
    public int[][] merge(int[][] intervals) {
        
        return merge_intervals(intervals);
    }
    public static int[][] merge_intervals(int[][] arr){
        int n = arr.length;
        
        Arrays.sort(arr,Comparator.comparingInt(a->a[0]));
        List<List<Integer>> ans = new ArrayList<>();
        // for(int i=0;i<n;i++){
        //     List<Integer> ll = new ArrayList<>();
        //     ll.add(arr[i][0]);
        //     ll.add(arr[i][1]);
        //     ques.add(new ArrayList<>(ll));

        // }
        int l = arr[0][0];
        int r = arr[0][1];
        for(int i=1;i<n;i++){
            if(r>=arr[i][0]){
                r = Math.max(r,arr[i][1]);
            }else{
                ans.add(Arrays.asList(l,r));
                l = arr[i][0];
                r = arr[i][1];
            }
        }
        ans.add(Arrays.asList(l,r));
        // System.out.println(ques);
        int[][] fans = new int[ans.size()][2];
        for(int i=0;i<ans.size();i++){
            fans[i][0] = ans.get(i).get(0);
            fans[i][1] = ans.get(i).get(1);
        }
        return fans;
    }
}