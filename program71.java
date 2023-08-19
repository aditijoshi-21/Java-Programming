//Accept string and remove white spaces

package Java;

import java.util.Scanner;

public class program71 {
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the string: ");

        String str = sobj.nextLine();

        StringX obj = new StringX();

        String sRet = obj.RemoveWhiteSpaces(str);

        System.out.println("Converted string is: "+sRet);

    }
    
}

class StringX
{
    public String RemoveWhiteSpaces(String str)
    {
        char Arr[] = str.toCharArray();

        String output = "";

        for(int i=0; i< Arr.length; i++)
        {
            if(Arr[i] != ' ')
            {
                output = output + Arr[i];
            }
        }

        return output;
    }
}
