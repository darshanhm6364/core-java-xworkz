class SuperMarket{

public static void main(String market[]){

  String groceries[]={"mangal","kangtak","patato","onion","maida","atta","besan","sugar"};
  
  String chocklets[]={"appenliby","mango","pulse","vices","diaryMilk","milkybar","kitkat","mentos"};
  
  String homeProduct[]={"fan","bulp","gas","lighter","waterabottle","bags"};
  
String bakeryItems[]={"paps","biskets","cakes","pastry"};
  
  System.out.println(" number of groceries  " +   groceries.length);
  
  for (int i=0 ;i<groceries.length ;i++){
  System.out.println(groceries[i]);
  
  }
  
  System.out.println(" types of chockets"  + chocklets.length);
  for(int i=0; i<chocklets.length  ;i++){
	  System.out.println("sweet chocksss  "  +chocklets[i]);
	  
  }
  
  System.out.println("types of home mades  "+ homeProduct.length);
  for(int  i=0;  i<homeProduct.length ;i++){
	  System.out.println("home products "  +homeProduct[i]);
	  
  }
  
  System.out.println("bakery items   "  +   bakeryItems.length);
  for(int i=0;  i<bakeryItems.length  ; i++){
	  System.out.println("bakery sweet items are "  +bakeryItems[i]);
	  
	  
  }

}
}

