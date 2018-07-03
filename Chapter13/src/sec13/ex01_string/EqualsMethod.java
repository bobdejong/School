package sec13.ex01_string;

public class EqualsMethod {

	public static void main(String[] args) {
		String str1=new String("gemini");
		String str2=new String("gemini");
		String str3=new String("johnharu");

		System.out.println("str1.equals(str2):"+str1.equals(str1));
		System.out.println("str1.equals(str3):"+str1.equals(str3));
		
		str3=str1;
		System.out.println("str1.equals(str3):"+str1.equals(str3));
		
		String str4="johnharu";
	
		System.out.println(str4);
	}

}
