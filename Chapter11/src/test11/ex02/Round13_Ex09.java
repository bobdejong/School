package test11.ex02;

class A4{
	int x=100;
	int z=300;
	
	void plus(){
		
	}
}

class B4 extends A4{
	int y=200;
	int z=400;
	
	void plus(){
		System.out.println((x+y));
	}
	
}

public class Round13_Ex09 {

	public static void main(String[] args) {
		A4 ap=new B4();
		System.out.println("x="+ap.x);  //100
		System.out.println(ap.z);
		ap.plus();  //300

		B4 ab= new B4();
		System.out.println(ab.z);
	}

}
