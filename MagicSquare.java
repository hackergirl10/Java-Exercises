/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package magic.square;

/**
 *
 * @author Hazel Anne
 */
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MagicSquare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        //initializes bufferedreader dataIn
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        try{
        //text about Magic Square
        System.out.println("Magic Square");
        System.out.println("Instructions: Use only 1-9 numbers as input for this game.");
        System.out.println("Repetition of numbers is not allowed.");
        System.out.println("The sum of rows, columns and diagonals of numbers inside the square must be equal to 15.");
        
        //Enter the input for 1st row 1st no.
        System.out.println("Enter the row 1 first number: ");
        int rf1 = Integer.parseInt(dataIn.readLine());
        
        //checks the input
        while (rf1>9 || rf1<1){
            System.out.println("Invalid Input");
            System.out.println("Enter the row 1 first number: ");
            rf1 = Integer.parseInt(dataIn.readLine());
        }

        //Enter the input for 1st row 2nd no.
        System.out.println("Enter the row 1 second number: ");
        int rf2 = Integer.parseInt(dataIn.readLine());
        
        //checks the input
        while (rf2>9 || rf2<1){
            System.out.println("Invalid Input");
            System.out.println("Enter the row 1 second number: ");
            rf2 = Integer.parseInt(dataIn.readLine());
        }
 
        //checks for repeating input
        while(rf1 == rf2){
            System.out.println("The input entered before must not be repeated!");
            System.out.println("Enter the row 1 second number: ");
            rf2 = Integer.parseInt(dataIn.readLine());
            
            //checks the input
        while (rf2>9 || rf2<1){
            System.out.println("Invalid Input");
            System.out.println("Enter the row 1 second number: ");
            rf2 = Integer.parseInt(dataIn.readLine());
        }
        }

        
        //Enter the input for 1st row 3rd no.
        System.out.println("Enter the row 1 third number: ");
        int rf3 = Integer.parseInt(dataIn.readLine());
        
            //checks the input
        while (rf3>9 || rf3<1){
            System.out.println("Invalid Input");
            System.out.println("Enter the row 1 third number: ");
            rf3 = Integer.parseInt(dataIn.readLine());
        }
 
        
        //checks for repeating no
        while (rf1 == rf3 || rf2 == rf3){
            System.out.println("The input entered before must not be repeated!");
            System.out.println("Enter the row 1 third number: ");
            rf3 = Integer.parseInt(dataIn.readLine());
            
            //checks the input
        while (rf3>9 || rf3<1){
            System.out.println("Invalid Input");
            System.out.println("Enter the row 1 third number: ");
            rf3 = Integer.parseInt(dataIn.readLine());
        }
        
        }
        
        //Enter the input for 2nd row 1st no.
        System.out.println("Enter the row 2 first number: ");
        int rf4 = Integer.parseInt(dataIn.readLine());
        
            //checks the input
        while (rf4>9 || rf4<1){
            System.out.println("Invalid Input");
            System.out.println("Enter the row 2 first number: ");
            rf4 = Integer.parseInt(dataIn.readLine());
        }

        
        //checks for repeat
        while(rf1 == rf4 || rf2 == rf4||rf3 == rf4){
            System.out.println("The input entered before must not be repeated!");
            System.out.println("Enter the row 2 first number: ");
            rf4 = Integer.parseInt(dataIn.readLine());  
            
                //checks the input
        while (rf4>9 || rf4<1){
            System.out.println("Invalid Input");
            System.out.println("Enter the row 2 first number: ");
            rf4 = Integer.parseInt(dataIn.readLine());
        }
        }
        
        System.out.println("Enter the row 2 second number: ");
        int rf5 = Integer.parseInt(dataIn.readLine());
        
            //checks the input
        while (rf5>9 || rf5<1){
            System.out.println("Invalid Input");
            System.out.println("Enter the row 2 second number: ");
            rf5 = Integer.parseInt(dataIn.readLine());
        }

        while(rf1 == rf5 || rf2 == rf5||rf3 == rf5 || rf4 == rf5){
            System.out.println("The input entered before must not be repeated!");
            System.out.println("Enter the row 2 second number: ");
            rf5 = Integer.parseInt(dataIn.readLine());   
        
            //checks the input
        while (rf5>9 || rf5<1){
            System.out.println("Invalid Input");
            System.out.println("Enter the row 2 second number: ");
            rf5 = Integer.parseInt(dataIn.readLine());
        }

            
        }
        
        System.out.println("Enter the row 2 third number: ");
        int rf6 = Integer.parseInt(dataIn.readLine());
        
            //checks the input
        while (rf6>9 || rf6<1){
            System.out.println("Invalid Input");
            System.out.println("Enter the row 2 third number: ");
            rf6 = Integer.parseInt(dataIn.readLine());
        }

        
        while(rf1 == rf6 || rf2 == rf6||rf3 == rf6 || rf4 == rf6 || rf5 == rf6){
            System.out.println("The input entered before must not be repeated!");
            System.out.println("Enter the row 2 third number: ");
            rf6 = Integer.parseInt(dataIn.readLine()); 
            
           //checks the input
        while (rf6>9 || rf6<1){
            System.out.println("Invalid Input");
            System.out.println("Enter the row 2 third number: ");
            rf6 = Integer.parseInt(dataIn.readLine());
        }
        }
        
        System.out.println("Enter the row 3 first number: ");
        int rf7 = Integer.parseInt(dataIn.readLine());
        
        while (rf7>9 || rf7<1){
            System.out.println("Invalid Input");
            System.out.println("Enter the row 3 first number: ");
            rf7 = Integer.parseInt(dataIn.readLine());
        }
        
        while(rf1 == rf7 || rf2 == rf7||rf3 == rf7 || rf4 == rf7 || rf5 == rf7 || rf6 == rf7){
            System.out.println("The input entered before must not be repeated!");
            System.out.println("Enter the row 3 first number: ");
            rf7 = Integer.parseInt(dataIn.readLine());
            
         while (rf7>9 || rf7<1){
            System.out.println("Invalid Input");
            System.out.println("Enter the row 3 first number: ");
            rf7 = Integer.parseInt(dataIn.readLine());
        }
        }
        
        System.out.println("Enter the row 3 second number: ");
        int rf8 = Integer.parseInt(dataIn.readLine());
        
         while (rf8>9 || rf8<1){
            System.out.println("Invalid Input");
            System.out.println("Enter the row 3 second number: ");
            rf8 = Integer.parseInt(dataIn.readLine());
        }
        
        while(rf1 == rf8 || rf2 == rf8 ||rf3 == rf8 || rf4 == rf8 || rf5 == rf8 || rf6 == rf8 || rf7 == rf8){
            System.out.println("The input entered before must not be repeated!");
            System.out.println("Enter the row 3 second number: ");
            rf8 = Integer.parseInt(dataIn.readLine());   
            
        while (rf8>9 || rf8<1){
            System.out.println("Invalid Input");
            System.out.println("Enter the row 3 second number: ");
            rf8 = Integer.parseInt(dataIn.readLine());
        }
      
        }
        //inputs the 3rd row 3rd no.
        System.out.println("Enter the row 3 third number: ");
        int rf9 = Integer.parseInt(dataIn.readLine());
        
        while (rf9>9 || rf9<1){
            System.out.println("Invalid Input");
            System.out.println("Enter the row 3 third number: ");
            rf9 = Integer.parseInt(dataIn.readLine());
        }
        
        //checks whether the input repeats an input before
        while(rf1 == rf9 || rf2 == rf9 ||rf3 == rf9 || rf4 == rf9 || rf5 == rf9 || rf6 == rf9 || rf7 == rf9 || rf8 == rf9){
            System.out.println("The input entered before must not be repeated!");
            System.out.println("Enter the row 3 third number: ");
            rf9 = Integer.parseInt(dataIn.readLine()); 
            
        while (rf9>9 || rf9<1){
            System.out.println("Invalid Input");
            System.out.println("Enter the row 3 third number: ");
            rf9 = Integer.parseInt(dataIn.readLine());
        }
            
        }
    //Initiate summations on horizontal
    int rfh1 = rf1 + rf2 + rf3;
    int rfh2 = rf4 + rf5 + rf6;
    int rfh3 = rf7 + rf8 + rf9;
    
    //Initiate summations on vertical
    int rfv1 = rf1 + rf4 + rf7;
    int rfv2 = rf2 + rf5 + rf8;
    int rfv3 = rf3 + rf6 + rf9;
    
    //initiate summations on diagonals
    int rfd1 = rf1 + rf5 + rf9;
    int rfd2 = rf3 + rf5 + rf7; 
    
    //Condition for checking whether all the sum is a magic square
    if (rfh1 ==15 && rfh2 ==15 && rfh3 == 15 && rfv1 ==15 && rfv2 ==15 && rfv3 == 15 && rfd1 ==15 && rfd2 ==15){
        
        //Displaying the outputs
        System.out.println();
        System.out.println(rf1 + "\t" + rf2 + "\t" + rf3);
        System.out.println(rf4 + "\t" + rf5 + "\t" + rf6);
        System.out.println(rf7 + "\t" + rf8 + "\t" + rf9);
        System.out.println();
        System.out.println("The combination of numbers is a magic square!");
        
    }
    }
        catch(NumberFormatException e){
            System.out.println("Invalid Input!\n");
        }
        
    }
}
