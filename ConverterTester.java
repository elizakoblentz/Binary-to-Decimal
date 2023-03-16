import java.util.Scanner;

public class ConverterTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter 'b' to convert binary to decimal or 'd' to convert decimal to binary: ");
        String choice = scanner.nextLine();
        
        if (choice.equals("b")) {
            System.out.print("Enter a binary number: ");
            String binaryStr = scanner.nextLine();
            int decimal = Converter.binaryToDecimal(binaryStr);
            System.out.println("Decimal equivalent: " + decimal);
        } else if (choice.equals("d")) {
            System.out.print("Enter a decimal number: ");
            int decimal = scanner.nextInt();
            String binaryStr = Converter.decimalToBinary(decimal);
            System.out.println("Binary equivalent: " + binaryStr);
        } else {
            System.out.println("Invalid choice. Please try again.");
        }
    }
}
