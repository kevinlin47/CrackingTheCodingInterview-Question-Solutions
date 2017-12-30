/*
My Solution to interview question 2.2 in Cracking the Coding Interview
 */
package pkg2;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Kevin Lin
 */
public class CTCI22 {
    
    
    public static void main(String[] args){
        
        //Create a test linked list for our return kth to last function
        LinkedList ourList=new LinkedList();
        
        //add 20 random numbers from 0-99 into our list
        for (int i=0;i<20;++i)
        {
            Random rn=new Random();
            int randomNumber=rn.nextInt(100);
            ourList.appendToHead(randomNumber);
        }
        
        //pinrt our list
        ourList.printList();
        
        //get last item from list
        Node kthToLast=ourList.kToLast(1);
        System.out.println(kthToLast.data);
        
        //get 2nd to last item from list
        kthToLast=ourList.kToLast(2);
        System.out.println(kthToLast.data);
        
        //get 5th to last item from list
        kthToLast=ourList.kToLast(5);
        System.out.println(kthToLast.data);
;
    }
    
}
