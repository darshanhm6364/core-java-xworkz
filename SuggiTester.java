class SuggiTester{


public static void main(String suggi[]){
	System.out.println("main methad is started");
	
	String itemName="nuddles";
	
	int rate=Suggi.searchItem(itemName);
	System.out.println("the rate of "+itemName+"is"+rate);
	
	
	System.out.println("main methad is ended");
	
	
}


}