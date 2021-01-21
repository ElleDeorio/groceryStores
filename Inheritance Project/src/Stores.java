import java.util.ArrayList;
import java.util.Scanner;

public class Stores {
public void storeNames(){
	ArrayList<String> groceryStores= new ArrayList<String>();
	groceryStores.add("King Soopers");
	groceryStores.add("Trader Joes");
	groceryStores.add("Costco");
	groceryStores.add("Sams Club");
	groceryStores.add("Safeway");
	groceryStores.add ("Whole Foods");
	groceryStores.add("Sprouts");
	System.out.println ("Which store are you shopping at?");
	System.out.println(groceryStores);
	Scanner store= new Scanner (System.in);
	String name;
	name= store.next();
}
}

