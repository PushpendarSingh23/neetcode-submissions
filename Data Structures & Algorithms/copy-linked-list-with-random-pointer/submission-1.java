class Solution{
    public Node copyRandomList(Node head){
        if(head==null) return null;              // empty list
        HashMap<Node,Node> map=new HashMap<>();
        Node curr=head;
        while(curr!=null){
            map.put(curr,new Node(curr.val));    // create new node
            curr=curr.next;                      // move ahead
        }
        curr=head;                               // reset pointer
        while(curr!=null){
            map.get(curr).next = map.get(curr.next);       // connect next node
            map.get(curr).random=map.get(curr.random);   // connect random node
            curr=curr.next;                              // move ahead
        }
        return map.get(head);                    // return copied list

        // map stores old-new nodes.
        // second pass connects pointers.
    }
}