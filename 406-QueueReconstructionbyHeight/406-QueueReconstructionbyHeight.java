// Last updated: 10/1/2025, 10:23:45 PM
class Solution {
    public int[][] reconstructQueue(int[][] people) {
        return Queue_Reconstruction(people);
    }
    public static int[][] Queue_Reconstruction(int[][] arr){
        int n = arr.length;

        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                if (a[0] == b[0]) {
                    return a[1] - b[1]; // smaller k first
                } else {
                    return b[0] - a[0]; // taller person first
                }
            }
        });

        List<int[]> ordered = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int[] p = arr[i];
            ordered.add(p[1], p);     // insert person at index  k
        }
        int[][] ll = new int[n][2];
        for (int i = 0; i < n; i++) {
            ll[i] = ordered.get(i);
        }
        return ll;

    }

}