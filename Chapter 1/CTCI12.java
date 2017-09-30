/*
My Solution to interview questions 1.2 in Cracking the Coding Interview
 */
package ctci.pkg1.pkg2;

import java.util.Arrays;

/**
 *
 * @author Kevin Lin
 */
public class CTCI12 {

    /**
     * @param args the command line arguments
     */
    //function checks if one string is a permutation of the other.
    //assume case sensitivity matters and white space matters
    //returns true if one is a permutation of the other, false otherwise
    //if we do not consider the conversion of the string into a char array 
    //and comparison of the two arrays
    //then algorithm is O(nlogn).
    boolean isPermutaion(String a, String b)
    {   
        //if the strings are not the same length, than they cannot be 
        //permutations of one another.
        if (a.length()!=b.length())
        {
            return false;
        }
        else
        {   
            //convert the strings into char arrays
            char s1[]=a.toCharArray();
            char s2[]=b.toCharArray();
            
            //sort the two char arrays
            Arrays.sort(s1);
            Arrays.sort(s2);
            
            //compare the two arrays, if they are the same than they are 
            //permutations of one another, and we return true
            if (Arrays.equals(s1,s2))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        CTCI12 test=new CTCI12();
        
        String a="nap";
        String b="pan";
        
        String c="Nap";
        
        //Test Cases
        System.out.println(test.isPermutaion(a, b)); //true
        System.out.println(test.isPermutaion(c, b)); //false
        
    }
    
}
