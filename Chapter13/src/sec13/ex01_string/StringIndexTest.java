package sec13.ex01_string;

public class StringIndexTest {

	public static void main(String[] args) {
		String s="1234567890JAVA1234567890java";
		System.out.println(s);
		System.out.println("���ڿ��� ����"+s.length());
		System.out.println("indexOf(1)="+s.indexOf('J'));
		System.out.println("lastIndexOf(9)="+s.lastIndexOf('9'));
		System.out.println("indexOf(5,5)="+s.indexOf('5',5));
		System.out.println("lastIndexOf('5',17)="+s.lastIndexOf('5',17));
		System.out.println("indexOf(java,10)="+s.indexOf("java",10));
		System.out.println("lastindexOf(JAVA,23)"+s.lastIndexOf("java",25));
		
		
		
	}

}
