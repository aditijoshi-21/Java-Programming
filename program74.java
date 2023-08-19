/*
    a       97      0
    b       98      1
    c       99      2
    d       100     3
    ..

*/
package Java;

import java.util.Scanner;

public class program74 {
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the string: ");

        String str = sobj.nextLine();

        str = str.toLowerCase();

        str = str.replaceAll("\\s","");


        char Arr[] = str.toCharArray();

        int Freq[] = new int[26];

        int i=0;

        for(i=0; i<Arr.length; i++)
        {
            Freq[Arr[i] - 'a']++;
        }

        System.out.println("Frequency of each letter is: ");

        for(i=0; i<Freq.length; i++)
        {
            System.out.println("Frequency of "+(char)(i+'a') + "is: "+Freq[i]);
        }
    }
    
}


