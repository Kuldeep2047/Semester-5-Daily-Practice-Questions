// Last updated: 1/4/2026, 12:03:26 PM
1class Solution {
2    public int countSubstrings(String s) {
3        return answer(s);
4        
5    }
6
7    public int answer(String s){
8        int count =0;
9        for(int i=0 ;i<s.length() ;i++){
10            for(int j=i ;j<s.length() ;j++){
11                if(isPalindrome(s, i, j)){
12                    count++;
13                }
14            }
15        }
16        return count;
17    }
18    public boolean isPalindrome(String s, int i, int j){
19        while(i<j){
20            if(s.charAt(i) != s.charAt(j)){
21                return false;
22            }
23            i++;
24            j--;
25        }
26        return true;
27    }
28
29    // public int answer(String s){
30    //     int n = s.length();
31    //     int ans =0;
32
33    //     for(int axis =0 ;axis<n ; axis++){
34    //         for(int orbit =0 ; (axis-orbit) >=0 && (axis + orbit) < n ; orbit++){
35    //             if(s.charAt(axis-orbit) == s.charAt(axis + orbit)){
36    //                 ans++;
37    //             }else{
38    //                 break;
39    //             }
40    //         }
41    //     }
42
43    //     for(double axis =0.5 ;axis<n ; axis++){
44    //         for(double orbit =0.5 ; axis-orbit >=0 && axis + orbit < n ; orbit++){
45    //             if(s.charAt((int)(axis-orbit)) == s.charAt((int)(axis + orbit))){
46    //                 ans++;
47    //             }else{
48    //                 break;
49    //             }
50    //         }
51    //     }
52
53        // return ans;
54    // }
55}