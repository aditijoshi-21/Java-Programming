/*
Input:
Rows: 4
Col: 4

Output: 
* a a a a a 
b * b b b b   
c c * c c c 
d d d * d d 
e e e e * e 
f f f f f * 


*/

import java.util.Scanner;

public class program50 {
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

        for(i=1,ch='a';i<=iRow;i++,ch++)
        {
            for(j=1;j<=iCol;j++)
            {
                if(i==j)
                {
                    System.out.print("*"+"\t");
                }
                else
                {
                    System.out.print(ch+"\t");
                }

                
            }

            System.out.println("\n");

        }

    }
}
