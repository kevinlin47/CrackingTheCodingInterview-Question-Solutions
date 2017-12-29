/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctci.pkg19;

/**
 *
 * @author Kevin Lin
 */
public class CTCI19 {
    
    //Function checks if s2 is a substring of s1
    public static boolean isSubstring(String s1,String s2)
    {
        s1.toLowerCase();
        s2.toLowerCase();
        
        return s1.contains(s2);
    }
    
    //Function checks to see if string s2 is a rotation of string s1
    //Igoring capital letters
    //@Params two strings s1 and s2
    //@Returns true if s2 is a rotation of s1, false otherwise
    public static boolean StringRotation(String s1,String s2)
    {   
        //if length of strings are not equal
        //than it is obvious that s2 is not a rotation of s1
        if (s2.length()!=s1.length())
        {
            return false;
        }
        
        //convert both strings to lowercase
        s1.toLowerCase();
        s2.toLowerCase();
        
        //concatenate string s1 with itself
        s1=s1+s1;
        
        //check to see if s2 is contained in s1 concatenated with itself
        return isSubstring(s1,s2);
    }

    public static void main(String[] args) {
        
        //Testing our function using the book example
        //Function should return true
        String s1="erbottlewat";
        String s2="waterbottle";
        
        boolean result=StringRotation(s1,s2);
        
        System.out.println(result);
        
        //Testing function with custom test cases
        //Function should return true
        String s3="cattaco";
        String s4="tacocat";
        result=StringRotation(s3,s4);
        System.out.println(result);
        
        //Function should return false
        String s5="pikachu";
        String s6="pikachh";
        result=StringRotation(s5,s6);
        System.out.println(result);
        
        //Function should return false
        String s7="kayn";
        String s8="zoe";
        result=StringRotation(s7,s8);
        System.out.println(result);
    }
    
}
