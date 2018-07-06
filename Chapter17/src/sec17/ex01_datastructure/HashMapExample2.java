package sec17.ex01_datastructure;

import java.util.HashMap;

class Name{
	String firstName;
	String lastName;
	Name(String firstName, String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
		
	}
	
	
	
}

public class HashMapExample2 {

	public static void main(String[] args) {
		HashMap<Name,Integer> hashtable=new HashMap<Name,Integer>();
		hashtable.put(new Name("해리","포터"), new Integer(95));
		hashtable.put(new Name("헤르미온느","그레인저"), new Integer(100));
		hashtable.put(new Name("론","위즐리"), new Integer(85));
		hashtable.put(new Name("드레이크","말포이"), new Integer(93));
		hashtable.put(new Name("네빌","롱버텀"), new Integer(70));
		
		Integer num=hashtable.get(new Name("헤르미온느","그레인저"));
		System.out.println("헤르미온느의 성적은?"+num);
		
		
	}

}
















