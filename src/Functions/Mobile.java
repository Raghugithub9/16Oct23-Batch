package Functions;

public class Mobile {

	public static void main(String[] args) {
		
		calling();
		chatting();
		calling();
		chatting();
		calling();
		chatting();
		
		Mobile.calling();
		Mobile.chatting();
		
		
		//games()
		
		Mobile m1=new Mobile();
		Mobile m2=new Mobile();
		Mobile m3=new Mobile();
		Mobile m4=new Mobile();
		Mobile m5=new Mobile();
		Mobile m6=new Mobile();
		
		m1.games();
		m1.games();
		m1.games();
		m1.games();
		m2.games();
		m3.calling();
		
		
		
		
		
		
		
		
	}
	
	//static function
	public static void calling() {
		System.out.println("Calling");
	}
	
	//static function
	public static void chatting() {
		System.out.println("Chatting");
	}

	//non static function
	public  void games() {
		System.out.println("games");
	}

}
