//Accept name from user and display and count its length

import java.util.Scanner;

public class program63 {
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sobj.nextLine();

        System.out.println("Your name is: "+name);

        System.out.println("Length of string is: "+name.length());

    }
    
}
