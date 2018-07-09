package sec17.ex01_datastructure;

import java.util.HashMap;
import java.util.Objects;

class Name{
	String firstName;
	String lastName;
	Name(String firstName, String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
		
	}
	public boolean equals(Object obj) {
		if(obj instanceof Name) {
			Name name=(Name)obj;
			return (this.firstName==name.firstName && this.lastName==name.lastName);
			
			
		}else 
			return false;
		
		}
	
	
	public int hashCode() {
		return Objects.hash(firstName,lastName);
		
	}
	
	
}

public class HashMapExample2 {

	public static void main(String[] args) {
		HashMap<Name,Integer> hashtable=new HashMap<Name,Integer>();
		hashtable.put(new Name("�ظ�","����"), new Integer(95));
		hashtable.put(new Name("�츣�̿´�","�׷�����"), new Integer(100));
		hashtable.put(new Name("��","����"), new Integer(85));
		hashtable.put(new Name("�巹��ũ","������"), new Integer(93));
		hashtable.put(new Name("�׺�","�չ���"), new Integer(70));
		
		Integer num=hashtable.get(new Name("�츣�̿´�","�׷�����"));
		System.out.println("�츣�̿´��� ������?"+num);
		
		
	}

}
















