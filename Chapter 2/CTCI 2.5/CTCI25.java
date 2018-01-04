/*
My solution to interview question 2.5 in cracking the coding interview
 */
package ctci.pkg2.pkg5;

import java.util.Random;

/**
 *
 * @author Kevin Lin
 */
public class CTCI25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //We will create two lists that are the same as the ones used in the
        //book example to test our addLists function
        LinkedList ourList=new LinkedList();
        ourList.appendToTail(7);
        ourList.appendToTail(1);
        ourList.appendToTail(6);
        
        ourList.printList();
        
        LinkedList myList=new LinkedList();
        myList.appendToTail(5);
        myList.appendToTail(9);
        myList.appendToTail(2);
        
        myList.printList();
        
        LinkedList summedList=new LinkedList();
        summedList.sumLists(ourList.getHead(),myList.getHead(),0);
        
        summedList.printList();
        
        //Test on two lists that are different size
        LinkedList list1=new LinkedList();
        LinkedList list2=new LinkedList();
        
        for (int i=0;i<4;++i)
        {
            Random rn=new Random();
            int randValue=rn.nextInt(10);
            list1.appendToHead(randValue);
        }
        
        for (int i=0;i<3;++i)
        {
            Random rn=new Random();
            int randValue=rn.nextInt(10);
            list2.appendToHead(randValue);
        }
        
        System.out.println();
        list1.printList();
        list2.printList();
        
        summedList.sumLists(list1.getHead(),list2.getHead(),0);
        summedList.printList();
    }
    
}
