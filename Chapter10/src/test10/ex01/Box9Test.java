package test10.ex01;

class Box9{
	private int width;
	private int height;
	private int depth;
	public long idNum;
	
	static long boxID=100;
	
	static long getCurrentID() {
		int count=1;
			boxID+=count;
		return boxID;
		
	}
	
	
}





public class Box9Test {

	public static void main(String[] args) {
		Box9 mybox1=new Box9();
		mybox1.idNum=Box9.getCurrentID();
		Box9 mybox2=new Box9();
		mybox2.idNum=Box9.getCurrentID();
		
		
		System.out.println("mybox1�� id��ȣ:"+mybox1.idNum);  //101
		System.out.println("mybox2�� id��ȣ:"+mybox2.idNum);  //102
		System.out.println("���� �ڽ��� ��ȣ��"+Box9.getCurrentID()+"�� �Դϴ�.");  //103
		
		
		
		
		
		
		
		
		

	}

}
