package test11.ex02;

interface A2{
	void aaa();  //public abstract void aaa();
	public abstract void bbb();
}

class B2 implements A2{
	public void aaa() {
		System.out.println("aaa�޼ҵ�");
	}
	
	public void bbb() {
		System.out.println("bbb�޼ҵ�");
	}
	
}


public class Round14_Ex02 {

	public static void main(String[] args) {
		B2 bp=new B2();
		bp.aaa();
		bp.bbb();

	}

}
