package sec06.exam01_interdace_extends;

public class Implementation implements InterfaceC {
	public void methodA() {
		System.out.println("ImplementationC-methodA() 실행");
	}
	
	public void methodB() {
		System.out.println("ImplementationC-methodB() 실행");
	}
	
	public void methodC() {
		System.out.println("ImplementationC-methodC() 실행");
	}
}

//public class A extends B,C (x)
//public class A extends B(일반클래스) implements C(interface),D(interface)