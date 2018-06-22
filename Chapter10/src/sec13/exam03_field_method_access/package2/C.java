package sec13.exam03_field_method_access.package2;

import sec13.exam03_field_method_access.packge1.A;

public class C {

	public C() {
		A a=new A();
		a.field1=1;
		//a.field2=1;  디폴트는 패키지 다르면 안됨
		//a.field3=1;  private라 안됨
		
		a.method1();
		//a.method2();  디폴트는 패키지 다르면 안됨
		//a.method3();  private라 안됨
		
		
		
	}
	
}
