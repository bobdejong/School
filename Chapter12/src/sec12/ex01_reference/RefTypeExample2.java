package sec12.ex01_reference;

class Point2 {
	int x,y;
	Point2(int x,int y){
		this.x=x;
		this.y=y;
	}
	
}

public class RefTypeExample2 {

	public static void main(String[] args) {
		Point2 obj=new Point2(10,20);
		System.out.printf("(%d,%d)%n",obj.x,obj.y);
		rearrange(obj);
		System.out.printf("(%d,%d)%n",obj.x,obj.y);
		
		int a=10;
		System.out.println(a);
		int b=a(a);
		System.out.println(b);
		
	}

	public static void rearrange(Point2 point) {
		point.x=30;
		point.y=40;
		
	}
	
	public static int a(int a) {
		a=a+1;
		
		return a;
		
	}
	
	
	
}
