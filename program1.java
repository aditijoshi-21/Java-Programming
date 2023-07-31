//Accept number from user and display the factors of that number

import java.util.Scanner;

public class program1{

    public static void Factor(int iValue)
    {
        for(int iCnt = 1; iCnt <= iValue; iCnt ++)
        {
            if(iValue % iCnt == 0)
            {
                Scanner sobj = new Scanner(System.in);
                System.out.print(iCnt+"\t");
            }
        }
    }

    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number: ");

        int iNo = sobj.nextInt();

        Factor(iNo);
                    
        sobj.close();
    
    }
}
