//Accept digit and number and Count frequency of digit in the number

import java.util.*;
public class program10 {

    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int iNo = sobj.nextInt();

        System.out.println("Enter the digit you want to search: ");
        int Digit = sobj.nextInt();

        Digits obj = new Digits();
        int iRet = obj.CountDigit(iNo,Digit);

        System.out.println("Count of digit in number: "+iRet);

    }  
}

class Digits
{
    public int CountDigit(int No, int Digit)
    {
        int iDigit = 0,iCount=0;

        while(No != 0)
        {
            iDigit = No % 10;
            if(iDigit == Digit)
            {
                iCount++;
            }
            No = No / 10;
        }

        return iCount;

    }
    
}


