//Input : 7
//Output: a b c d e f g

import java.util.*;

public class practice29 {
    
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int iNo = sobj.nextInt();

        Pattern obj = new Pattern();
        obj.DisplayCap(iNo);
        obj.DisplaySml(iNo);

        sobj.close();
        
    }
}

class Pattern
{
    public void DisplayCap(int iNo)
    {
        char ch = '\0';
        int iCnt=0;

        for(iCnt=0, ch='A'; iCnt<iNo; iCnt++,ch++)
        {
            System.out.print(ch+"\t");
        }
    }

    public void DisplaySml(int iNo)
    {
        char ch = '\0';
        int iCnt=0;

        for(iCnt=0, ch='a'; iCnt<iNo; iCnt++,ch++)
        {
            System.out.print(ch+"\t");
        }
    }
}