package exam01.ex02;

import java.util.Scanner;

public class SwitchControlTest_03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		byte jumin_07 = -1; // 음수는 주민번호에 없을 것이므로 음수로 초기화
		short year = 0; // 태어난 연도를 저장할 공간
		String gender = ""; // 성별을 저장할 공간

		System.out.println("주민번호 7번째 자리=");
		jumin_07 = in.nextByte();
		switch (jumin_07) {
		case 9:
		case 0:
			year = 1800;
			break;
		case 1:
		case 2:
			year = 1900;
			break;
		case 3:
		case 4:
			year = 2000;
			break;
		default:
			year=-1;

		}
		
		if(year !=-1) {
			//조건 연산자 (조건)? 참:거짓
			gender=(jumin_07 % 2 ==0 )?"여성":"남성";
			
		}
		System.out.println();
		System.out.println("당신은"+year+"년대 "+gender+"입니다.");
		
		
	}

}
