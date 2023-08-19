//Accept name from user and display each character from string

import java.util.Scanner;

public class program64 {
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sobj.nextLine();

        System.out.println("Your name is: "+name);

        System.out.println("Length of string is: "+name.length());

        for(int i=0; i<name.length(); i++)
        {
            System.out.println(name.charAt(i));
        }

    }
    
}
