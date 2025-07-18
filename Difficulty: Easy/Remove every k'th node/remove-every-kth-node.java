/* Link list Node
class Node
{
    Node next;
    int data;
    Node(int d)
    {
        data = d;
        next = null;
    }
}*/
class Solution {
    /*You are required to complete this method*/
    Node deleteK(Node head, int k) {
        // Your code here
        if(head==null) return null;
        if(k==1) return null;
        
        Node curr=head;
        int count=0;
        Node prev=null;
        
        while(curr!=null){
            count++;
            
            if(count%k==0){
                if(prev!= null){
                    prev.next=curr.next;
                }
                else{
                    head=curr.next;
                }
                curr=curr.next;
            }
            else{
                prev=curr;
                curr=curr.next;
            }
        }
            return head;
    }
}