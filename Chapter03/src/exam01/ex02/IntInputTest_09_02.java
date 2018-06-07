package exam01.ex02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntInputTest_09_02 {

	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("나이를 입력하세요");
		String str=in.readLine(); //문자열 : "30"
		
		int age =Integer.parseInt(str); //숫자로 구성된 문자열을 실제 숫자로 바꿔준다. 
		int real_age = age-1;
		
		System.out.println("당신은 만"+real_age+"입니다.");  //29
		
		

	}

}
