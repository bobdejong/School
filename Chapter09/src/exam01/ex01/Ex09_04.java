package exam01.ex01;

public class Ex09_04 {

	public static void main(String[] args) {
		String str="Java를 공부하는 중, Java는 재밌어요..";
		
		System.out.println("문자열==>"+str);
		System.out.println("제일 먼저 나오는 Java위치");
		System.out.println(str.indexOf("Java"));
		System.out.println("마지막에 나오는 Java위치");
		System.out.println(str.lastIndexOf("Java"));

	}

}
