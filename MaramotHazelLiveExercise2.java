/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package checkwriting;

/**
 *
 * @author Hazel Anne L. Maramot
 * BSCpE 5-5
 */
import java.util.Scanner;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
public class MaramotHazelLiveExercise2 {
    public static void main(String args[]) {
        digits();
    }
    public static void digits(){
        
        Scanner scanner = new Scanner(System.in);
        //initialize the variables needed for amount
        double amount;
        double numbers;
        int number;
        double cent;
        int cents;
        //Displays the current date for cheque transaction
        Format f = new SimpleDateFormat("MM/dd/yyyy");
        String strDate = f.format(new Date());
        System.out.println("Date of Transaction: "+strDate);
        //Asks for the name of the recipient for the cheque
        System.out.println("Name of the Recipient: ");
        String name = scanner.nextLine();
        
        //Ask for the amount in numbers
        System.out.println("Enter the amount in digits: ");
        //checks whether the amount is valid
        try {
            numbers = scanner.nextDouble();
            if(numbers<=0){
                System.out.println("Invalid Amount! Try Again.");
                System.exit(0);
            }
            if(numbers>1000000){
                System.out.println("The amount entered exceeded the maximum value. Try Again.");
                System.exit(0);
            }
            else{
                numbers = Math.round(numbers * 100.0) / 100.0;
                //takes the current value of number
                amount = numbers;
                //takes away the decimal value
                cent = (numbers*100)%100;
                //converts the double cent to int then puts in int cents
                cents = (int)cent;
                //takes away the whole number
                numbers = numbers - (cent/100);
                //converts the double no to int 
                number = (int)numbers;	
                
                //printing the check
                System.out.println(" ");
                System.out.println("\t\t\t Check \t");
                System.out.println("Date: "+strDate);
                System.out.println("Pay to the Order of " +name + " ₱"+amount);
                if(cents !=0){
                    
                    System.out.println(numberToWords(number) + " and " + cents +"/100 Pesos");
                }
                if(cents == 0){
			System.out.println(numberToWords(number) + " Pesos");
                }
            }
		} catch (Exception e) {
			System.out.println("Please enter a valid amount!");                  
		}
                
		//end of the reader
    
    }
    private static String numberToWords(int number) {
                // variable to hold string representation of number 
                String words = "";
		String unitsArray[] = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", 
                                "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
                                "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", 
                                "Eighteen", "Nineteen" };
		String tensArray[] = { "Zero", "Ten", "Twenty", "Thirty", "Forty", "Fifty",
                                 "Sixty", "Seventy", "Eighty", "Ninety" }; 
                //checks if there amount has a million
                if ((number / 1000000) > 0) {
			words += numberToWords(number / 1000000) + " Million ";
			number %= 1000000;
		}
		//checks if the amount has a thousand
		if ((number / 1000) > 0) {
			words += numberToWords(number / 1000) + " Thousand ";
			number %= 1000;
		}
		//checks if the amount has a hundred
		if ((number / 100) > 0) {
			words += numberToWords(number / 100) + " Hundred ";
			number %= 100;
		}
 
		if (number > 0) {
			//if there are tens
			if (number < 20) {
                                 // fetch the unit
                                 words += unitsArray[number];
                        } else { 
                                // get the unit from tens
                                words += tensArray[number / 10]; 
                                if ((number % 10) > 0) {
				   words += " "+ unitsArray[number % 10];
                            }  
			}
		}
 
		return words;
}
}
 