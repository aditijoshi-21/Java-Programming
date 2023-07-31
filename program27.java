//Input : 7
//Output: 7 6 5 4 3 2 1

import java.util.*;

public class practice27 {
    
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
        for(int iCnt=iNo; iCnt>0; iCnt--)
        {
            System.out.print(iCnt+"\t");
        }
    }
}