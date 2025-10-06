package anudip;

public class Operators {
public static void main(String[] args) {
	int a=10, b=20;
	//arithmetic operators
	System.out.println("arithmetic operator");
	System.out.println(a + b);
	System.out.println(a % b); 
	System.out.println(a - b); 
	System.out.println(a * b); 
	
	//Bitwise Operators
	System.out.println("bitwise operator");
	System.out.println(a & b); 
	System.out.println(a | b); 
	System.out.println(a ^ b); 
		
	//ternary operator	
	System.out.println("ternary operator");
	int max = (a > b) ? a : b;
	System.out.println(max); 

	
	
	//coparison operators
	System.out.println("comparison operator");
	System.out.println(a < b); 
	System.out.println(a > b); 
	System.out.println(a == b); 
	System.out.println(a >= b); 
	System.out.println(a <= b); 
	System.out.println(a != b); 
	
	//Logical Operators
	System.out.println("logical operator");
	int c = 15;
	System.out.println((a > b) && (a < c));
	System.out.println((a > b) || (a < c));
	System.out.println(!(a > b)); 
	
	//Assignment Operators
	System.out.println("assignment operator");
	System.out.println(a += 5 );
	System.out.println(a *= 2);
	System.out.println(a);
	System.out.println(a %= 3);
	System.out.println(a /=2);
	System.out.println(a -= 4);
	
	//Unary Operators
	System.out.println("unary operator");
	int d=5;
	d++;
	System.out.println(d); 
	int e=5;
	System.out.println(e);
	++e;
	System.out.println(e);
	System.out.println(d--); 
	
	

	
	



	


}
}
