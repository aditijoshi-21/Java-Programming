//Accept n numbers and find minimum number 

import java.util.*;

public class program20 {

    public static void main(String Arr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int iSize = sobj.nextInt();

        MyArray mobj = new MyArray(iSize);

        mobj.Accept();
        mobj.Display();

        System.out.println("The minimum number in array is: "+mobj.Minimum());

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

    public int Minimum()
    {
        int iCnt=0;
        int iMin = Arr[iCnt];

        for(iCnt = 0; iCnt <Arr.length; iCnt++)
        {
            if(Arr[iCnt] < iMin)
            {
                iMin = Arr[iCnt];
            }
        }

        return iMin;
    }
}

