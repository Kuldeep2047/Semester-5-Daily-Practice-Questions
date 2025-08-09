// Last updated: 8/9/2025, 1:40:41 PM
class Solution {
    public int numTeams(int[] rating) {
        return Count_Teams(rating);
    }
    public static int Count_Teams(int[] rating){
        int ans=0;
        int n = rating.length;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if((rating[i]<rating[j] && rating[j]<rating[k]) || (rating[i]>rating[j] && rating[j]>rating[k])){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}