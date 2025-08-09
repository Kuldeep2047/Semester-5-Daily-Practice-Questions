// Last updated: 8/9/2025, 1:36:17 PM
class Solution {
    public List<String> partitionString(String s) {
        return answer(s);
    }
    public static List<String> answer(String s){
        List<String> ll = new ArrayList<>();
        Set<String> set = new HashSet<>();
        int n = s.length();
        int i=0;
        while(i<n){
            String seg = getSegment(s,i,set);
            if(seg==null){
                break;
            }
            set.add(seg);
            ll.add(seg);
            i += seg.length();
        }
        return ll;
        
        
    }
    public static String getSegment(String s,int idx,Set<String> set){
        StringBuilder sb = new StringBuilder();
        int j = idx;
        int n = s.length();
        while(j<n){
            sb.append(s.charAt(j));
            String temp = sb.toString();
            if(!set.contains(temp)){
                return temp;
            }
            j++;
        }
        return null;
    }
}