//Accept a number from user and find factorial of that number

import java.util.*;

public class practice5 {

    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number: ");
        int iNo = sobj.nextInt();

        int iRet = Factorial(iNo);

        System.out.println("Factorial is: "+iRet);

        sobj.close();

    }

    public static int Factorial(int iValue)
    {
        int iFact = 1;

        for(int iCnt = 1; iCnt <= iValue; iCnt++)
        {
            iFact = iFact * iCnt;
        }

        return iFact;
    }
    
}
