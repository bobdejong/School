package sec15.ex01_wrapper;

public class WrapperTest {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		System.out.println("a+b="+c);
		
		Integer ia=new Integer(a);
		Integer ib=new Integer(b);
		
		System.out.println("ia="+ia+":ib="+ib);
		Integer ic=ia+ib;
		System.out.println("ia+ib="+ic);
		
	}

}
