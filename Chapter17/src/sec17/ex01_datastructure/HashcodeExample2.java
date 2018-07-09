package sec17.ex01_datastructure;

class Name2{
	String firstName;
	String lastName;
	Name2(String firstName, String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
		
	}
	
	public int hashCode() {
		return firstName.hashCode()+lastName.hashCode();
		
	}

}
public class HashcodeExample2 {

	public static void main(String[] args) {
		Name2 obj1=new Name2("헤르미온느","그레인저");
		Name2 obj2=new Name2("헤르미온느","그레인저");
		
		int hash1=obj1.hashCode();
		int hash2=obj2.hashCode();
		
		System.out.println(hash1);
		System.out.println(hash2);
		
		
		
	}

}
