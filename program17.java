//Accept number and print largest digit

import java.util.*;
public class practice17{

    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int iNo = sobj.nextInt();

        Digits obj = new Digits();
        int iRet = obj.MaxDigit(iNo);

        System.out.println("Largest digit in number: "+iRet);

    }  
}

class Digits
{
    public int MaxDigit(int No)
    {
        int iDigit = 0,iMax = 0;

        while(No != 0)
        {
            iDigit = No % 10;
            if(iDigit > iMax)
            {
                iMax = iDigit;
            }
            No = No / 10;
        }

        return iMax;

    }
    
}


