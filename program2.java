//Accept number from user and display whether the given number is perfect or not

import java.util.*;

public class program2 {

    public static boolean CheckPerfect(int iValue)
    {
        int iSum = 0;

        for(int iCnt=1; iCnt < iValue; iCnt++)
        {

            if(iValue % iCnt == 0)
            {
                iSum = iSum + iCnt;
            }
        }

        if(iSum == iValue)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iNo = sobj.nextInt();

        boolean bRet = CheckPerfect(iNo);

        if(bRet==true)
        {
            System.out.println("Number is perfect");
        }
        else
        {
            System.out.println("Number is not perfect");
        }
    }
}
