// Last updated: 10/13/2025, 6:35:15 PM
class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        return numberOfFlowers(flowers, people);
    }
    public int[] numberOfFlowers(int[][] flowers, int[] people){
        int n = flowers.length;
        int[] start = new int[n];
        int[] end = new int[n];

        for(int i =0 ;i<n;i++){
            start[i] = flowers[i][0];
            end[i] = flowers[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int[] ans = new int[people.length];

        for(int i =0 ;i< people.length ;i++){
            int before_start = upperBound(start, people[i]); // flower bloom count started ≤ person time
            int before_end = lowerBound(end, people[i]);    //count of flowers ended < person time

            ans[i] = before_start - before_end;
        }
        return ans;
    }

    public static int upperBound(int[] arr, int item) {
        
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = low + (high-low)/2;
            if (arr[mid] <= item)
                low = mid + 1;
            else
                high = mid;
        }
        return low;
    }

    public static int lowerBound(int[] arr, int item) {
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = low + (high-low)/2;
            if (arr[mid] < item)
                low = mid + 1;
            else
                high = mid;
        }
        return low;
    }
}