/*
My Solution to interview question 2.3 in Cracking the Coding Interview
 */
package pkg3;

/**
 *
 * @author Kevin Lin
 */
public class CTCI23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //Create a test linked list, same as the book example
        LinkedList ourList=new LinkedList();
        ourList.appendToHead(12);
        ourList.appendToHead(9);
        ourList.appendToHead(5);
        ourList.appendToHead(1);
        
        //display our list
        ourList.printList();
        
        //if we wanted to delete node 9
        //first we must get node 9 at index 2
        Node toDelete=ourList.getNode(2);
        
        //to show that we got the correct node we will display the data in this node
        System.out.println(toDelete.data);
        
        //then call our deleteMiddleNode method, passing in the node we want deleted
        ourList.deleteMiddleNode(toDelete);
        
        //now print our new list
        ourList.printList();
        
        //Trying one more test, we will create a list from 0 to 30
        LinkedList myList=new LinkedList();
        
        for (int i=30;i>=0;--i)
        {
            myList.appendToHead(i);
        }
        
        //display our list
        myList.printList();
        
        //lets remove 15, since its in the middle
        toDelete=myList.getNode(15);
        myList.deleteMiddleNode(toDelete);
        
        //display updated list
        myList.printList();
        
        //remove node 3 as well just to test further
        toDelete=myList.getNode(3);
        myList.deleteMiddleNode(toDelete);
        myList.printList();
    }
    
}
