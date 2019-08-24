// Name:		Bryan Jackson
// Class:		CS 5040
// Term:		Fall 2019
// Instructor:	Dr. Haddad
// Assignment:	0
// IDE:			Eclipse


//Program GasMileagae_Bryan_Jackson.java
//Demonstrate the use of the Scanner class to read numeric data from the user.
import java.util.Scanner;
public class GasMileage_Bryan_Jackson {

	//Calculates fuel efficiency based on values entered by the user.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int miles;
		double gallons, mpg;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of miles: ");
		miles = scan.nextInt();
		
		System.out.print("Enter the gallons of fuel used: ");
		gallons = scan.nextDouble();
		
		mpg = miles / gallons;
		System.out.println("Miles Per Gallon: " + mpg);
		
		
	}

}
