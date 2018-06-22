package sec13.exam02_constructor_access.package2;

import sec13.exam02_constructor_access.package1.A;

public class C {

	public static void main(String[] args) {
		A a1=new A(true);
		// A a2=new A(1); public이 안붙어서 에러
		//A a3=new A("문자열");  private라 안됨

	}

}
