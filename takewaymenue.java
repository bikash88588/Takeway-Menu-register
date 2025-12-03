package Assessment;

//importing array, ArrayList and Scanner Library
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class task1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		// creating array to store menu lists
		String[][] Menu = {
				{"Appetisers", "Spring Rolls", "Crispy rolls filled with vegetables and sweet chili sauce.", "$6.00"},
				{"Appetisers", "Thai Dumplings", "Steamed dumplings with chicken and vegetable filling.", "$7.50"},
				{"Main Dishes",	"Pad Thai",	"Stir-fried rice noodles with shrimp, tofu, peanuts, and bean sprouts.", "$12.00"},
				{"Main Dishes", "Basil Chicken", "Stir-fried chicken with Thai basil, chili, and vegetables, served with jasmine rice.", "$12.00"},
				{"Fried Rice", "Thai Fried Rice", "Fried rice with chicken, shrimp, or vegetables, seasoned with Thai spices.","$11.00"},
				{"Fried Rice", "Pineapple Fried Rice", "Fried rice with pineapple, cashews, and choice of meat or tofu.", "$12.50"},
		};

		
		//setting scanner to get input variable from keyboard
		Scanner input = new Scanner(System.in);
		
		//setting arraylists to record value form user in arraylists
		ArrayList<String> orderDishes = new ArrayList<>();
        ArrayList<Integer> orderQuantities = new ArrayList<>();
        ArrayList<Double> orderSubtotals = new ArrayList<>();
//Here, I created array and array list to store categories , Dish and Description and price then I use if and else loop to code option 1 and option 2. If customer choose it will not run However if customer chose 1 it will display category array to customer to choose then it will show dish, description with price to customer using array. 	
        //asking user to select menu or exit 
		System.out.println("1 - Show Menu" +  '\n' +"2 - Exit");
		//Declaring variables 
		int value, rep, quantity;
		int catagory;
		int Dish;
		double totalBill = 0;
		
		//Asking user to input value to get into loop
		value =input.nextInt();
		 if( value ==2) {
			System.out.println("Finish, run again.");
			} else if (value ==1) {
				do { System.out.println("Select a catagory."+'\n'+"1 - "+Menu[1][0]+'\n'+"2 - "+Menu[3][0]+'\n'+"3 - "+Menu[5][0]);
			
				value =input.nextInt();
				while (value <1 || value >3) {
					System.out.println("Invalid Number, Enter a valid number.");
					value =input.nextInt();
				}
				if(value ==1) {
					System.out.println("1 - "+Menu[0][1]+"   "+Menu[0][2]+"   "+Menu[0][3]);
					System.out.println("2 - "+Menu[1][1]+"   "+Menu[1][2]+"   "+Menu[1][3]);
				} else if (value ==2) {
					System.out.println("1 - "+Menu[2][1]+"   "+Menu[2][2]+"   "+Menu[2][3]);
					System.out.println("2 - "+Menu[3][1]+"   "+Menu[3][2]+"   "+Menu[3][3]);
					
				}else if (value ==3){
					System.out.println("1 - "+Menu[4][1]+"   "+Menu[4][2]+"   "+Menu[4][3]);
					System.out.println("2 - "+Menu[5][1]+"   "+Menu[5][2]+"   "+Menu[5][3]);
				} else {
					System.out.println("Please, enter a valid number");
				}
				//Asking user to input till user puts correct value
				Dish =input.nextInt();
				if (Dish <=0) 
		    		break;
				while (Dish <1 || Dish >2) {
				System.out.println("Invalid Number, Enter a valid number.");
				Dish =input.nextInt();
				}
				// recording values in in array and array list
				 int dishIndex = (value - 1) * 2 + (Dish - 1);
	             double price = Double.parseDouble(Menu[dishIndex][3].substring(1));
				//Asking user to put the quantity of order with loop
				System.out.println("Enter the quantity of your order?");
				quantity =input.nextInt();
				while (quantity <=0) {
				System.out.println("Invalid Number, Enter a valid number.");
				quantity =input.nextInt();
				}
//I used integer data type with loop to get the quantity from user and while loop will ask user again and again for valid input. 				
				//adding order Dishes, quantity in arry list.
				 orderDishes.add(Menu[dishIndex][1]);
	             orderQuantities.add(quantity);
	             double subtotal = quantity * price;
	             orderSubtotals.add(subtotal);
	             totalBill += subtotal;
				// if user like to continue order 
				System.out.println("\nDo you like to continue ordering or finish."+'\n'+"Please select:"+'\n'+'\t'+"1 - Yes"+'\n'+'\t'+"2 - No");
				rep =input.nextInt();
				while (rep <1 || rep >2) {
					System.out.println("Invalid Number, Enter a valid number.");
				rep = input.nextInt();
				}
				
				} while (rep ==1);
//I asked user that if need to continue order or not. For this case I used do and while loop that will carry user back to starting point of menu to order.
				
				// generating invoice to print
				System.out.println("\nInvoice:");
				StringBuilder invoice = new StringBuilder("Dish\t\tQuantity\tSubtotal");
				System.out.println(invoice);
				
				//printing array list
				 for (int i = 0; i < orderDishes.size(); i++) {
		                System.out.printf("%-15s %8d %15.2f\n", orderDishes.get(i), orderQuantities.get(i), orderSubtotals.get(i));
		            }
		            System.out.printf("Total\t\t\t\t$%.2f\n", totalBill);
				
//Here, this code will print detailed of invoice with dish, quantity and subtotal subheading as it was already recorded in array list I just print it and do mathematical addition. 
				
				
			} else {
			System.out.println("you entered a wrong value. Please enter again.");
			}
			
	}

}
