/*
My Solution to interview question 1.5 in Cracking the Coding Interview
 */
package ctci.pkg1.pkg5;

import java.util.HashMap;

/**
 *
 * @author Kevin Lin
 */
public class CTCI15 {

    /**
     * @param args the command line arguments
     */
    
    //helper function to check for number of character replacments
    public static boolean checkReplace(String a, String b)
    {
        int differenceCounter=0;
        
        for (int i=0;i<a.length();++i)
        {
            if (a.charAt(i)!=b.charAt(i))
            {
                ++differenceCounter;
            }
            if (differenceCounter>1)
            {
                return false;
            }
        }
        
        return true;
    }
    
    //Helper function to check for number of insertions or removals
    public static boolean checkInsertOrRemoval(String a, String b)
    {
        int differenceCounter=0;
        
        int indexA=0;
        int indexB=0;
        
        for (int i=0;i<b.length();++i)
        {
            if (b.charAt(indexB)!=a.charAt(indexA))
            {
                ++indexA;
                ++differenceCounter;
                --i;
            }
            else
            {
                ++indexB;
                ++indexA;
            }
            
            if (differenceCounter>1)
            {
                return false;
            }
        }
        
        return true;
    }
    
    //There are three types of edits:
    //1. Removal of a character
    //2. Insertion of a character
    //3. Replacement of a characer
    //Fuction checks to see if two given strings are one or zero edits away
    //From being equal
    //@Param Two strings
    //@Returns true if one or zero edits are required to make the strings equal
    //false otherwise
    public static boolean oneAway(String a,String b)
    {   
        if (a.equals(b))
        {
            return true;
        }
        else
        {
            if (a.length()==b.length())
            {
                return checkReplace(a,b);
            }
            else if (Math.abs(a.length()-b.length())==1)
            {
                if (b.length()>a.length())
                {
                    return checkInsertOrRemoval(b,a);
                }
                else
                {
                    return checkInsertOrRemoval(a,b);
                }
            }
            else
            {
                return false;
            }
        }
    }

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Test cases for our function
        String a="pale"; String b="ple"; //expect to return true
        String c="pales"; String d="pale"; //expect to return true;
        String e="pale"; String f="bake"; //expect to return false;
        
        System.out.println("("+a+","+b+") -> "+oneAway(a,b));
        System.out.println("("+c+","+d+") -> "+oneAway(c,d));
        System.out.println("("+e+","+f+") -> "+oneAway(e,f));
        
        String g="Whale"; String h="Wale"; //expect to return true
        String j="Whals"; //expect to return true
        String k="wckle";  //expect to return false;
        String l="Waale"; //expect to return true
        String m="Waaae"; //expect to return false;
        
        System.out.println();
        System.out.println("("+g+","+h+") -> "+oneAway(g,h));
        System.out.println("("+g+","+j+") -> "+oneAway(g,j));
        System.out.println("("+k+","+g+") -> "+oneAway(k,g));
        System.out.println("("+g+","+l+") -> "+oneAway(g,l));
        System.out.println("("+g+","+m+") -> "+oneAway(g,"m"));
        

    }
    
}
