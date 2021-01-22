package javaBasics.dataTypeAndOperators;

public class DataTypeAndOperators {

	public static void main(String[] args) {
		// Primitive Data Types
		byte    Byte;     //Size of 1  Byte,  -128 to 127
		short   Short;    //Size of 2  Bytes, -32 768 to 32 767
		int     Int;      //Size of 4  Bytes, -2 147 483 648 to 2 147 783 647
		long    Long;     //Size of 8  Bytes, -9 223 372 036 854 775 808 to 9 223 372 036 854 775 807 
		float   Float;    //Size of 4  Bytes, Stores faction numbers for 6 to 7 decimal digits
		double  Double;   //Size of 8  Bytes, Stores faction numbers for 15 decimal digits
		boolean Boolean;  //Size of 1  bit,   Store true or false values 
		char    Char;     //Size of 2  Bytes, A singles character/letter or ASCII valus 
		String  string;   //Size of x2 Bytes, This a object but can be recognized as a char array
		
		int x = 10;
		int y = 20;
		
		// Arithmetic Operations
		System.out.println("x = " + x + "; y = " + y);
		System.out.println("Addition "       + x + y);
		System.out.println("Subtraction "    + (x - y));
		System.out.println("Multiplication " + x * y);
		System.out.println("Division "       + x / y);
		System.out.println("Modulus "        + x % y);
		System.out.println("Increment "      + ++x);
		System.out.println("Decrement "      +  --x);
		
		// Comparison Operators
		System.out.println("Equals to == "         + (x==y));
		System.out.println("Not equal != "         + (x!=y));
		System.out.println("Greater than > "       + (x>y));
		System.out.println("Less than < "          + (x<y));
		System.out.println("Greather or equal >= " + (x>=y));
		System.out.println("Les or equal <= "      + (x<=y));
		
		// Logical Operators
		System.out.println("&& AND " + (x < 5 && y > 20 ));
		System.out.println("|| OR "  + (x < 5 && y > 20));
		System.out.println("!  NOT " + !(x < 5 && y > 20));
	}

}
