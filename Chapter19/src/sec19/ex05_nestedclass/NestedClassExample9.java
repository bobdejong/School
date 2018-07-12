package sec19.ex05_nestedclass;

interface Player{
	void play(String source);
	void stop();
	
}



public class NestedClassExample9 {

	public static void main(String[] args) {
		Player obj=new Player() {
			public void play(String source) {
				System.out.println("플레이 시작:"+source);
			}
			public void stop() {
				System.out.println("플레이 종료");
			}
		};

		obj.play("렛잇비.mp3");
		obj.stop();
	}

}
