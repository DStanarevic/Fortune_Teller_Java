import java.util.Scanner;

public class Fortune_Teller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//User input 
		Scanner consoleReadline = new Scanner(System.in);
		//System.out.println(consoleReadline.nextLine());
		
		//Variables
		 int retiringIn;
		 int age;
         int month;
         int sibling;
         double money;
         String vacationHome;
         String transportMethod;
         String firstName;
         String lastName;
         
         //Storyline
         System.out.println("You are at a Carnival and come across a fortune teller, they ask you for your name.");
         firstName = consoleReadline.nextLine().trim();
         
         System.out.println("The fortune teller than asks you for your last name.");
         lastName = consoleReadline.nextLine().trim();
         
         System.out.println("The fortune teller asks you how old you are.");
         age = Integer.parseInt(consoleReadline.nextLine().trim());
         
         
         
         

	}

}
