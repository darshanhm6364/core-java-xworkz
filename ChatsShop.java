class ChatsShop{


public static void main(String chats[]){
	//local array
	String chatsShop[]={"mallikarjun","manjunath","poolar","mahatama"};
	
	System.out.println("main method started");
	//invoking or calling getChatsShop method in main method
	getChatsShop(chatsShop);
	System.out.println("main methos ended");
}
	
	
	
	public static void getChatsShop(String[]chatsShop){
	System.out.println("chatsshop are"+ chatsShop.length);
	
	for(int i=0 ;i<chatsShop.length ;i++){
		System.out.println(chatsShop[i]);
		
	}
	}
}