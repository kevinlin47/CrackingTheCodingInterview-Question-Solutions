/*
My Solution to interview question 1.6 in Cracking the Coding Interview
 */
package ctci.pkg1;

/**
 *
 * @author Kevin Lin
 */
public class CTCI16 {
    
    //Compressed a string based on the counts of repeared characters
    //Example aabcccccaaa = a2b1c5a3
    //@Param string to compress
    //@returns compressed string, or original string if the compressed string
    //is longer than the original string
    public static String stringCompression (String s)
    {
        StringBuilder sb=new StringBuilder();
        int consecutiveCounter=0;
        String compressedString;
        
        //Iterate through the string
        for (int i=0;i<s.length();++i)
        {
            //Increment counter to track number of repeated characters
            ++consecutiveCounter;
             
            //if we reach the last characer or there is a mis match
            //append the characters and current counter to the string builder
            //reset the counter
            if (i+1>=s.length() || s.charAt(i)!=s.charAt(i+1))
            {
                sb.append(s.charAt(i));
                sb.append(consecutiveCounter);
                consecutiveCounter=0;
            }
        }
        
        
        //convert the stringbuilder to a string
        compressedString=sb.toString();
        
        //check to see if the compressed string is larger than the original string
        //return original string if original string is shorter than the 
        //compressed string
        if (compressedString.length()>s.length())
        {
            return s;
        }
        //Other wise return our compressed string
        else
        {
            return compressedString;
        }
        
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Test string using example above 
        String t="aabcccccaaa";
        System.out.println(stringCompression(t));
      
        String t2="KKLIIINNN";
        System.out.println("\n"+stringCompression(t2));
    }
    
}
