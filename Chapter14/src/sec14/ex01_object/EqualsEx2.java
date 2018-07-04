package sec14.ex01_object;

class Person{
	long id;
	
	public boolean equals(Object obj) {
		
		if(obj!=null && obj instanceof Person) {
			Person person=(Person)obj;
			return id==person.id;
		}else {
			return false;
		}
		
	}
	
	Person(long id){
		this.id=id;
	}
	
}


public class EqualsEx2 {

	public static void main(String[] args) {
		Person p1=new Person(8011081111222L);
		Person p2=new Person(8011081111222L);
		
		if(p1==p2)
			System.out.println("p1��p2�� ���� ����Դϴ�");
		else
			System.out.println("p1��p2�� �ٸ� ����Դϴ�");
		if(p1.equals(p2))
			System.out.println("p1��p2�� ���� ����Դϴ�");
		else
			System.out.println("p1��p2�� �ٸ� ����Դϴ�");
		
		
	}

}
