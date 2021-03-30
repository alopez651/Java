class Solution1 
{
    //make node class first 
    static Node head; 
 
  
    static class Node 
    {
 
        int val;
        Node next;
 
        // Constructor new node
        Node(int v)
        {
            val = v;
            next = null;
            //Node(int x) { val = x; }
        }
    }
 
    void printlist(Node head) //node
    {
        if (head == null) 
        { 
            return;
        }
        while (head != null) 
        {  //lab example vid.node
            System.out.print(head.val + "->");    //node
            
            //print "null"???******not working
            //System.out.print("null\n");
            head = head.next;   //node
        }
    }
    //https://mail.codejava.net/java-core/collections/java-collections-utility-
    //examples-for-changing-order-and-content-of-a-list
    //reversing linked list 
    Node reverselist(Node head)//node
    {
        Node rev = null, curr = head, next;    //node
        while (curr != null) 
        {  
            next = curr.next;
            curr.next = rev;   //error curr
            rev = curr;
            curr = next;
        }
        head = rev;    //node
        //return curr;
        return head;    //node
    }
    //fixing rearrangement
    void rearrange(Node head)   //node
    {
 
        
        // method??
        Node slow = head, fast = slow.next;
        //Node slow = fast = slow.next; //node
        
        while (fast != null && fast.next != null) 
        {
            slow = slow.next;
            fast = fast.next.next;
        }
 

        Node node1 = head;  //node
        Node node2 = slow.next;
        //slow.head = null;
        slow.next = null;
 
        //reversing
        node2 = reverselist(node2);
 
        
        head = new Node(0);         //node
 
        // curr is the pointer to this dummy Node, which
        // will be used to form the new list
        Node curr = head;       //node
        while (node1 != null || node2 != null) 
        {
 
            //first nums
            if (node1 != null) 
            {
                curr.next = node1;
                curr = curr.next;
                
                node1 = node1.next;
            }
 
            // T2nd list
            if (node2 != null) 
            {
                curr.next = node2;
                curr = curr.next;
                node2 = node2.next;
            }
        }
 
        // Assign head to new list
        head = head.next;   //node
    }
    /*API:
    Purpose: 
        to create a link list(node) which has a constructure to be 
        able to reverse and arragnge the non- homogeneous list to a 
        homogeneous list.
    Paramater: 
        node1; first half of node
        node2; second half of node 
        node.slow= to find the middle point
        rearrangelist = reverses node1, node 1
        printlist, prints node 
    Return Val: 
        after reverse and arrangemnt homogeneous list 
    */
    public static void main(String[] args)
    {
 
        Solution1 list = new Solution1();     //solution1
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);
        
        System.out.print("Input: ");
        list.printlist(head); // error*****
        System.out.print("null\n");
        
        list.rearrange(head); // rearrange list as per ques
        
        
        System.out.print("Output: " );
        list.printlist(head); // error********
        System.out.println("null");
    }
}
 


