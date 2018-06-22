package test10.ex01;

public class Aaa {

	public static void main(String[] args) {  //메인은 자바가상머신(jvm)이 호출
		Aaa.makeAaa();
		
	}

	static void makeAaa() {
		Aaa a1=new Aaa();
		System.out.println("객체생성");
		
	}

}
