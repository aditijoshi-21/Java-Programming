/*
Input:
Rows: 6
Col: 6

Output: 
* * * * * *
& & & & & &
& & & & & &
& & & & & &
& & & & & &
* * * * * *

*/


import java.util.Scanner;

public class program41 {
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter row: ");
        int iRow = sobj.nextInt();

        System.out.println("Enter column: ");
        int iCol = sobj.nextInt();

        Pattern obj = new Pattern();
        obj.Display(iRow,iCol);
    }
    
}

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i=0,j=0;

        for(i=1; i<=iRow; i++)
        {
            for(j=1; j<=iCol; j++)
            {
                if((i==1) || (i==iRow))
                {
                    System.out.print("*"+"\t");
                }

                else
                {
                    System.out.print("&"+"\t");

                }

            }

            System.out.println("\n");
        }

    }

}
