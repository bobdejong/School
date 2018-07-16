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
	// ��ӹ��� �׽�Ƽ�� �������̽��� �����ϴ� �׽�Ƽ�� Ŭ����
	public void play(String source) {
		System.out.println("�÷��� ����:"+source);
	}
	public void stop() { 
		System.out.println("�÷��� ����");
	}	
	
	public void stoop() { 
		System.out.println("�÷��� ���");
	}	
}
}

public class NestedIFExample1 {

	public static void main(String[] args) {
		MP3PlayerFactory factory = new MP3PlayerFactory();
		PlayerFactory.Player player= factory.createPlayer();
		
		
		factory.new MP3Player().play("qqw");
        player.play("���պ�");
        player.stop();
        //player.stoop();
        factory.new MP3Player().stoop();
	}

}
