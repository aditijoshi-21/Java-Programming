import java.util.Scanner;

public class practice4 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iNo = sobj.nextInt();

        System.out.println("Enter the power: ");
        int iPower = sobj.nextInt();

        int iRet = Power(iNo, iPower);

        System.out.println("The result is: "+iRet);

    }

    public static int Power(int iValue, int iPower)
    {
        int iResult = 1;

        for(int iCnt = 1; iCnt <= iPower; iCnt++)
        {
            iResult = iResult * iValue;  
        }

        return iResult;
    }
    
}
