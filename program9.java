//Accept digit and number and check whether the digit is present or not in the number

import java.util.*;
public class practice9 {

    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int iNo = sobj.nextInt();

        System.out.println("Enter the digit you want to search: ");
        int Digit = sobj.nextInt();

        Digits obj = new Digits();
        boolean bRet = obj.CheckDigit(iNo,Digit);

        if(bRet == true)
        {
            System.out.println("Digit is present in number");
        }
        else
        {
            System.out.println("Digit is not present in number");
        }

    }  
}

class Digits
{
    public boolean CheckDigit(int No, int Digit)
    {
        boolean bFlag = false;
        int iDigit = 0;

        while(No != 0)
        {
            iDigit = No % 10;
            if(iDigit == Digit)
            {
                bFlag = true;
                break;
            }
            No = No / 10;
        }

        return bFlag;

    }
    
}

