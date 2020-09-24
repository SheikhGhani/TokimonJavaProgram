import java.util.ArrayList;
import java.util.Scanner;

public class AppTokimon
{
	//Array to store tokimons
	private ArrayList<Tokimon> tokimonList;
	
	//Constructor
	public AppTokimon()
	{
		this.tokimonList = new ArrayList<>();
	}
	
	//Method that will start the application
	public void start()
	{
		displayMainMenu();
	}

	//Method that will display the main menu of the application
	private void displayMainMenu()
	{
		do 
		{
			//display application name
			System.out.println("\n\n***** Tokimon App *****\n");
			
			//display main menu
			System.out.println("1- List all Tokimons");
			System.out.println("2- Add new Tokimon");
			System.out.println("3- Delete Tokimon");
			System.out.println("4- Augment Strength");
			System.out.println("5- Exit the App");
			
			//prompt user for input
			System.out.print("\nEnter your choice here (1-5): ");
			
			//get input from user
			int choice = new Scanner(System.in).nextInt();
			
			if(choice == 1)
			{
				//Display list of all tokimons
				System.out.println("\n\n***** List of Tokimons *****\n");
				listAllTokimons();
			}
			else if(choice == 2)
			{
				//Add new tokimon
				System.out.println("\n\n***** Add New Tokimon *****\n");
				addNewTokimon();
			}
			else if(choice == 3)
			{
				//Delete a tokimon
				System.out.println("\n\n***** Delete a Tokimon *****\n");
				deleteTokimon();
			}
			else if(choice == 4)
			{
				//Increase strength of tokimon
				System.out.println("\n\n***** Augment Strength of Tokimon *****\n");
				augmentStrength();
			}
			else if(choice == 5)
			{
				//exit the application
				System.out.println("Exiting the Application...");
				System.exit(0);
			}
		}while(true);
	}
	
	private void listAllTokimons()
	{		
		//check if there is any tokimon
		if(tokimonList.size() == 0)
		{
			//no tokimon found, display message
			System.out.println("\nNo Tokimon found...");
		}
		else
		{
			int i = 0;	
			//iterate over each tokimon and display its info
			for (Tokimon tokimon : tokimonList)
			{
				System.out.println("Tokimon # " + (i + 1));
				System.out.println(tokimon);
				i++;
			}
		}		
	}

	
	private void addNewTokimon()
	{
		String name;		//to store name 
		String type;		//to store type
		double height;		//to store height
		double weight;		//to store weight
		
		//Create a scanner object
		Scanner scan = new Scanner(System.in);
		
		//Prompt user to input 
		System.out.print("Enter Name: ");
		name = scan.nextLine();
		System.out.print("Enter Type: ");
		type = scan.nextLine();		
		System.out.print("Enter Height: ");
		height = scan.nextDouble();
		System.out.print("Enter Weight: ");
		weight = scan.nextDouble();

		//Create new tokimon object
		Tokimon newTokimon = new Tokimon(name, type, height, weight);
		
		//add the tokimon to the array
		this.tokimonList.add(newTokimon);
		
		//display success message
		System.out.println("\nTokimon Added!!!");		
	}
	
	
	private void deleteTokimon()
	{
		//Check if there is any tokimon in array
		if(this.tokimonList.size() == 0)
		{
			//no tokimon found, hence cannot remove the tokimon
			System.out.println("\nNo Tokimons Found!!");
		}
		else 
		{
			//display list of tokimons
			listAllTokimons();
			do 
			{
				//display prompt message
				System.out.print("\nEnter the Tokimon number you want to remove (0 to cancel): ");
				
				//Take input from user
				int selectedTokimon = new Scanner(System.in).nextInt();
				
				//Check if invalid input was entered by user
				if(selectedTokimon < 0 || selectedTokimon > tokimonList.size())
				{
					//display error message
					System.out.println("Invalid Input, Please select a tokimon again...");
				}
				else if(selectedTokimon == 0)
				{
					//cancel the delete operation
					System.out.println("Canceling the delete operation... returning to the main menu");
					displayMainMenu();
				}
				else 
				{
					//Remove the tokimon from array
					tokimonList.remove(selectedTokimon - 1);
					
					//display success message
					System.out.println("\nTokimon removed successfully!!");
					
					//terminate the loop
					break;
				}
			}while(true);
		}
	}
	
	private void augmentStrength()
	{
		//Check if there is any tokimon in array
		if(this.tokimonList.size() == 0)
		{
			//no tokimon found, hence cannot remove the tokimon
			System.out.println("\nNo Tokimons Found!!");
		}
		else 
		{
			//display list of tokimons
			listAllTokimons();
			
			do
			{
				//display prompt message
				System.out.print("\nEnter the tokimon number to increase its strength: ");
				
				//Take input from user
				int selectedTokimon = new Scanner(System.in).nextInt();
				
				//Check if invalid input was entered by user
				if(selectedTokimon < 0 || selectedTokimon > tokimonList.size())
				{
					//display error message
					System.out.println("Invalid Input, Please select a tokimon again...");
				}
				else 
				{
					//increase the strength of the selected tokimon
					tokimonList.get(selectedTokimon - 1).increaseStrength(10);
					
					//display success message
					System.out.println("\nStrength increased successfully!!");
					
					//terminate the loop
					break;
				}
			} while (true);
		}
	}
}
