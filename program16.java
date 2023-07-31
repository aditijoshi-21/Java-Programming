//Accept number and print smallest digit

import java.util.*;
public class practice16{

    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int iNo = sobj.nextInt();

        Digits obj = new Digits();
        int iRet = obj.MinDigit(iNo);

        System.out.println("Smallest digit in number: "+iRet);

    }  
}

class Digits
{
    public int MinDigit(int No)
    {
        int iDigit = 0,iMin = 9;

        while(No != 0)
        {
            iDigit = No % 10;
            if(iDigit < iMin)
            {
                iMin = iDigit;
            }
            No = No / 10;
        }

        return iMin;

    }
    
}


