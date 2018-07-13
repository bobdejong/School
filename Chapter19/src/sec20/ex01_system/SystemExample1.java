package sec20.ex01_system;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemExample1 {

	public static void main(String[] args) {
		InputStreamReader reader=new InputStreamReader(System.in);
		//System.in: 표준 입력처리, System.out:표준 출력 처리
		//InputStream in:바이트 스트림을 입력받는 클래스
		try {
			while(true) {
				char ch=(char)reader.read();
				System.out.println("입력된 문자:"+ch);
				if(ch=='.')
					break;
			}
		}catch(IOException e){
			System.out.println("키보드 입력 에러");
		}

	}

}
