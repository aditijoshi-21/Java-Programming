//Display number of digits in number

import java.util.Scanner;

public class practice7 {

    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number: ");

        int iNo = sobj.nextInt();

        CountDigits obj = new CountDigits();

        int iRet = obj.Count(iNo);
        System.out.println("The number of digits are: "+iRet);

    }
    
}

class CountDigits
{
    public int Count(int No)
    {
        int iDigit = 0, iCount=0;

        while(No != 0)
        {
            iDigit = No % 10;
            iCount++;
            No = No / 10;
        }

        return iCount;


    }
}
