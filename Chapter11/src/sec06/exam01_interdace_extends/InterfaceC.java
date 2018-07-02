package sec06.exam01_interdace_extends;

public interface InterfaceC extends InterfaceA,InterfaceB{
	public void methodC();
//일반 클래스는 다중상속 안된다.
//자식이 interface일 경우 extends로 받을 수있다. 
//자식이 일반 클래스일 경우 인터페이스를 implements로 받아야 한다.
	
	
}
