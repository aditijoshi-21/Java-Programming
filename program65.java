//Accept string and count small letters

package Java;

import java.util.Scanner;

public class program65 {
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the string: ");

        String str = sobj.nextLine();

        StringX obj = new StringX();

        int iRet = obj.CountSmall(str);

        System.out.println("Count of small letters is: "+iRet);

    }
    
}

class StringX
{
    public int CountSmall(String str)
    {
        char Arr[] = str.toCharArray();
        int iCount = 0;

        for(int i=0; i< Arr.length; i++)
        {
            if((Arr[i] >= 'a') && (Arr[i] <= 'z'))
            {
                iCount++;
            }
        }

        return iCount;

    }
}
