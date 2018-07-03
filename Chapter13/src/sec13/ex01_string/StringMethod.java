package sec13.ex01_string;

public class StringMethod {

	public static void main(String[] args) {
		String str1="Smart";
		String str2=" and ";
		String str3="Simple";
		String str4=str1.concat(str2).concat(str3);
		System.out.println(str4);
		
		System.out.println("문자열의 길이"+str4.length());
		
		if(str1.compareTo(str3)<0)
		//if(str1.compareTo(str3)==0)  //같으면 0을 반환 크면 1을 반환 작으면 -1을 반환	
			System.out.println("str1이 앞선다");
			//System.out.println("같다");
		else
			System.out.println("str3이 앞선다.");
			//System.out.println("다르다");
		
		
	}

}
