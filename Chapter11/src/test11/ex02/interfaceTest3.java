package test11.ex02;

class A11{
	void methodA() {
		I1 i=InstanceManager.getInstance();
		i.methodB();
	}
}

interface I1{
	public abstract void methodB();
}

class B1 implements I1{
	public void methodB() {
		System.out.println("methodB in B class");
	}
}

class InstanceManager{
	public static I1 getInstance() {
		return new B1();
	}
}


public class interfaceTest3 {

	public static void main(String[] args) {
		A11 a=new A11();
		a.methodA();

	}

}
