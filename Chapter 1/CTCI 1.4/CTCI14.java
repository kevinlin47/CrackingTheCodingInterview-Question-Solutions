/*
My Solution to interview question 1.4 in Cracking the Coding Interview
 */
package ctci.pkg1.pkg4;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Kevin Lin
 */

public class CTCI14 {

    /**
     * @param args the command line arguments
     */
    
    //Function checks to see if a string is a permutation of a palindrome
    //Returns true if the input string is a permutation of a palindrome 
    //Algorithm has O(n) time complexity.
    public static boolean palindromePermutation(String s)
    {   
        //Remove all spaces in the string
        s=s.replaceAll("\\s","");
        
        //Convert all letters to lowercase form
        s=s.toLowerCase();
        
        //Create hashmap for tracking frequency of each character in string
        HashMap<Character,Integer>track=new HashMap();
        
        //counter to track amount of characters with odd frequencies
        int oddCount=0;
        
        for (int i=0;i<s.length();++i)
        {
            if (!track.containsKey(s.charAt(i)))
            {
                track.put(s.charAt(i),1);
            }
            else
            {
                track.put(s.charAt(i), track.get(s.charAt(i))+1);
            }
            
            if (track.get(s.charAt(i)) % 2 != 0)
            {
                ++oddCount;
            }
            else
            {
                --oddCount;
            }
        }
        
        return oddCount<=1;
    }
    
    public static void main(String[] args) {
        //I created a JUnit test to test my function, but we can also test 
        //a few strings here in main.
        
        String a="Tact Coa"; //Taco Cat should return true
        String b="Maalyalma"; //Malayalam should return true
        String c="god"; //Dog should return false
        String d="Musci"; //Music should return false;
        
        ArrayList<String> testList=new ArrayList();
        testList.add(a);
        testList.add(b);
        testList.add(c);
        testList.add(d);
        
        for (int i=0;i<testList.size();++i)
        {
            System.out.println(testList.get(i)+": "+palindromePermutation(testList.get(i)));
        }
        
    }
    
}
