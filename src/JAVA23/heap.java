package JAVA23;


import java.util.*;

public class heap {
    public static void main(String[] args) {

        int x = (int)(Math.random() * 10);

        System.out.print("Enter number:");

        try (Scanner input = new Scanner(System.in)) {

            int y = input.nextInt();
            
            int p =(x == y )? 0: 1;

            System.out.println("p = " + p);
        }

        System.out.println("x =" + x);


    }
    
}
