/*
My solution to cracking the coding interview question 2.4
 */
package pkg4;

import java.util.Random;

/**
 *
 * @author Kevin Lin
 */
public class CTCI24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //We will first test our partition function on the example list in the book
        LinkedList ourList=new LinkedList();
        ourList.appendToHead(1);
        ourList.appendToHead(2);
        ourList.appendToHead(10);
        ourList.appendToHead(5);
        ourList.appendToHead(8);
        ourList.appendToHead(5);
        ourList.appendToHead(3);
        
        //print our list
        ourList.printList();
        
        //now partition our list around the value 5
        ourList.partition(5);
        
        //print our new list
        ourList.printList();
        
        //now lets test it on a list with random values from 0-20
        LinkedList myList=new LinkedList();
        for (int i=0;i<20;++i)
        {
            Random rn=new Random();
            int randValue=rn.nextInt(21);
            myList.appendToHead(randValue);
        }
        
        //print our random list
        myList.printList();
        
        //partition the list around a random value from 0-20
        Random rn=new Random();
        int randPartitionValue=rn.nextInt(21);
        
        //Display partition value
        System.out.println("Partition List around : "+ randPartitionValue);
        
        myList.partition(randPartitionValue);
        
        //display our partitioned list
        myList.printList();
    }
    
}
