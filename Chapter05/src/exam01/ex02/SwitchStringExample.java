package exam01.ex02;

public class SwitchStringExample {

	public static void main(String[] args) {
		String position="과장";
				
				switch(position) {
				
				case "부장":  //version 7.0부터 문자열 가능
					System.out.println("700만원");
					break;
				case "과장":
					System.out.println("500만원");
					break;
					default:
						System.out.println("300만원");
				
				}

	}

}
