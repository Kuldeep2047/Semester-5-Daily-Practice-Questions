// Last updated: 1/1/2026, 12:48:55 PM
1/*
2// Definition for a Node.
3class Node {
4    int val;
5    Node next;
6    Node random;
7
8    public Node(int val) {
9        this.val = val;
10        this.next = null;
11        this.random = null;
12    }
13}
14*/
15
16class Solution {
17    public Node copyRandomList(Node head) {
18        HashMap<Node , Node> map = new HashMap<>();
19        Node temp = head;
20
21
22        while(temp != null){
23            map.put(temp, new Node(temp.val));
24            temp = temp.next;
25        }
26
27        temp = head;
28        while(temp != null){
29            Node copy = map.get(temp);
30            copy.next = map.get(temp.next);
31            copy.random = map.get(temp.random);
32            temp = temp.next;
33        }
34
35        return map.get(head);
36    }
37}