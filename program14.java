//Accept number and check if it is palindrome

import java.util.*;
public class practice14 {

    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int iNo = sobj.nextInt();

        Digits obj = new Digits();

        boolean bRet = obj.CheckPalindrome(iNo);

        if (bRet == true)
        {
            System.out.println("The number is palindrome");
        }
        else
        {
            System.out.println("The number is not palindrome");
        }
    }  
}

class Digits
{
    public boolean CheckPalindrome(int No)
    {
        int iDigit = 0, iRev =0;
        boolean bFlag = false;
        int itemp = No;

        while(No != 0)
        {
            iDigit = No % 10;
            iRev = (iRev*10)+iDigit;
            No = No / 10;
        }

        if(iRev == itemp)
        {
            bFlag = true;
        }
        
        return bFlag;

    }
    
}


