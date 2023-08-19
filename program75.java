package Java;

import java.util.Scanner;

public class program75 {

    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the string: ");

        String str = sobj.nextLine();

        str = str.replaceAll("\\s", " ");
        str = str.trim();

        int iFreq=0;

        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) == ' ')
            {
                iFreq++;
            }
        }

        System.out.println("Number of words are: "+(iFreq+1));
    }
    
}
