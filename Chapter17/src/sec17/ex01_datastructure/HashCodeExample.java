package sec17.ex01_datastructure;

public class HashCodeExample {

	public static void main(String[] args) {
		String obj1=new String("�츣�̿´�");
		String obj2=new String("�츣�̿´�");
		
		int hash1=obj1.hashCode();
		int hash2=obj2.hashCode();

		System.out.println(hash1);
		System.out.println(hash2);
		
		
		if(obj1==obj2)
			System.out.println("true");
		else
			System.out.println("false");
		
		
		if(obj1.equals(obj2))
			System.out.println("true");
		else
			System.out.println("false");
		
	}

}
