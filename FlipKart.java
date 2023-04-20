class Flipkart{


 public static double searchMetrials(String meterialName){
	 
	 System.out.println("main methad started");
	 
	 if("fan"==meterialName){
		 System.out.println("selecting item1" +meterialName);
		 return 1000.00;
		 
	 }
	 
	 if("mobile"==meterialName){
		 System.out.println("selecting item 2" +meterialName);
		 return 10000.00;
		 
	 }
	 if("lapTop"==meterialName){
		 System.out.println("selecting item 3"+meterialName);
		 return 50000.00;	 
	 }
	 if("pant"==meterialName){
		 System.out.println("selecting item 4" +meterialName);
		 return 3330.00;
	 }
	 if("shirt"==meterialName){
		 System.out.println("selecting item 5 "+meterialName);
		 return 1000.00;
		 
	 }
	 if("bag"==meterialName){
		 System.out.println(" selecting item 6" +meterialName);
		 return 4000.00; 
	 }
	 if("table"==meterialName){
		 System.out.println("selecting item  7" +meterialName);
		 return 20000.00;
		 
	 }
	 if("bulp"==meterialName){
		 System.out.println("selecting item 8" +meterialName);
		 return 100.00;
		 
	 }
        if("charger"==meterialName){
			System.out.println("selecting item 9"+meterialName);
			return 400.00;
 }
          if("boots"==meterialName){
			  System.out.println("selecting item 10"  +meterialName);
			  return 600.00;
			  
		  }
	     if("spects"==meterialName){
			 System.out.println("selecting item 11 " +meterialName);
			 return 10000.00;
			 
		 }
		 if("beer"==meterialName){
			 System.out.println("selecting item 12"+meterialName);
			 return 230.00;
			 
		 }
		 if("slepper"==meterialName){
			 System.out.println("selecting item 13"  +meterialName);
			 return 700.00;
		 }
		 
		 if("headphone"==meterialName){
			 System.out.println("selecting item 14 " +meterialName);
			 return 4000.00;
			 
		 }
		 if("trimmer"==meterialName){
			 System.out.println("selecting item  15"  + meterialName);
			 return 4000.00;
		 }
	 System.out.println("main methad ended");
	  return 0.00;
 }

}