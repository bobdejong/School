package test11.ex02;

interface A2{
	void aaa();  //public abstract void aaa();
	public abstract void bbb();
}

class B2 implements A2{
	public void aaa() {
		System.out.println("aaa메소드");
	}
	
	public void bbb() {
		System.out.println("bbb메소드");
	}
	
}


public class Round14_Ex02 {

	public static void main(String[] args) {
		B2 bp=new B2();
		bp.aaa();
		bp.bbb();

	}

}
