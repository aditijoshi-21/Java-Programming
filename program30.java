//Input : 7
//Output: a 1 b 2 c 3 d 4 e 5 f 6 g 7

import java.util.*;

public class practice30{
    
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
        char ch = '\0';
        int iCnt=0;

        for(iCnt=1; iCnt<=iNo; iCnt++,ch++)
        {
            System.out.print(ch+"\t"+iCnt+"\t");
        }
    }
}