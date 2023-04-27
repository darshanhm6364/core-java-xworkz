class SwiggiTester{


public static void main(String[] swiggi){
	
	String itemName="palav";
	
	double rate=Swiggi.searchItem(itemName);
	
	double ratewithquanity=Swiggi.searchItem(itemName ,2);
	System.out.println("the item price is "  +  itemName  +"is"  + rate);
	System.out.println("the item price is "  +  itemName  +"is"  + ratewithquanity);
}

}