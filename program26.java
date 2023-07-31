//Input : 7
//Output: 1 2 3 4 5 6 7

import java.util.*;

public class practice26 {
    
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
        for(int iCnt=1; iCnt<=iNo; iCnt++)
        {
            System.out.print(iCnt+"\t");
        }
    }
}