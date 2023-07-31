//Accept number and print reverse number

import java.util.*;
public class practice13 {

    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int iNo = sobj.nextInt();

        Digits obj = new Digits();

        int iRet = obj.RevNumber(iNo);

        System.out.print("Reverse number is: "+iRet);

    }  
}

class Digits
{
    public int RevNumber(int No)
    {
        int iDigit = 0,iRev=0;

        while(No != 0)
        {
            iDigit = No % 10;
            iRev = (iRev*10)+iDigit;
            No = No / 10;
        }

        return iRev;

    }
    
}


