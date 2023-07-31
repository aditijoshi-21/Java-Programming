//Accept number from user and check whether the number is prime or not

import java.util.Scanner;

public class practice3 {
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iNo = sobj.nextInt();

        boolean bRet = CheckPrime(iNo);

        if(bRet == true)
        {
            System.out.println("Number is prime");
        }
        else
        {
            System.out.println("Number is not prime");
        }


    }

    public static boolean CheckPrime(int iValue)
    {
        boolean bFlag = true;

        for(int iCnt = 2; iCnt < iValue; iCnt++)
        {
            if(iValue % iCnt == 0)
            {
                bFlag = false;
                break;
            }
        }

        return bFlag;
    }
    
}
