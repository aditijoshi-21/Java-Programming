/*
Input:
Rows: 4
Col: 4

Output: 
* * * *
  * * *
    * *
      * 
*/

import java.util.*;

public class program55{
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter row: ");
        int iRow = sobj.nextInt();

        System.out.println("Enter column: ");
        int iCol = sobj.nextInt();

        Pattern obj = new Pattern();
        obj.Display(iRow, iCol);

    }
    
}

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i=0,j=0;

        if(iRow!=iCol)
        {
            System.out.println("Invalid input");
            return;
        }

        for(i=iRow;i>=1;i--)
        {
            for(j=iCol;j>=1;j--)
            {
                if(i>=j)
                {
                    System.out.print("*"+"\t");
                } 
                else
                {
                    System.out.print(""+"\t");
                }
            
            }

            System.out.println("\n");

        }

    }
}
