package sec14.ex01_object;

import java.util.HashMap;

class Key{
	public int number;
	
	public Key(int number) {
		this.number=number;
	}
	
	@Override
	
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key key=(Key)obj;
			if(number==key.number)
			return true;
			
		}
			return false;
		
		
	}
	public int hashCode() {
		return number;
	}
	
}

public class KeyExample {

	public static void main(String[] args) {
		HashMap<Key,String> hashmap=new HashMap<Key,String>();
		
		hashmap.put(new Key(1),"ȫ�浿" );
		String value=hashmap.get(new Key(1));
		
		System.out.println(value);
		
		Object obj=new Object();
		System.out.println(obj);
		System.out.println(obj.hashCode());
		
		
		
		
		
		

	}

}
