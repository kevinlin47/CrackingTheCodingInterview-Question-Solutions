/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctci.pkg2.pkg1;

import java.util.Random;

/**
 *
 * @author Kevin Lin
 */
public class CTCI21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Instantiate a linked list object
        //Using our linked list class
        LinkedList ourList=new LinkedList();
        
        //add a few random values from 0-20 into our list
        for (int i=0;i<20;++i)
        {   
            //generate random number from 0-20
            Random rn=new Random();
            int randomNumber=rn.nextInt(21);
            
            //append the random number into the head of the list
            ourList.appendToHead(randomNumber);
        }
        
        //display our list
        ourList.printList();
        
        //call our remove deuplicate function
        ourList.removeDups();
        
        //display list after removing duplicates
        ourList.printList();
    }
    
}
