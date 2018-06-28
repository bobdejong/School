package sec08.exam02_abstract_method;

public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound(); //추상 메소드
	
	
}


//추상메소드를 가지는 클래스는 무조건 추상클래스이다.
//반대로 추상클래스는 반드시 추상메소드가 있어야되는 것은 아니다.