package exam01.ex02;

import java.io.IOException;

public class WhileKeyControlExample {

	public static void main(String[] args) throws IOException {
		boolean run=true;
		int speed=0;
		int keyCode=0;
		
		while(run) {
			if(keyCode !=13 && keyCode !=10) {  //엔터를 치면 아래 내용을 보여줘라
				System.out.println("-------------------------");
				System.out.println("1.증속|2.감속|3.중지");
				System.out.println("-------------------------");
				System.out.println("선택:");
				
			}
			
			keyCode=System.in.read();//정수처리,1,2,3(문자)
			
			if(keyCode == 49) {  //49=1
				speed++;
				System.out.println("현재 속도="+speed);
			}else if(keyCode == 50) {  //50==2
				speed--;
				System.out.println("현재 속도="+speed);
			}else if(keyCode == 51) {  //3
				run=false;
				
			}
		
			
		}
		System.out.println("프로그램 종료");	
	}

}
