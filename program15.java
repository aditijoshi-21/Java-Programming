//Accept number and print average of its digit

import java.util.*;
public class practice15 {

    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int iNo = sobj.nextInt();

        Digits obj = new Digits();
        float iRet = obj.AvgDigit(iNo);

        System.out.println("Average of digits in number: "+iRet);

    }  
}

class Digits
{
    public float AvgDigit(int No)
    {
        int iDigit = 0,iCount=0;
        float iSum = 0;

        while(No != 0)
        {
            iDigit = No % 10;
            iSum = iSum + iDigit;
            iCount++;
            No = No / 10;
        }

        return (iSum / iCount);

    }
    
}


