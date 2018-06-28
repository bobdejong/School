package test11.ex02;

class Super_01{
	private int x;
	private int y;
	
	public Super_01() {
		super();// Object 클래스의 default 생성자 호출
		this.x=10;
		this.y=20;
	}
	
	public Super_01(int x) {
		this();
		this.x=x;
	}
	
	public Super_01(int x,int y) {
		this(x);
		this.y=y;
	}
	
	public int x() {
		return x;
	}
	public int y() {
		return y;
	}
	
	public String toString() {
		return x+" "+y;
	}
	
}

class Sub_01 extends Super_01{
	private int r;
	public Sub_01() {
		super();
		this.r=30;
		System.out.println(super.x()+","+super.y()+","+r);
	}
	
	public Sub_01(int x) {
		super(x);
		this.r=30;
		System.out.println(super.x()+","+super.y()+","+r);
	}
	
	public Sub_01(int x, int y) {
		super(x,y);
		this.r=30;
		System.out.println(super.x()+","+super.y()+","+r);
	}
	
	public Sub_01(int x,int y,int r) {
		this(x,y);
		this.r=r;
		System.out.println(super.x()+","+super.y()+","+r);
	}
	
	public String toString() {
		return super.toString()+" "+r;
	}
	
}



public class SuperMethodTest_05 {

	
	public static void main(String[] args) {
		Sub_01 sb=new Sub_01();
		Sub_01 sb1=new Sub_01(50);
		Sub_01 sb2=new Sub_01(50,80);
		Sub_01 sb3=new Sub_01(50,80,120);
		
		
		System.out.println(sb);
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb3);
		
		
		
		
		

	}

}
