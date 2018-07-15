package nameprog;

import java.util.Scanner;

public class nameprog {

	public static void main(String[] args) {		
		
		Scanner scanner = new Scanner(System.in);
		
			System.out.print("What is your name? ");
			String name = scanner.next();
		
			if (name.equals("Dave")) {
				System.out.println("Hi Dave. How are you today?"); 
			} else if (name.equals("Lidia")) {
				System.out.println("Hi Lidia. Good to see you");
			} else if (name.equals("Alex")) {
				System.out.println("Hi Alex! :)");
			} else if (name.equals("Brandon")) {
				System.out.println("Brandon what do you think about this code?");
			} else {System.out.println("Your name isn't in the program! But it's good to see you here!");
			} 
		scanner.close();
		}
}
