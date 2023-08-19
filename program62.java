//Accept name from user and display

import java.util.Scanner;

public class program62 {
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sobj.nextLine();

        System.out.println("Your name is: "+name);

    }
    
}
