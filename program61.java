//Accept character from user and check whether its digit or not

import java.util.*;

public class program61 {
    public static void main(String Arr[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the character: ");

        char str = sobj.next().charAt(0);

        StringX obj = new StringX();

        boolean bRet = obj.CheckDigit(str);

        if(bRet==true)
        {
            System.out.println("Character is digit");
        }

        else
        {
            System.out.println("Character is not digit");
        }

    }
}

class StringX
{
    public boolean CheckDigit(char str)
    {
        boolean bFlag = false;

            if((str >= '0') &&(str <= '9'))
            {
                bFlag = true;
            }
        

        return bFlag;

    }
}