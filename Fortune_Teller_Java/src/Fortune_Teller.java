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
         String color;
         
         //User Input
         System.out.println("You are at a Carnival and come across a fortune teller, they ask you for your name.");
         firstName = consoleReadline.nextLine().trim();
         
         System.out.println("What is your last name?");
         lastName = consoleReadline.nextLine().trim();
         
         System.out.println("How old are you?");
         age = Integer.parseInt(consoleReadline.nextLine().trim());
         
         System.out.println("In what month were you born in? (Enter as number)");
         month = Integer.parseInt(consoleReadline.nextLine().trim());
         
         System.out.println("What is your for your favorite ROYGBIV color? (Enter help for more info.)");
         color = consoleReadline.nextLine().toLowerCase();
         
         if(color == "help")
         {
        	 System.out.println("Please choose between Red, Orange, Yellow, Green, Blue, Indigo, Violet");
        	 color = consoleReadline.nextLine().toLowerCase();
         }
         
         System.out.println("How many siblings do you have?"); 
         sibling = Integer.parseInt(consoleReadline.nextLine().trim());
         
         //Retirement calculation.
         if(age %2 == 0)
         {
        	 retiringIn = 5;
         }
         else
         {
        	 retiringIn = 10;
         }
         
         
         
         
         

	}

}
