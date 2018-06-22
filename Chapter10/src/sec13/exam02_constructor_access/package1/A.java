package sec13.exam02_constructor_access.package1;

public class A {
	
	A(){}
	public A(boolean b) {
		System.out.println(b);
		
	}
	A(int b){  //default
		System.out.println(b);
	}
	private A(String s) {    //private면 객체생성을 못한다.
		System.out.println(s);
	}
	
	
}
