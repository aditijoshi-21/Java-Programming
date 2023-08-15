/*
Input:
Rows: 4
Col: 4

Output: 
A
A B 
A B C
A B C D E
A B C D E F 

*/

import java.util.Scanner;

public class program49 {
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
        char ch = '\0';

        if(iRow!=iCol)
        {
            System.out.println("Invalid input");
            return;
        }

        for(i=1;i<=iRow;i++)
        {
            for(j=1,ch='A';j<=iCol;j++,ch++)
            {
                if(i>=j)
                {
                    System.out.print(ch+"\t");
                }

                
            }

            System.out.println("\n");

        }

    }
}
