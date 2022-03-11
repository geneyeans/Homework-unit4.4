package homework7;
import java.util.Scanner;
public class Homework7_2 {
public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
	int ant;
	System.out.println("Input odd or even number");
	do {
		ant = reader.nextInt();
		if ( ant % 2 == 0) {
			System.out.println("even number ");
		} else {
			System.out.println("odd number ");
		}
	} while ( ant % 2 == 0);
	System.out.println("Exited loop.");
	}	
}

	

			

	


