import java.util.Scanner;

public class practice6 {

    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number: ");

        int iNo = sobj.nextInt();

        DisplayDigits obj = new DisplayDigits();

        obj.Display(iNo);

    }
    
}

class DisplayDigits
{
    public void Display(int No)
    {
        int iDigit = 0;

        while(No != 0)
        {
            iDigit = No % 10;
            System.out.print("\t"+iDigit);
            No = No / 10;
        }

    }
}
