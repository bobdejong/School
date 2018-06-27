package sec07.exam06_casting;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent=new Child();
		parent.field1="data1";
		parent.method();
		parent.method2();
		
		//parent.field2="data2";
		
		Child child=(Child)parent;  //강제 형변환,down casting
		
		child.field2="yyy";
		child.method3();
		
		
	}

}
