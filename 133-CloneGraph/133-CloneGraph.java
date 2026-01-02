// Last updated: 1/2/2026, 11:31:41 AM
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public List<Node> neighbors;
6    public Node() {
7        val = 0;
8        neighbors = new ArrayList<Node>();
9    }
10    public Node(int _val) {
11        val = _val;
12        neighbors = new ArrayList<Node>();
13    }
14    public Node(int _val, ArrayList<Node> _neighbors) {
15        val = _val;
16        neighbors = _neighbors;
17    }
18}
19*/
20
21class Solution {
22    public Node cloneGraph(Node node) {
23        if(node == null){
24            return null;
25        }
26
27        HashMap<Node, Node> map = new HashMap<>();
28        Queue<Node> q=  new LinkedList<>();
29
30        q.add(node);
31        map.put(node, new Node(node.val));
32
33        while(!q.isEmpty()){
34            Node r = q.poll();
35
36            for(Node nbrs : r.neighbors){
37                if(!map.containsKey(nbrs)){
38                    map.put(nbrs, new Node(nbrs.val));
39                    q.add(nbrs);
40                }
41                map.get(r).neighbors.add(map.get(nbrs));
42            }
43        }
44        return map.get(node);
45    }
46}