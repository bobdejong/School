package sec06.exam01_interdace_extends;

public class Implementation implements InterfaceC {
	public void methodA() {
		System.out.println("ImplementationC-methodA() ����");
	}
	
	public void methodB() {
		System.out.println("ImplementationC-methodB() ����");
	}
	
	public void methodC() {
		System.out.println("ImplementationC-methodC() ����");
	}
}

//public class A extends B,C (x)
//public class A extends B(�Ϲ�Ŭ����) implements C(interface),D(interface)