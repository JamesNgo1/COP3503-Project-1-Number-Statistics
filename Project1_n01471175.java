/*
 * Author:		James Ngo 
 * Course:		COP3503
 * Project #:	1
 * Title:		Number Statistics
 * Due Date:	6/10/2022
*/




package n01471175;
import java.util.Scanner;//import use of scanner
import java.util.Arrays; //import use of arrays

public class Project1_n01471175 {
	
	/**
	 * Calculates the number of even and odd from the array list
	 * The parameter is going to be the array itself from the user.
	 * Has two variables even and odd that are counts and used only when meets the requirement
	 * @param arrayerino the array that the user enters in the beginning
	 */
	
	public static void evenAndOdd (int[] arrayerino) 
	{
		// variables declaration even and odd count
		int even = 0;
		int odd = 0;
		
		//for loop to get count of even and odd
		for(int i = 0; i < arrayerino.length;i++) 
		{
			if(arrayerino[i] % 2 == 0)//condition if the element is divisible by two
			{
				even++;//if true even add on
			}
			else // else knowing the element is odd
			{
				odd++;// add on odd counter
			}
		}
		// Displaying the print statement result
		System.out.println();
		System.out.println("Number Even: " + even);
		System.out.println("Number Odd: " + odd);

	}
	// end of method of finding even and odd 
	
	
	public static void primes(int[] primerino) 
	{
		Arrays.sort(primerino);// sort array in order 
		int count = 0;// declaration of count of primes
		
		//used reference
		for(int i = primerino[0]; i <= primerino[primerino.length - 1]; i++) // loop declare 
		{
			//declaration of variables
			int index = i;
			int resulto = 2;
			int increase = 0;
			while ( resulto <= (index  / 2 )) //while condition loop
			{
				if((index  % resulto) == 0) //if condition met
				{
					increase++;//increment and break
					break;
				}
				resulto++;// adds one till meet if statement
			}
			if(increase == 0 && i != 1) // condition
			{
				count++;// increment if met 
			}
		}
		
		System.out.println("Number of Prime(s) in list: " + count); //display result of prime count
	}
	
	
	
	/**
	 * This is the orderArray method where it list the order of the array in ascending order
	 * There is one parameter with the array list from the beginning of the program
	 * used of .sort and should return the [] array in order.
	 * @param orderino
	 */
	public static void orderArray (int[] orderino)
	{
		// beginning of the method.
		Arrays.sort(orderino);// use sort method from array
		
		// Display print statements
		System.out.println();
		System.out.println(Arrays.toString(orderino));
		
	}
	// end of order array
	
	/**
	 * Calculates varies of task under statistics like mean , minimum , max etc.
	 * Takes the parameter of an array from input
	 * it returns print statements that correlates to the variables of each certain task
	 * @param listOrderino
	 */
	
	public static void statistics( int[] listOrderino)
	{
		//The first of the 9 parts of MINIMUM
		int min = listOrderino[0];//declare initialization of minimum array
		for(int i = 0; i < listOrderino.length;i++)// for loop test through all elements
		{
			if(listOrderino[i] < min) //Checks if condition is true with element
			{
				min = listOrderino[i]; // if true the element tested is now the minimum variable
			}
		}
		// End of finding minimum section
		
		
		//The second with finding MAXIMUM
		int max = listOrderino[0]; // declare initialization of maximum array default
		for(int i = 0; i < listOrderino.length;i++)// for loop checks each element
		{
			if(listOrderino[i] > max) //checks if the condition is true
			{
				max = listOrderino[i];//if met the condition it is passed on as "max" variable
			}
		}
		//The third is finding count 
		
		
		
		int counter = 0; // the number of elements in the array
		for(int i = 0; i < listOrderino.length; i++)//runs through each element with for loop
		{
			counter++; //counter as up and stop until it reaches max length
		}
		
		//Range
		int range = (max - min); //range formula subtract maximum and minimum of the array
		//end of range
		
		
		// Begin of finding median
		double median;
		Arrays.sort(listOrderino);//sort of array for optimization
		
		if(listOrderino.length % 2 != 0)// condition checks if this array length is odd
		{
			median = (double) listOrderino[listOrderino.length/2]; //if true perform the variable below .
		}
		else
		{
			median = ((double)listOrderino[listOrderino.length/2] + (int)listOrderino[(listOrderino.length/2) - 1]) / 2; // if else this shows array length is even and grab two middle elements and divide by two.
			
		}
		//End of median section
		
		
		
		//Beginning of the mean
		double total = 0; // adding up all the numbers
		double mean; // declare of double variable mean
		
		for(int i = 0; i < listOrderino.length; i++) // for loop goes  through each element
		{
			total += listOrderino[i]; // each time add up
		}
		mean = total / counter; // end result use mean as holder
		
		// end of finding mean section.
		
		
		//beginning of mode
		
		Arrays.sort(listOrderino); //use sort method of array to sort
	    int modeHit = 0; // use variable as passing number requirement
	    String mode = " "; // declaration of string for potential array having no mode.
	    
	    for (int i = 0; i < listOrderino.length; i++) //outer loop to get first element to compare with rest in inner loop.
	    {
	        int count = 0; //comparison and counter with modeHit
	        for (int j = 0; j < listOrderino.length; j++) 
	        {
	            if (listOrderino[j] == listOrderino[i]) //if condition meet count execute. Guarantees once due to it equaling to itself
	            {
	            	count += 1;
	            }
	        }
	        if (count > modeHit) // initial value of mH is 0 if present of mode more than one leading below return.
	        {
	        	mode = " " + listOrderino[i];// if outer loop  element greater than modeHit or zero declare variable.
	        	modeHit = count;// increment the modeHit to count as well to test again
	        }
	       
	    }
	    if (modeHit == 1) //once out the loop if true run condition (meaning if modeHit only one there was not another element besides itself to make 2 (making the existance of mode)) 
	    {
	    	mode = ("No mode"); //updated variable as it match with no other element than itself (element)
	   
	    }// end of mode
		
		
		// variance begins follow the STD as it is a continuation from finding variance
		double findVar = 0;
		
		for(int i = 0; i < listOrderino.length; i++)
		{
			findVar += (double) Math.pow((listOrderino[i] - mean), 2);//iterating through every element in the array to subtract mean and square root and add them up.
			
		}
		double variance = findVar / counter; // declare variance and formula 
		
		//begin of finding standard deviation
		double standardDev = Math.sqrt(variance); // to find standard deviation formula is to square root the variance found.
		
		
		
		//below section of display result of number statistics
		System.out.println();
		System.out.printf("Min: %d\n", min);
		System.out.printf("Max: %d\n", max);
		System.out.printf("Count: %d\n", counter);
		System.out.printf("Range: %d\n", range);
		System.out.printf("Median: %.1f\n", median);
		System.out.printf("Mean: %.1f\n", mean);
		System.out.println("Mode: " + mode);
		System.out.printf("Variance: %.2f\n", variance);
		System.out.printf("Standard Deviation: %.2f\n", standardDev);
		
		
	}
	/**
	 * Purpose of displaying the menu and allowing the user to enter input in a loop until choosing to close it
	 *
	 *It returns the math result of a function , error message , new list , and a closing program
	 * @param menuArray that is the users input array from beginning
	 */
	
	//public static void menu(int[] menuArray) 
	public static void menu()
	{

		
		Scanner scnr1 = new Scanner(System.in);//calling for input
		int[] menuArray = enterList(scnr1);
		boolean running = true;// true or false 
		
		do // declare do while loop
		{
			//display the menu option
			System.out.println();
			System.out.println("Please make a selection:");
			System.out.println("1)	Display List Statistics");
			System.out.println("2)	Display List Ordered");
			System.out.println("3)	Number of Odd/Even");
			System.out.println("4)	Check for Prime Numbers");
			System.out.println("5)	Enter new List");
			System.out.println("6)	Quit Program");
		
			int userChoice = scnr1.nextInt(); //getting user input with switch statements
			
			switch(userChoice) 
			{
			//variety of tasks that call on functions and looping again , error message and looping again , and finally closing
			
				case 1:
					statistics(menuArray);
					break;
				case 2:
					orderArray(menuArray);
				    break;
				case 3:
					evenAndOdd(menuArray);
				    break;
				case 4:
					primes(menuArray);
				    break;
				case 5:
					//enterList();
					menu();
					
					break;
				case 6:
					System.out.println("Program Exiting");
					running = false;
					break;
				default:
					System.out.println("Error: Wrong input"); 
			}
		}
		while(running); // condition if remain true
		
		scnr1.close();
	}
	
	
	/** EnterList purpose is to initially getting the users information
	 *  Then calls on the menu method to display options for the user
	 */
	
	//trying to get user to enter new list of arrays 
	//public static void enterList()
	public static int[] enterList(Scanner scnr)
	{
		
		//Scanner scnr = new Scanner(System.in); //declaring scanner
		
		//	Getting user input
		System.out.println("Enter list of Integers Separated by Spaces: ");
		String userInput = scnr.nextLine();
	
		
		String[] stringArray = userInput.split(" ");//splitting the input
		
		//	declare an integer array with same size as the string 
		int [] numArray = new int[stringArray.length];
		for(int i = 0; i < numArray.length;i++) 
		{
			numArray[i] = Integer.parseInt(stringArray[i]); //for loop using pareInt converting one element at a time from string to integer
		}
		return numArray;
		
	}
	
	
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		menu();
		

	}

}
