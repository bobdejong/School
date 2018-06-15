package exam01.ex01;

public class Ex09_09 {

	public static void main(String[] args) {
		String str1="Java Programming";
		String str2="Java Programming";
		String str3=new String("Java Programming");
		
		System.out.println("원 문자열1==>["+str1+"]");
		System.out.println("원 문자열1==>["+str2+"]");
		System.out.println("원 문자열1==>["+str3+"]\n");
		
		System.out.println("문자열1==문자열2 결과:\t"+(str1==str2));  //주소값을 비교
		System.out.println("문자열1.equals(문자열2) 결과:"+str1.equals(str2)); //실제 문자열을 비교
		System.out.println("문자열1==문자열3 결과:\t"+(str1==str3)); //new 때문에 새로운 주소값을 만듬
		System.out.println("문자열1.equals(문자열3) 결과:"+str1.equals(str3));
		

	}

}
