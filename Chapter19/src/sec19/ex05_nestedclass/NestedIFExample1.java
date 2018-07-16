package sec19.ex05_nestedclass;

abstract class PlayerFactory{
	abstract Player createPlayer();
	interface Player{  //nested interface
		void play(String source);
		void stop();
	}
}

class MP3PlayerFactory extends PlayerFactory{
	
	public Player createPlayer() {
		return new MP3Player();  
	}



class MP3Player implements Player{
	// 상속받은 네스티드 인터페이스를 구현하는 네스티드 클래스
	public void play(String source) {
		System.out.println("플레이 시작:"+source);
	}
	public void stop() { 
		System.out.println("플레이 종료");
	}	
	
	public void stoop() { 
		System.out.println("플레이 계속");
	}	
}
}

public class NestedIFExample1 {

	public static void main(String[] args) {
		MP3PlayerFactory factory = new MP3PlayerFactory();
		PlayerFactory.Player player= factory.createPlayer();
		
		
		factory.new MP3Player().play("qqw");
        player.play("렛잇비");
        player.stop();
        //player.stoop();
        factory.new MP3Player().stoop();
	}

}
