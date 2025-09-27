// Last updated: 9/27/2025, 2:24:15 PM
class Solution {
    public String frequencySort(String s) {
        return answer(s);
    }
    public static String answer(String s){
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a,b)->b.getValue()- a.getValue());

        StringBuilder sb = new StringBuilder();

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            pq.add(entry);
        }

        while(!pq.isEmpty()){
            char ch = pq.peek().getKey();
            int f = pq.peek().getValue();

            for(int i=0;i<f;i++){
                sb.append(ch);
            }
            pq.poll();
        }
        return sb.toString();
        
    }
}