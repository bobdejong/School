package sec13.exam01_class_access.package1;

public class B {
	
	public B() {
		System.out.println("publicÀÌ ÀÖ´Â B class");
		
	}

	public static void main(String[] args) {
		A a=new A();
		B b=new B();

	}

}
