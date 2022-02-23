package discount;

import java.util.Scanner;

public class dis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the quantity");
        int x=sc.nextInt();
        if ((x*100)>1000){
            System.out.println("you will get a discount of "+(.1*x*100)+" and yor total cost is"+(x*100-(.1*x*100)) );
        }
        else {
            System.out.println("you wont get a discount");
        }
    }
}
