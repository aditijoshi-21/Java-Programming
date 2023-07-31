//Display sum of digits of number

import java.util.Scanner;

public class practice8 {

    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number: ");

        int iNo = sobj.nextInt();

        Digits obj = new Digits();

        int iRet = obj.SumDigits(iNo);
        System.out.println("The sum of digits is: "+iRet);

    }
    
}

class Digits
{
    public int SumDigits(int No)
    {
        int iDigit = 0, iSum=0;

        while(No != 0)
        {
            iDigit = No % 10;
            iSum = iSum + iDigit;
            No = No / 10;
        }

        return iSum;


    }
}
