//Accept number from user and search last occaurance and return index value of that number in array

import java.util.*;

public class practice24{

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

        System.out.println("Last occurence of element is: "+mobj.LastOcc(iNo));


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

    public int LastOcc(int iNo)
    {
        int iCnt=1,iPos=0;
        for(iCnt=1; iCnt<Arr.length; iCnt++)
        {
            if(Arr[iCnt]==iNo)
            {
                iPos=iCnt;
            }
        }

        return iPos;
    }
}

