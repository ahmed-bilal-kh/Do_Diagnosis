import java.util.*;

public class doDiagnosis {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);

		int int1;
		int int2;
		int int3;
		int int4;
		int sum;

		System.out.print("Do you have a temperature (0 for No, 1 for Yes)?");
		 int1 = keyboard.nextInt( );
		 keyboard.nextLine( );
		System.out.print("Do you have muscle aches (0 for No, 1 for Yes)?");
		 int2 = keyboard.nextInt( );
		 keyboard.nextLine( );
		System.out.print("Do you have a headache (0 for No, 1 for Yes)?");
		 int3 = keyboard.nextInt( );
		 keyboard.nextLine( );
		System.out.print("Do you have sniffles (0 for No, 1 for Yes)?");
		 int4 = keyboard.nextInt( );
		 keyboard.nextLine( );
		
		sum = int1 + int2 + int3 + int4;

		if (sum == 0)
			System.out.println("I'm pleased to say you are in excellent health!");			
		else if (sum == 1)
			System.out.println("You may be stressed. Retire early this evening.");
		else if (sum == 2)
			System.out.println("You may be sick. Take two aspirins.");
		else if (sum == 3)
			System.out.println("You are sick. Stay in bed tomorrow.");
		else if (sum == 4)
	    System.out.println("You are very sick. Go to the hospital now!");
	}
}