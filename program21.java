//Accept n numbers and find maximum number 

import java.util.*;

public class program21{

    public static void main(String Arr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int iSize = sobj.nextInt();

        MyArray mobj = new MyArray(iSize);

        mobj.Accept();
        mobj.Display();

        System.out.println("The maximum number in array is: "+mobj.Maximum());

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
        sobj.close();
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

    public int Maximum()
    {
        int iCnt=0;
        int iMax = Arr[iCnt];

        for(iCnt = 0; iCnt <Arr.length; iCnt++)
        {
            if(Arr[iCnt] > iMax)
            {
                iMax = Arr[iCnt];
            }
        }

        return iMax;
    }
}

