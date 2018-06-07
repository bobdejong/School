package exam01.ex02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringInputTest_09 {

	public static void main(String[] args) throws IOException {
		
		//문자열
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		
		String name=""; //문자열 초기화
		String name2="";
		System.out.print("이름을 입력하세요:");
		name=in.readLine(); //문자열 입력
		System.out.print("이름을 입력하세요:");
		name2=in.readLine(); //문자열 입력
		
		System.out.println("당신의 입력한 이름은 "+name+"입니다.");
		System.out.println("당신의 입력한 이름은 "+name2+"입니다.");
	
		
		
		

	}

}
