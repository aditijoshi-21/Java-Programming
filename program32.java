//Input : 5
//Output: 1 2 3 4 5 5 4 3 2 1 

import java.util.*;

public class practice32{
    
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int iNo = sobj.nextInt();

        Pattern obj = new Pattern();
        obj.Display(iNo);

        sobj.close();
        
    }
}

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt=1;

        for(iCnt=1; iCnt<=iNo; iCnt++)
        {
            System.out.print(iCnt+"\t");
        }

        for(iCnt=iNo; iCnt>0; iCnt--)
        {
            System.out.print(iCnt+"\t");
        }
    }
}