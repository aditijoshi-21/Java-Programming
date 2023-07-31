//Input : 7
//Output: 2 4 6 8 10 12 14 

import java.util.*;

public class practice31{
    
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
            System.out.print(iCnt*2+"\t");
        }
    }
}