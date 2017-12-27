/*
My Solution to interview question 1.8 in Cracking the Coding Interview
 */
package ctci1.pkg8;

import java.util.Random;

/**
 *
 * @author Kevin Lin
 */
public class CTCI18 {
    
    //If an element in an MxN matrix is 0, its entire row and column are set to 0
    //@Param int 2-d matrix array
    //@Return void
    public static void ZeroMatrix(int m[][])
    {   
        //create two boolean arrays. to keep track of which rows
        //and which columns we should zero out
        boolean row[]=new boolean [m.length];
        boolean column[]=new boolean[m[0].length];
        
        //iterate through the given matrix to find any elements that are zero
        for (int i=0;i<m.length;++i)
        {
            for (int j=0;j<m[0].length;++j)
            {   
                //if zero element is found, we mark off which row and column
                //the zero was found in
                if (m[i][j]==0)
                {
                    row[i]=true;
                    column[j]=true;
                }
            }
        }
        
        //for all rows that contained a zero, set the rows to 0
        for (int i=0;i<row.length;++i)
        {
            if (row[i])
            {
                zeroRow(m,i);
            }
        }
        
        //for all columns that contained a zero, set the columns to 0
        for (int j=0;j<column.length;++j)
        {
            if (column[j])
            {
                zeroCol(m,j);
            }
        }
    }
    
    //helper function to replace a row with 0 in a matrix
    public static void zeroRow(int m[][],int row)
    {
        for (int i=0;i<m[0].length;++i)
        {
            m[row][i]=0;
        }
    }
    
    //helper function to replace a column with 0 in a matrix
    public static void zeroCol(int m[][],int col)
    {
        for (int i=0;i<m.length;++i)
        {
            m[i][col]=0;
        }
    }
    
    public static void main(String[] args) {
        
        //Generate three random test matrices of size MxN (1 to 10)
        for (int i=0;i<3;++i)
        {
            Random rn=new Random();
            int m=rn.nextInt(10)+1;
            int n=rn.nextInt(10)+1;
            int matrix[][]=new int[m][n];
            
            //fill matrix with random values (0-20)
            for (int k=0;k<m;++k)
            {
                for (int j=0;j<n;++j)
                {
                    matrix[k][j]=rn.nextInt(21);
                }
            }
            
            //display matrix
            System.out.println("\nOriginal Matrix:");
            print(matrix);
            
            //Display matrix after function call
            System.out.println("\nZero Matrix:");
            ZeroMatrix(matrix);
            print(matrix);
        }
    }

    //helper function to print matrix
    public static void print(int m[][])
    {
        for (int i=0;i<m.length;++i)
        {
            for (int j=0;j<m[0].length;++j)
            {
                System.out.print(m[i][j]+"\t");
            }
            System.out.println();
        }
    }

}
