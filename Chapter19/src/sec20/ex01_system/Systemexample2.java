package sec20.ex01_system;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Systemexample2 {

	public static void main(String[] args) {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		//행단위로 표준 입력
		try {
			String str=reader.readLine(); //행단위
			System.out.println("입력된 문자열:"+str);
		}catch(Exception e) {
			System.out.println("키보드 입력 에러");
		}

	}

}
