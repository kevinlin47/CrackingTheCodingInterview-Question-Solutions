/*
My solution to interview questions 1.3 in Cracking the Coding Interview
 */
package ctci1.pkg3;

/**
 *
 * @author Kevin Lin
 */
public class CTCI13 {

    /**
     * @param args the command line arguments
     */
    
    //Function replaces all spaces in a string with "%20"
    //There is a given buffer at the end of the string to accomadate for the
    //extra characters.
    //Parameters true length of string (excluding end buffer), and the string to edit
    String URLify(String s,int length)
    {   
        //Convert the string to a char array
        char charArray[]=s.toCharArray();
        
        //offset for replacing characters in the array
        int offset=1;
        
        //iterate through the char array by the true length
        for (int i=length;i>0;--i)
        {   
            //if the character is not a space we push it to the back of the array
            if (charArray[i-1]!=' ')
            {
                charArray[charArray.length-offset]=charArray[i-1];
                ++offset;
            }
            //other wise we push %20 to the back of the array
            else
            {
                charArray[charArray.length-offset]='0';
                charArray[charArray.length-offset-1]='2';
                charArray[charArray.length-offset-2]='%';
                offset=offset+3;

            }
        }
        
        //convert the char array back into a string
        String result=new String(charArray);
        
        return result;
    }
            
    public static void main(String[] args) {
        // TODO code application logic here
        String input="Mr John Smith    ";
        int trueLength=13;
        
        CTCI13 a=new CTCI13();
        System.out.println(input);
        System.out.println(a.URLify(input, trueLength));
    }
    
}
