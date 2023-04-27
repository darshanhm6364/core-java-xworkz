class Swiggi{



public static double searchItem(String itemName){
	
	double price=0.00;
	System.out.println("swiggy methad started");
	
	if("palav"==itemName){
		System.out.println("first item is "+itemName);
		price=56.00;
	}
	if("bisebalebath"==itemName){
		System.out.println("secand item is "  +itemName);
		price=40.00;
	}
	if("curdRice"==itemName){
		System.out.println("third item is "  +itemName);
		price=70.00;
	}
	if("lemonRice"==itemName){
		System.out.println("forth item is "  +itemName);
		price=80.00;
	}
	if("edliVada"  ==itemName){
	System.out.println("fifth item is " +itemName);
	price=70.00;
		
	}
	System.out.println("swiggy methad started");
	return 0.00;
}
  public static double searchItem(String itemName, int quantity){
	  
	  double price=0.00;
	  if("palav"==itemName){
		System.out.println("first item is "+itemName);
		price=56.00 *quantity;
	}
	if("bisebalebath"==itemName){
		System.out.println("secand item is "  +itemName);
		price=40.00 *quantity;
	}
	if("curdRice"==itemName){
		System.out.println("third item is "  +itemName);
		price=70.00  * quantity;
	}
	if("lemonRice"==itemName){
		System.out.println("forth item is "  +itemName);
		price=80.00  * quantity;
	}
	if("edliVada"  ==itemName){
	System.out.println("fifth item is " +itemName);
	price=70.00 * quantity;
		
	}
	return 0.00;
	  
  }

}