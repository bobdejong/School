package sec13.ex01_string;

public class AppendString {

	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer("gemini");
		System.out.println("sb1="+sb1);
		
		StringBuffer sb2=sb1.append(" is beautiful");
		System.out.println(sb2);
		System.out.println(sb1);
		
		System.out.println(sb1.append(100));
		System.out.println("sb1="+sb1);

	}

}
