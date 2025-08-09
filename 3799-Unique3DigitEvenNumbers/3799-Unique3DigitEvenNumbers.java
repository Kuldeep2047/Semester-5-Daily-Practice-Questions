// Last updated: 8/9/2025, 1:36:35 PM
class Solution {
    public int totalNumbers(int[] digits) {
        return Unique_Digit(digits);
    }
    public static int Unique_Digit(int[] digits){
        Set<Integer> set = new HashSet<>();
        int[] freq = new int[10];
        for(int num : digits){
            freq[num]++;
        }
        for(int last =0;last<=8;last+=2){
            if(freq[last]==0){
                continue;
            }
            freq[last]--;
            for(int first =1;first<=9;first++){
                if(freq[first]==0){
                    continue;
                }
                freq[first]--;
                for(int mid =0 ;mid<=9;mid++){
                    if(freq[mid]>0){
                        int num = first*100 + mid*10 + last;
                        set.add(num);
                    }
                }
                freq[first]++;
            }
            freq[last]++;
        }
        return set.size();
    }
}