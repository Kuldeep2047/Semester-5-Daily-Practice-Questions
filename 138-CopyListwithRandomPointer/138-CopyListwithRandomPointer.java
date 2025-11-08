// Last updated: 11/8/2025, 3:06:56 PM
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }
        
        Node newHead = new Node(head.val);
        Node oldTemp = head.next;
        Node newTemp = newHead;

        HashMap<Node ,Node> map = new HashMap<>();
        map.put(head, newHead);

        while(oldTemp != null){
            Node nn = new Node(oldTemp.val);
            newTemp.next = nn;
            map.put(oldTemp, nn);

            oldTemp = oldTemp.next;
            newTemp = newTemp.next;
        }
        oldTemp = head;
        newTemp = newHead;

        while(oldTemp != null){
            newTemp.random = map.get(oldTemp.random);

            oldTemp = oldTemp.next;
            newTemp = newTemp.next;

        }

        return newHead;

    }
}





