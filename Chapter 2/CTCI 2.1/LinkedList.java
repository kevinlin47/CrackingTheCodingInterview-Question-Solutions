/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctci.pkg2.pkg1;

import java.util.HashMap;

/**
 *
 * @author Kevin Lin
 */
public class LinkedList {
    
    Node head=null;
    
    //adds new node to the front of the list
    public Node appendToHead(int d)
    {
        if (head==null)
        {
            Node newNode=new Node(d);
            head=newNode;
            return head;
        }
        else
        {   
            Node newNode=new Node(d);
            newNode.next=head;
            head=newNode;
            return head;
        }
    }
    
    //Function removes duplicates in linked list
    //@Params no arguments
    //@Returns head of list
    //Algoirthm has time complexity O(n)
    public Node removeDups()
    {   
        //create hashmap to track number of times a value appears in the list
        HashMap<Integer,Integer>freq=new HashMap();
        
        //temp reference to head
        Node currPtr=head;
        
        //follower pointer to currPtr
        Node prePtr=currPtr;
        
        while(currPtr!=null)
        {   
            //if the hashmap does not contain the data value of the current node
            //add it to the hashmap
            if (!freq.containsKey(currPtr.data))
            {
                freq.put(currPtr.data,0);
                
                //set follower pointer to point to currPtr
                prePtr=currPtr;
                
                //increment currPtr to next node in list
                currPtr=currPtr.next;
            }
            //if a duplicate is found, remove it
            else
            {   
                //set prePtr to poin to currPtr's next
                prePtr.next=currPtr.next;
                
                //increment currPtr to next node
                currPtr=currPtr.next;
            }
        }
        
        return head;
    }
    
    //function to print our linked list
    public void printList()
    {   
        Node currPtr=head;
        
        while(currPtr!=null)
        {
            System.out.print(currPtr.data+"->");
            currPtr=currPtr.next;
        }
        System.out.println("NULL");
    }
}
