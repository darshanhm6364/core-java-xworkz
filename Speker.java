
class Speker{

 static boolean isConnected;
 static String name="bolt";
 static double price=3000.00;
 static int maxValume=8;
 static int minValume=0;
 static int currentValume;
 
 
 public static void main( String speker []){
	 
	 System.out.println("main started");
	 
	         onOrOff();
			 increaseVolume();
			  increaseVolume();
			 increaseVolume();
			  increaseVolume();
			  increaseVolume();
			  increaseVolume();
			 
			 System.out.println("speker is connected----"  +isConnected);
			 
			 onOrOff();
			 
						 increaseVolume();
						 
						 decreaseValume();
						
			 
	 System.out.println("main ended");
 }
 
 
 public  static boolean onOrOff(){
 System.out.println("onOrOff method is started");
 
 
 // canditinal statement
 //false==false
  if(isConnected==false){
	  isConnected=true;
	  System.out.println("speker is turnned on........");
	  
  }
  else if(isConnected==true){
	  isConnected=false;
	  System.out.println("speker is turnned off.....");
	  
  }
  return isConnected;
 }
 public static int increaseVolume()
	{
		System.out.println("increaseVolume method is started");
	 
	 //false==true
if (isConnected==true)
{
		if(currentValume<maxValume)
		{
		 System.out.println("current valve is less than max procced");
		 currentValume=currentValume+1;
		 System.out.println("the current  valve is  "+currentValume);
		}
			else
	 {
         System.out.println("max valve is reached");
     }
	 }
	 else
		 {
           System.out.println("turn on the spekar");	
		} 
	 System.out.println("increaseVolume method is ended");
	 return currentValume;
  }
      public static  int decreaseValume(){
		  
		  System.out.println("decreaseValume is started");
		  if(isConnected==true)
		  {
			if(minValume>currentValume){
				System.out.println("current valve is less than minValve");
				maxValume=maxValume-1;
				System.out.println("the current valve is " +maxValume);
				
			}  else{
				System.out.println("min valve is reached");

			}
		
		  }
		  else{
			  System.out.println("turn of the spekar");
		  }
		  System.out.println("decreaseValume is ended  ");
		  return minValume;
	  }
  }
 
 




