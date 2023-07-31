/*
Input:
Rows: 4
Col: 5

Output: 
# # # # #
* * * * *
# # # # #
* * * * * 

*/

import java.util.*;

public class practice35{
    
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the row: ");
        int iRow = sobj.nextInt();

        System.out.println("Enter the column: ");
        int iCol = sobj.nextInt();

        Pattern obj = new Pattern();
        obj.Display(iRow,iCol);

        sobj.close();
        
    }
}

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i=0, j=0;

        for(i=1;i<=iRow;i++)
        {
            for(j=1;j<=iCol;j++)
            {
                if((i%2)==0)
                {
                    System.out.print("*"+"\t");
                }
                else
                {
                    System.out.print("#"+"\t");
                   
                }

            }
            System.out.println("\n");
        }
    }
}