//Accept string and reverse string

package Java;

import java.util.Scanner;

public class program73 {
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the string: ");

        String str = sobj.nextLine();

        StringX obj = new StringX();

        String sRet = obj.ReverseString(str);

        System.out.println("Converted string is: "+sRet);

    }
    
}

class StringX
{
    public String ReverseString(String str)
    {
        char Arr[] = str.toCharArray();

        int iStart=0;
        int iEnd = Arr.length - 1;

        char cTemp = ' ';

        while(iStart<iEnd)
        {
            cTemp = Arr[iStart];
            Arr[iStart] = Arr[iEnd];
            Arr[iEnd] = cTemp;

            iStart++;
            iEnd--;
        }

        String ret = new String(Arr);

        return ret;
    }
}
