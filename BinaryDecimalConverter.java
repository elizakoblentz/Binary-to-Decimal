/*
import java.util.*;

public class Convert {
	
	public String convert()
	{
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println ("Would you like to convert from Decimal to Binary (1) or Binary to Decimal (2)?");
		int answer = keyboard.nextInt();
		
		
		if (answer == 1)
		{
			long decimalInput;
			String convertedBinary = "";
			
			System.out.println ("What number would you like to convert from Decimal to Binary?");
			decimalInput = keyboard.nextLong();
			
			while (decimalInput > 0)
			{
				long temp = decimalInput % 2;
				convertedBinary += Long.toString(temp);
			}
			return convertedBinary;
			
		}
		if (answer == 2)
		{
			long binaryInput;
			int convertedDecimal = 0;
			
			
			System.out.println ("What number would you like to convert from Binary to Decimal?");
			binaryInput = keyboard.nextLong();
			String binaryString = Long.toString(binaryInput);
			
			String [] arr = new String [binaryString.length()-1];
			for (int index = 0; index < binaryString.length(); index++)
			{
				arr[index] = binaryString.substring(index, index+1);
			}
			
			int expoNumber = 0;
			for (int index = arr.length-1; index >= 0; index--)
			{
				int arrValue = Integer.parseInt(arr[index]);
				convertedDecimal += (arrValue *(Math.pow(2, expoNumber)));
			}
			
			return Integer.toString(convertedDecimal);
			
		}
		
		if (answer != 1 && answer != 2)
		{
			 System.out.println ("You have entered an invalid option. Please try again");
			 return convert();
		}
		return "";
	}
	
	
	public static void main (String [] args)
	{
		
		
		
	}
}
*/


import java.util.Scanner;

public class BinaryDecimalConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Binary-Decimal Converter!");
        System.out.println("Enter 1 to convert from binary to decimal");
        System.out.println("Enter 2 to convert from decimal to binary");

        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter a binary number: ");
                String binaryStr = input.next();
                int decimal = 0;
                try {
                    decimal = Integer.parseInt(binaryStr, 2);
                    System.out.println("The decimal equivalent is: " + decimal);
                } catch (NumberFormatException ex) {
                    System.out.println("Invalid binary number entered.");
                }
                break;

            case 2:
                System.out.println("Enter a decimal number: ");
                int decimalNum = input.nextInt();
                String binary = Integer.toBinaryString(decimalNum);
                System.out.println("The binary equivalent is: " + binary);
                break;

            default:
                System.out.println("Invalid choice");
                break;
        }

        input.close();
    }
}
