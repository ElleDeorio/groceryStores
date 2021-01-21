import java.util.Scanner;

public abstract class Produce extends Grocery {
public void inFruits(){
	super.storeNames();
	
	Scanner fruitScanner= new Scanner (System.in);
	String fruit;
	
	var berries= "cart one";
	var vegetables= "against back wall";
	var apples="cart four- both sides";
	var bananas= "cart three";
	System.out.println("Please enter the produce you are looking for:");
	fruit= fruitScanner.next();
	
	if (fruit=="berries")
	{
		System.out.println(berries);
		
	}
	else if (fruit== "vegetables")
	{
		System.out.println(vegetables);
	}
	else if (fruit== "apples")
	{
		System.out.println(apples);
		
	}
	else if (fruit== "bananas")
	{
		System.out.println(bananas);
	}
	else 
	{
		System.out.println("We do not see you produce at this store.");
	}
}
}
