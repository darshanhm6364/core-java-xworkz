class FlipKartTester{

    //java main methad
public static void main(String Flipkart []){
 
     System.out.println("main methad started");
       //invoking a method
      String meterialName="fan";
	  double price=Flipkart.searchMetrials(meterialName);
	  
	  System.out.println("the price of   " +meterialName+"is" +price);
     System.out.println("main methad ended");
}
}