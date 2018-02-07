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
         System.out.println("You are at a Carnival and come across a fortune teller,\nthey ask you for your name.");
         firstName = consoleReadline.nextLine().trim();
         
         System.out.println("What is your last name?");
         lastName = consoleReadline.nextLine().trim();
         
         System.out.println("How old are you?");
         age = Integer.parseInt(consoleReadline.nextLine().trim());
         
         System.out.println("In what month were you born in? (Enter as number)");
         month = Integer.parseInt(consoleReadline.nextLine().trim());
         
         System.out.println("What is your for your favorite ROYGBIV color? (Enter help for more info.)");
         color = consoleReadline.nextLine().toLowerCase();
         if(color.equals("help"))
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
         
         //Vacation home.
         if(sibling == 0)
         {
        	 vacationHome = "Bora Bora";
         }
         else if(sibling == 1)
         {
        	 vacationHome = "San Diego";
         }
         else if(sibling == 2)
         {
        	 vacationHome = "Denver";
         }
         else if(sibling == 3)
         {
        	 vacationHome = "Cleveland";
         }
         else 
         {
        	 vacationHome = "Detroit";
         }
         
         //Transportation    
         switch(color)
         {
         case "red": 
        	 transportMethod = "Ferrari 458";
        	 break;
         case "orange":
        	 transportMethod = "McLaren P1";
        	 break;
         case "yellow":
        	 transportMethod = "Lamborghini Huracan";
        	 break;
         case "green":
        	 transportMethod = "Jaguar E-Type";
        	 break;
         case "blue":
        	 transportMethod = "Ford GT40";
    	 	 break;
         case "indigo":
        	 transportMethod = "Nissan GTR";
        	 break;
         case "violet":
        	 transportMethod = "Fiat 500";
        	 break;
        	 default:
        		 transportMethod = "Ford Festiva";
         }
        	       
         //Savings
         switch(month)
         {
         case 1:
         case 2:
         case 3:
         case 4:
        	 money = 10000.00;
        	 break;
         case 5:
         case 6:
         case 7: 
         case 8:
        	 money = 100000.00;
        	 break;
         case 9:
         case 10:
         case 11:
         case 12:
        	 money = 1000000.00;
        	 break;
    	 default:
    		 money = 0.00;
    		 break;	
         }
         
         System.out.println("The fortune teller, tells you your future.");
         System.out.println(firstName + " " + lastName + " you will retire in "+ retiringIn + " years." + 
         "\nYou will drive a " + transportMethod + ", \nhave a vacation home in " + vacationHome + "\nwith " + money + " in savings.");;

	}

}
