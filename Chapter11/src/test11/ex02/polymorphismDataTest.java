package test11.ex02;

class DataSuper{
	private int x=100;
	private int y=200;  //무시
	
	public void setX(int x) {
		this.x=x;
	}
	
	public void setY(int y) {
		this.y=y;
	}
	
	public void setZ(int z) {
		
	}
	
	public void display() {
		System.out.println("x="+x+",y="+y);
	}
	
	
}

class DataSub extends DataSuper{
	private int y=300;
	private int z=400;
	public void setY(int y) {
		this.y=y;
	}
	
	public void setZ(int z) {
		this.z=z;
	}
	
	public void display() {
		super.display();
		System.out.println("y="+y+",z="+z);
	}
	
}


public class polymorphismDataTest{

	public static void main(String[] args) {
     	DataSuper sup = new DataSub();  //다형성
		
		sup.display();
		System.out.println();
		
		sup.setX(1);
		sup.display();
		System.out.println();
		
		sup.setY(2);
		sup.display();
		System.out.println();
		
		sup.setZ(3);
		sup.display();
		

	}

}
