//Accept string and convert small to capital

package Java;

import java.util.Scanner;

public class program68 {
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the string: ");

        String str = sobj.nextLine();

        StringX obj = new StringX();

        String sRet = obj.StrtoLower(str);

        System.out.println("Converted string is: "+sRet);

    }
    
}

class StringX
{
    public String StrtoLower(String str)
    {
        char Arr[] = str.toCharArray();

        for(int i=0; i< Arr.length; i++)
        {
            if((Arr[i] >= 'a') && (Arr[i] <= 'z'))
            {
                Arr[i] = (char)(Arr[i] - 32);
            }
        }

        String ret = new String(Arr);

        return ret;
    }
}
