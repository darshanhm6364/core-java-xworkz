class Fan1{


     static boolean isRun;
	 static int maxAir=10;
     static int minAir=5;
     static int currentAir=6;
	 
	 
	 public static void main(String []args){
		 System.out.println("main started");
		 
		 onOrOf();
		 System.out.println("fan is runned" + isRun);
		 
		 increseAir();
		 System.out.println("increseAir is passes" +minAir);
		 System.out.println("main ended");
		 
	 }

	 
	 
	 public static boolean onOrOf(){
		 
		 System.out.println("fan methad is started ");
		 
		 if(isRun==false){
			 isRun=true;
			 System.out.println("fan is turned on");
			 
		 }else if(isRun==true){
			 isRun=false;
			 System.out.println("fan is turned off");
			 
		 }
		 return isRun;
	 }
	  
	      public static int increseAir(){
			  
			  System.out.println("increseAir methad is started");
			  if(isRun==true){
				  
			  if(maxAir<currentAir){
				  
				  System.out.println("increseAir less than currentAir");
				  minAir=minAir+3;
				  System.out.println("the increseAir is" +minAir);
				  
			  }else{
				  System.out.println("max the air power ");
			  }
			  }else{
				  System.out.println("off the air power");
			  }
			  return maxAir;
			  
		  }
			  public static int decreseAir(){
				  System.out.println("decreseAir methad started");
				   return 0;
			  }
			 
		  }
		 

		 