//Input : 7
//Output: # # # # # # #

import java.util.*;

public class practice25 {
    
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
        for(int iCnt=0; iCnt<iNo; iCnt++)
        {
            System.out.print("#"+"\t");
        }
    }
}