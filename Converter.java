
public class Converter {
	    
	    public static int binaryToDecimal(String binaryStr) {
	        int decimal = 0;
	        int base = 1;
	        
	        for (int i = binaryStr.length() - 1; i >= 0; i--) {
	            if (binaryStr.charAt(i) == '1') {
	                decimal += base;
	            }
	            base *= 2;
	        }
	        
	        return decimal;
	    }
	    
	    public static String decimalToBinary(int decimal) {
	        if (decimal == 0) {
	            return "0";
	        }
	        
	        StringBuilder binary = new StringBuilder();
	        while (decimal > 0) {
	            binary.append(decimal % 2);
	            decimal /= 2;
	        }
	        
	        return binary.reverse().toString();
	    }
	}
