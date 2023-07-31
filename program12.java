//Accept number and Count frequency of odd digit in the number

import java.util.*;
public class practice12 {

    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int iNo = sobj.nextInt();

        Digits obj = new Digits();
        int iRet = obj.CountDigit(iNo);

        System.out.println("Count of odd digit in number: "+iRet);

    }  
}

class Digits
{
    public int CountDigit(int No)
    {
        int iDigit = 0,iCount=0;

        while(No != 0)
        {
            iDigit = No % 10;
            if((iDigit % 2) != 0)
            {
                iCount++;
            }
            No = No / 10;
        }

        return iCount;

    }
    
}


