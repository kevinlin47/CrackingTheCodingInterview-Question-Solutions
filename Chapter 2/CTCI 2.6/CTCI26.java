/*
My solution to interview question 2.6 in cracking the coding interview
 */
package pkg6;

/**
 *
 * @author Kevin Lin
 */
public class CTCI26 {

    public static void main(String[] args) {
        //We will create 3 linked lists to test our function
        
        LinkedList listOne=new LinkedList();
        LinkedList listTwo=new LinkedList();
        LinkedList listThree=new LinkedList();
        
        //list 1 will contain the numbers 0-4
        for (int i=0;i<5;++i)
        {
            listOne.appendToTail(i);
        }
        
        //list 2 will contain the numbers 5-10
        for (int i=5;i<=10;++i)
        {
            listTwo.appendToTail(i);
        }
        
        //list 3 we will create as 12321, which is a palindrome 
        listThree.appendToHead(1);
        listThree.appendToHead(2);
        listThree.appendToHead(3);
        listThree.appendToHead(2);
        listThree.appendToHead(1);
        
        //print the first list
        listOne.printList();
        
        //list one should display not as a palindrome
        if (listOne.isPalindrome()==true)
        {
            System.out.println("List is a palindrome");
        }
        else
        {
            System.out.println("List is not a palindrome");
        }
        
        //print the second list
        System.out.println();
        listTwo.printList();
        
        //list two should display not as a palindrome
        if (listTwo.isPalindrome()==true)
        {
            System.out.println("List is a palindrome");
        }
        else
        {
            System.out.println("List is not a palindrome");
        }
        
        //print the third list
        System.out.println();
        listThree.printList();
        
        //list three should display as a palindrome
        if (listThree.isPalindrome()==true)
        {
            System.out.println("List is a palindrome");
        }
        else
        {
            System.out.println("List is not a palindrome");
        }
    }
    
}
