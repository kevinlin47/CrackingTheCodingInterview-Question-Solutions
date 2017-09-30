/*
My Solution to interview question 1.1 in Cracking the Coding Interview
 */
package ctci.pkg1.pkg1;

import java.util.*;

/**
 *
 * @author Kevin Lin
 */
public class CTCI11 {

    /**
     * @param args the command line arguments
     */
    
    //Function checks to see if a string contains all unqiue characters
    //Returns true if all characters are unique, false otherwise.
    //This is the way I would solve it using a data structure.
    //Algorithm has O(n) time complexity.
    boolean uniqueString(String s)
    {   
        //if the string is longer than 128 characters than it cannot be unique.
        if(s.length()>128)
        {
            return false;
        }
        
        //instantiate a hashmap for character tracking
        HashMap<Character,Integer>track=new HashMap();
        
        //iterate through the string placeing characters as keys into the hashmap
        for (int i=0;i<s.length();++i)
        {   
            //if the map does not contain the character add it as a new key
            if (!track.containsKey(s.charAt(i)))
            {
                track.put(s.charAt(i),0);
            }
            
            // if the map does contain this character then we know the string 
            //does not have all unqiue characters and we return false.
            else
            {
                return false;
            }
        }
        
        return true;
    }
    
    //Function checks to see if a string contains all unqiue characters
    //Returns true if all characters are unique, false otherwise.
    //This is the way I would solve it if we could not use a data structure.
    //Algorithm has O(n^2) time complexity.
    boolean uniqueString2(String s)
    {   
        for (int i=0;i<s.length()-1;++i)
        {
            for (int j=i;j<s.length()-1;++j)
            {
                if (s.charAt(i)==s.charAt(j+1))
                {
                    return false;
                }
            }
        }
        
        return true;
    }
            
    public static void main(String[] args) {
        // TODO code application logic here
        
        CTCI11 a=new CTCI11();
        
        String s="Java"; //not unique string
        String s2="binary"; //unique string
        
        //test cases for data structure method.
        System.out.println(a.uniqueString(s));
        System.out.println(a.uniqueString(s2));
        
        //test cases for non data structure method.
        System.out.println();
        System.out.println(a.uniqueString2(s));
        System.out.println(a.uniqueString2(s2));

        

    }
    
}
