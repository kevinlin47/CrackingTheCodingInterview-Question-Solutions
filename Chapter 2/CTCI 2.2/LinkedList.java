/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2;

import java.util.ArrayList;
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
    
    //Function returns the kth to last elment in a singly linked list
    //@Params integer value k
    //@Returns kth item from the back of the list
    //Algorithm time complexity is O(n), but requires O(n) space 
    public Node kToLast(int k) 
    {   
        //Create a array list to copy nodes from the list
        ArrayList<Node> copy=new ArrayList();
        
        //counter to track the size of the list
        int counter=0;
        
        //temporary pointer set to point to the same thing as head pointer
        Node currPtr=head;
        
        //while we have not reached the end of the list
        //increment counter
        //copy the current node into the array list
        //increment currPtr to point to the next node
        while(currPtr!=null)
        {
            ++counter;
            copy.add(currPtr);
            currPtr=currPtr.next;
        }
        
        //Check to see if k is larger than our list or k is zero
        if(counter<k || k==0)
        {
            System.out.println("k is too large or k was entered as 0");
            return null;
        }
        
        //find index of the kth element in the array list
        //We find this by subtracting the size of the list by k
        int index=counter-k;
        
        //return the node in the array list at the calculated index
        return copy.get(index);
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
