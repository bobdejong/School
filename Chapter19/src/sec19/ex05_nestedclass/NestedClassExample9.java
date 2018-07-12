package sec19.ex05_nestedclass;

interface Player{
	void play(String source);
	void stop();
	
}



public class NestedClassExample9 {

	public static void main(String[] args) {
		Player obj=new Player() {
			public void play(String source) {
				System.out.println("�÷��� ����:"+source);
			}
			public void stop() {
				System.out.println("�÷��� ����");
			}
		};

		obj.play("���պ�.mp3");
		obj.stop();
	}

}
