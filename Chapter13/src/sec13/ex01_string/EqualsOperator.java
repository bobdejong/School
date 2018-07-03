package sec13.ex01_string;

public class EqualsOperator {

	public static void main(String[] args) {
		String str1=new String("gemini");
		String str2=new String("gemini");
		String str3=new String("johnharu");

		str3=str1;
		
		System.out.println("str1==str2"+(str1==str2));
		System.out.println("str1==str3"+(str1==str3));
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		
	}

}
