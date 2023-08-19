//Accept string and count capital letters

package Java;

import java.util.Scanner;

public class program66 {
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the string: ");

        String str = sobj.nextLine();

        StringX obj = new StringX();

        int iRet = obj.CountSmall(str);

        System.out.println("Count of capital letters is: "+iRet);

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
            if((Arr[i] >= 'A') && (Arr[i] <= 'Z'))
            {
                iCount++;
            }
        }

        return iCount;

    }
}
