/*
My Solution to interview question 1.7 in Cracking the Coding Interview
 */
package ctci.pkg1.pkg7;

/**
 *
 * @author Kevin Lin
 */
public class CTCI17 {
    
    //Rotate a matrix by 90 degrees
    //@Params NxN matrix
    //@Returns void
    //Algorithm has O(N^2) time complexity 
    public static void rotateMatrix(int m[][])
    {   
        //Check to see if the passed matrix is valid for our function
        if (m.length==0 || m[0].length!=m.length)
        {   
            System.out.println("Invalid Matrix");
            return;
        }
        else
        {
            int n=m.length;
            
            for (int i=0;i<n/2;++i)
            {
                int first=i;
                int last=n-1-i;
                
                for (int j=i;j<last;++j)
                {
                    int offSet=j-first;
                    int top=m[i][j];
                    
                    //swap top and left
                    m[first][j]=m[last-offSet][first];
                    
                    //swap bottom and left
                    m[last-offSet][first]=m[last][last-offSet];
                    
                    //swap right and bottom
                    m[last][last-offSet]=m[j][last];
                    
                    //swpa top and right
                    m[j][last]=top;
                }
            }
        }
    }
            
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Test matrix
        int testMatrix[][]=new int [5][5];
        int matrixValue=0;
        
        //initialize values 
        for (int i=0;i<5;++i)
        {
            for (int j=0;j<5;++j)
            {
                testMatrix[i][j]=matrixValue;
                ++matrixValue;
            }
        }
        
        //print original matrix
        for (int i=0;i<5;++i)
        {   
            for (int j=0;j<5;++j)
            {
                System.out.print(testMatrix[i][j]+"\t");
            }
            System.out.println();
        }
        
        //call rotate matrix function, passing in our test matrix
        rotateMatrix(testMatrix);
        
        //print our rotated matrix
        System.out.println();
        for (int i=0;i<5;++i)
        {   
            for (int j=0;j<5;++j)
            {
                System.out.print(testMatrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
    
}
