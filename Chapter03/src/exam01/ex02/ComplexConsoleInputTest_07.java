package exam01.ex02;

import java.io.IOException;

public class ComplexConsoleInputTest_07 {

	public static void main(String[] args) throws IOException {
			System.out.print("입력1=");
			char input_01=(char)System.in.read();
			System.in.read(); //'cr' '\r' 13  엔터키는 아스키코드 두개의 조합
			System.in.read(); //'LF' '\n' 10
			
			System.out.print("입력2=");
			int input_02=System.in.read()-48;  //48(0)  57(9)

			int input_03=System.in.read(); //입력할때 친 엔터키의 아스키코드 값도 저장되어짐
			int input_04=System.in.read(); //엔터키는 아스키코드 두개의 조합이라 두개의 값을 가짐
			
			System.out.println("입력된 문자는"+input_01+"입니다.");
			System.out.println("입력된 숫자는"+input_02+"입니다.");
			
			System.out.println("입력된 숫자는"+input_03+"입니다.");
			System.out.println("입력된 숫자는"+input_04+"입니다.");
			
			
			
	}

}
