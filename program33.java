/*
Input:
Rows: 3
Col: 4

Output: 

* * * *
* * * *
* * * *

*/

import java.util.*;

public class practice33{
    
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

        for(i=0;i<iRow;i++)
        {
            for(j=0;j<iCol;j++)
            {
                System.out.print("*"+"\t");
            }
            System.out.println("\n");
        }
    }
}