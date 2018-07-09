package sec17.ex01_datastructure;

import java.util.HashSet;
import java.util.Objects;

class Person{
	String name;
	int age;
	Person(String name,int age){
		this.name=name;
		this.age=age;
		
	}
	
	public String toString() {
		return name+":"+age;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person person=(Person)obj;
			return this.age==person.age && this.name==person.name;
			
		}else 
			return false;
	}
	
	public int hashCode() {
		
		return Objects.hash(name,age);
	}
	
}

public class HashSetEx3 {

	public static void main(String[] args) {
		HashSet<Object> set=new HashSet<Object>();  //new는 다른걸로 봄
		/*set.add("abc");
		set.add("abc");*/
		
		set.add(new String("abc"));
		set.add(new String("abc"));
		set.add(new Person("David",10));
		set.add(new Person("David",1));
		System.out.println(set);

	}

}
