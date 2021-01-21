import java.util.Scanner;

public class Grocery extends Stores {
	public void aisles (){
		super.storeNames();
		Scanner in= new Scanner (System.in);
		String item;
		
		String dairy= "one";
		String drinks= "two";
		String snacks="three";
		String hygene= "four";
		String baking= "five";
		String pharmacy="six";
		String meats= "seven";
		String cheese= "eight";
		
		System.out.println("Please enter the item you are looking for:");
		item= in.next();
		if (item=="dairy")
		{
			System.out.println(dairy);
		}
		else if (item=="drinks")
		{
			System.out.println(drinks);
		}
		else if (item=="snacks")
		{
			System.out.println(snacks);
		}
		else if (item=="hygene")
		{
			System.out.println(hygene);
		}
		else if (item=="baking")
		{
			System.out.println(baking);
		}
		else if (item== "pharmacy")
		{
			System.out.println(pharmacy);
		}
		else if(item== "meats")
		{
			System.out.println(meats);
			
		}
		else if (item== "cheese")
		{
			System.out.println(cheese);
		}
		else 
		{
			System.out.println("There is no aisle that matches your item.");
		}
		
		
		
		
}
}
