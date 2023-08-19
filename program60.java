//Accept character from user and check whether its small or not

import java.util.*;

public class program60 {
    public static void main(String Arr[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the character: ");

        char str = sobj.next().charAt(0);

        StringX obj = new StringX();

        boolean bRet = obj.CheckSmall(str);

        if(bRet==true)
        {
            System.out.println("Character is in capital");
        }

        else
        {
            System.out.println("Character is not in capital");
        }

    }
}

class StringX
{
    public boolean CheckSmall(char str)
    {
        boolean bFlag = false;

            if((str >= 'a') &&(str <= 'z'))
            {
                bFlag = true;
            }
        

        return bFlag;

    }
}