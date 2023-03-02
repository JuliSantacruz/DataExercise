
package dataexercise;

import java.util.Scanner;

public class DataExercise {

    public static void main(String[] args) {
        // TODO code application logic here!
        
        Scanner input = new Scanner(System.in);
        int varInt;
        float varFloat;
        double varDouble;
        char varChar;
        String varString;
        
        System.out.println("Write a whole number: ");
        varInt = input.nextInt();
        System.out.println("Write a float number: ");
        varFloat = input.nextFloat();
        System.out.println("Write a double number: ");
        varDouble = input.nextDouble();
        System.out.println("Write a char: ");
        varChar = input.next().charAt(0);
        
        input.nextLine();
        
        System.out.println("Write a sentence: ");
        varString = input.nextLine();
        
        System.out.println("The data captured was");
        System.out.println(varInt + " , " + varFloat + " ," + varDouble + " , " + varChar + " , " +varString );
        
    }
    
}
