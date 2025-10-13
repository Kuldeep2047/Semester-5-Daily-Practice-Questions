// Last updated: 10/13/2025, 6:35:59 PM
class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        return answer(flowers, people);
    }
    public int[] answer(int[][] flowers, int[] people){
        int n = people.length;
        int[] ans = new int[n];

        int[] start = new int[flowers.length];
        int[] end = new int[flowers.length];

        for(int i=0; i<flowers.length ;i++){
            start[i] = flowers[i][0];
            end[i] = flowers[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);

        for(int i= 0;i<people.length ;i++){
            int a = upperbound(start, people[i]);
            int b = lowerbound(end, people[i]);
            ans[i] = a-b;
        }
        return ans;
    }
    public int upperbound(int[] arr , int tar){
        int n = arr.length;
        int si =0;
        int ei = n;
        while(si<ei){
            int mid = (si + ei)/2;
            if(arr[mid]<=tar){
                si = mid +1;
            }else{
                ei = mid;
            }
        }
        return si;
    }
    public int lowerbound(int[] arr , int tar){
        int n = arr.length;
        int si =0;
        int ei = n;
        while(si<ei){
            int mid = (si + ei)/2;
            if(arr[mid]<tar){
                si = mid +1;
            }else{
                ei = mid;
            }
        }
        return si;
    }
}