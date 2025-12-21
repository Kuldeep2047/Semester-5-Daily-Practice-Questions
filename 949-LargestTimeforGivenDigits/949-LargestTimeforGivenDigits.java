// Last updated: 12/21/2025, 4:04:00 PM
1class Solution {
2    public String largestTimeFromDigits(int[] arr) {
3        return answer(arr);
4    }
5
6    public String answer(int[] a){
7        
8        int ans=-1;
9        for(int i=0;i<4;i++)
10            for(int j=0;j<4;j++)
11                for(int k=0;k<4;k++)
12                    for(int l=0;l<4;l++)
13                        if(i!=j&&i!=k&&i!=l&&j!=k&&j!=l&&k!=l){
14                            int h=a[i]*10+a[j],m=a[k]*10+a[l];
15                            if(h<24&&m<60){
16                                ans=Math.max(ans , h*60+m);
17                            }
18                        }
19
20        if(ans==-1){
21            return "";
22        }
23        int h=ans/60,m=ans%60;
24        return(h<10?"0":"")+h+":"+(m<10?"0":"")+m;
25    
26
27    }
28}