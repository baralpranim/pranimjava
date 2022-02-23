package format;

import java.util.Scanner;

public class format {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a name");
        String a=s.next();
        System.out.println("Enter Roll number");
        int b=s.nextInt();
        System.out.println("Enter field of Intrest");
        String c=s.next();
        System.out.println("Hey my name is" +a+". my roll no is" +b+"and and my field of intrest is" +c );
    }

}
