// Last updated: 12/20/2025, 8:38:53 PM
1class Solution {
2    public int maximumSum(int[] nums) {
3        return answer(nums);
4    }
5    public int answer(int[] arr){
6        int ans =Integer.MIN_VALUE;
7        int n = arr.length;
8
9        List<Integer> ll1 = new ArrayList<>(); // for 0
10        List<Integer> ll2 = new ArrayList<>();// for 1
11        List<Integer> ll3 = new ArrayList<>();//for 2
12
13        for(int i=0 ;i<n;i++){
14            int v = arr[i];
15            if(v % 3 ==2){
16                ll3.add(v);
17            }
18            else if(v %3 == 1){
19                ll2.add(v);
20            }
21            else{
22                ll1.add(v);
23            }
24        }
25
26        Collections.sort(ll1);
27        Collections.sort(ll2);
28        Collections.sort(ll3);
29        
30        Collections.reverse(ll1);
31        Collections.reverse(ll2);
32        Collections.reverse(ll3);
33
34        if(ll1.size()>=3){
35            ans = Math.max(ans, ll1.get(0) + ll1.get(1) + ll1.get(2));
36        }
37
38        if(ll2.size() >=3){
39            ans = Math.max(ans, ll2.get(0) + ll2.get(1) + ll2.get(2));
40        }
41
42        if(ll3.size() >=3){
43            ans = Math.max(ans, ll3.get(0)+ ll3.get(1)+ ll3.get(2));
44        }
45
46        if(ll1.size()>0 && ll2.size() >0 && ll3.size()>0){
47            ans = Math.max(ans, ll1.get(0)+ll2.get(0)+ll3.get(0));
48        }
49
50        if(ans == Integer.MIN_VALUE){
51            return 0;
52        }else{
53            return ans;
54        }
55        
56        
57        
58    }
59}