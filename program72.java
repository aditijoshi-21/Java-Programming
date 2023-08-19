//Accept string and remove white spaces

package Java;

import java.util.Scanner;

public class program72 {
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
        return str.replaceAll("\\s", "");
    }
}
