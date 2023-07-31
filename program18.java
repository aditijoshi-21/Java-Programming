//Accept and display elements of array

import java.util.*;
public class practice18{

    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number of elements in array: ");
        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the elements: ");
        
        for(int iCnt=0; iCnt < iSize; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        System.out.println("The elements are: ");

        for(int iCnt=0; iCnt < iSize; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }

        sobj.close();
    }  
}



