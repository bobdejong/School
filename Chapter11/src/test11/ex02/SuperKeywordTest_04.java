package test11.ex02;

class Super{
	int x=100;
	public void display() {
		System.out.println("x="+this.x);
	}
	
}

class Sub extends Super{
	int y=200;
	
	public void display() {
		System.out.println("x="+super.x);
		System.out.println("y="+this.y);
	}
}

public class SuperKeywordTest_04 {

	public static void main(String[] args) {
		Super sup=new Super();
		Sub sub=new Sub();
		
		sup.display();
		System.out.println();
		sub.display();

	}

}
