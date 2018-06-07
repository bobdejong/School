package exam01.ex02;

import java.io.IOException;

public class consoleInputTest_06 {

	public static void main(String[] args) throws IOException {
		System.out.print("입력=");
		int data=System.in.read(); //아스키코드 하나 입력받기
		
		System.out.println("입력한 아스키코드 값은"+(char)data+"입니다.");
		System.out.println("입력한 아스키코드 값은"+data+"입니다.");

	}

}
