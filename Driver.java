import java.util.*;

class car{
	private String color;
	private String make;
	private String model;
	
	public car(String color, String make, String model) {
		this.color = color;
		this.make = make;
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "car [color=" + color + ", make=" + make + ", model=" + model + "]";
	}
	
}

class Truck extends car{
	
	private int trailerSize;

	public Truck(String color, String make, String model, int trailerSize) {
		super(color, make, model);
		this.trailerSize = trailerSize;
	}
	
	public int addTrailerLength(int a, int b) {
		return this.trailerSize + a + b;
	}
	
	public double addTrailerLength(double a, double b) {
		double num = this.trailerSize;
		return num + a + b;
	}
	
	
	
}
public class Driver {

	public static boolean isPrime(int n) {  
	      if (n <= 1) {  
	           return false;  
	       }  
	       for (int i = 2; i < Math.sqrt(n); i++) {  
	           if (n % i == 0) {  
	               return false;  
	           }  
	       }  
	       return true;
	}

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int x = 0;
		int y = 0;
		
		//1) Get the value from the user and do Unary Relational and Logical Operations
		System.out.println("Input 2 numbers to see arithmetic:");
		x = scnr.nextInt();
		y = scnr.nextInt();
		
		System.out.println("For unary:");
		System.out.printf("Value %d, and %d multiplied together is: %d\n", x, y, x * y);
		
		System.out.println("For Relational:");
		if(x >= y) {
			System.out.printf("%d is >= %d\n", x, y);
		}
		else{
			System.out.printf("%d is <= %d\n", x, y);
		}
		
		System.out.println("For Logical:");
		if(x != y) {
			System.out.printf("%d does not equal %d\n", x, y);
		}
		else{
			System.out.printf("%d is equal to %d\n", x, y);
		}
		
		//2 - 3)Take command like argument and check it is odd or even number
		System.out.println("\nEnter a number to see if it is odd or even");
		x = scnr.nextInt();
		if((x % 2) == 0) {
			System.out.printf("%d is even.\n", x);
		}
		else {
			System.out.printf("%d is odd.\n", x);
		}
		
		//4) For a given number integer, print in the words using switch statement 1 to 10.
		System.out.println("\n Enter a number:");
		x = scnr.nextInt();
		switch(x) {
		case 1:
			System.out.println("The number is one");
			break;
		case 2:
			System.out.println("The number is two");
			break;
		case 3:
			System.out.println("The number is three");
			break;
		case 4:
			System.out.println("The number is four");
			break;
		case 5:
			System.out.println("The number is five");
			break;
		case 6:
			System.out.println("The number is six");
			break;
		case 7:
			System.out.println("The number is seven");
			break;
		case 8:
			System.out.println("The number is eight");
			break;
		case 9:
			System.out.println("The number is nine");
			break;
		case 10:
			System.out.println("The number is ten");
			break;
		default:
			System.out.println("The number is not 1 - 10");
			break;
		}
		
		//5) Print even number between 1 to 100 using for loop.
		System.out.println("\n Even numbers: between 1 and 100");
		for(int i=2; i <= 100; i+=2) {
			if(i == 100) {
				System.out.println(i);
				break;
			}
			System.out.print(i + ", ");
		}
		
		//6) Print number 1 to 5, 5 times using nested for loop; 
		System.out.println("\nNumbers 1 - 5. Five times:");
		for(int i=1; i <=5; i++) {
			for(int j=1; j <= 5; j++) {
				if(j == 5) {
					System.out.println(j);
					break;
				}
				System.out.print(j+" ,");
			}
		}
		
		//7) print 1 to 25 number using while loop. 
		System.out.println("\nNumbers 1 - 25:");
		x = 1;
		while(x < 26) {
			if(x == 25) {
				System.out.println(x);
				break;
			}
			System.out.print(x+" ,");
			x++;
		}
		
		//8) Print odd number between 50 to 100 using do..while 
		System.out.println("\nOdd numbers 50 - 100:");
		x = 51;
		do {
			if(x == 99) {
				System.out.println(x);
				break;
			}
			System.out.print(x+" ,");
			x += 2;
		}while(x <= 100);
		
		//9) Print prime number from 1 to 100.
		System.out.println("\nPrime numbers from 1 to 100");
		for(int i=1; i <= 100; i++) {
			boolean prime = isPrime(i);
			if(prime == true) {
				System.out.print(i + " ");
			}
		}

		//10) Iterate for loop from 1 to 100, and using continue statement print only odd numbers. 
		System.out.println("\n\nOnly odd numbers from 1 to 100");
		for(int i = 1; i <= 100; i++) {
			if((i % 2) == 0) {
				continue;
			}
			if(i == 99) {
				System.out.println(i);
				break;
			}
			System.out.print(i+" ,");
			
		}

		//11)Iterate for loop form 50 to 100, and using break statement print only even numbers till 75. 
		for(int i = 50; i <=100; i++) {
			if((i % 2) == 0) {
				if(i == 100) {
					System.out.println(i);
					break;
				}
				System.out.print(i+" ,");
			}
			if(i == 75) {
				break;
			}
			
		}
		
		
	}

}
