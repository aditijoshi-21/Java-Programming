//Accept N numbers form user and also one number and check whether that one number is in N number or not

import java.util.*;

public class practice22{

    public static void main(String Arr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int iSize = sobj.nextInt();

        System.out.println("Enter the number you want to search: ");
        int iNo = sobj.nextInt();

        MyArray mobj = new MyArray(iSize);

        mobj.Accept();
        mobj.Display();

        boolean bRet = mobj.Search(iNo);

        if(bRet == true)
        {
            System.out.println("Element is present");
        }
        else
        {
            System.out.println("ELement is not present");
        }

        sobj.close();
    } 
}

class ArrayX
{
    protected int Arr[];

    public ArrayX(int iSize)
    {
        Arr = new int[iSize];
    }

    protected void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the elements: ");

        for(int iCnt=0; iCnt<Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }

    protected void Display()
    {
        for(int iCnt=0; iCnt < Arr.length; iCnt++)
        {
            System.out.println("The elements are: "+Arr[iCnt]);
        }
    }
}

class MyArray extends ArrayX
{
    public MyArray(int iSize)
    {
        super(iSize);
    }

    public boolean Search(int iNo)
    {
        boolean bFlag = false;

        for(int iCnt=0; iCnt<Arr.length; iCnt++)
        {
            if(Arr[iCnt]==iNo)
            {
                bFlag = true;
                break;
            }
        }

        return bFlag;
    }
}

