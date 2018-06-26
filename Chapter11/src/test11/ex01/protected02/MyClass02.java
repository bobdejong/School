package test11.ex01.protected02;

import test11.ex01.protected01.MyClass01;

public class MyClass02 extends MyClass01{

	public static void main(String[] args) {
		MyClass02 my2=new MyClass02();  //상속에서는 부모객체가 생성되야함 자식객체가 사용되어야 부모객체가 생성됨
		my2.name="JAVA JDK8.0";

	}

}
