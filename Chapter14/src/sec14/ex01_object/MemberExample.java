package sec14.ex01_object;

class Member{
	public String id;
	
	public Member(String id) {
		this.id=id;
		
	}
	
	//overroding
	public boolean equals(Object obj) {
		if(obj!=null && obj instanceof Member) {
			Member member=(Member)obj;
			return id==member.id;
		}else
			return false;
			
		
	}
	
	
}

public class MemberExample {

	public static void main(String[] args) {
		Member obj1=new Member("blue");
		Member obj2=new Member("blue");
		Member obj3=new Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1�� obj2�� �����մϴ�.");
		}else
			System.out.println("obj1�� obj2�� �������� �ʽ��ϴ�.");

		if(obj1.equals(obj3)) {
			System.out.println("obj1�� obj3�� �����մϴ�.");
		}else
			System.out.println("obj1�� obj3�� �������� �ʽ��ϴ�.");

		

	}

}
