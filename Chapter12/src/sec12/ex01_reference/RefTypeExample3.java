package sec12.ex01_reference;

class Point3 {
	int x,y;
	Point3(int x,int y){
		this.x=x;
		this.y=y;
	}
	
}

public class RefTypeExample3 {

	public static void main(String[] args) {
		//Point3 obj;
		Point3 obj=null; //초기화
		//obj=new Point3(100,200);
		
		if(obj==null) {
			System.out.println("obj변수가 가리키는 객체가 없습니다.");
			return; //메소드 종료
		}
		
		System.out.println(obj.x);
		System.out.println(obj.y);

	}

}
