package exam01.ex02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntInputTest_09_02 {

	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("���̸� �Է��ϼ���");
		String str=in.readLine(); //���ڿ� : "30"
		
		int age =Integer.parseInt(str); //���ڷ� ������ ���ڿ��� ���� ���ڷ� �ٲ��ش�. 
		int real_age = age-1;
		
		System.out.println("����� ��"+real_age+"�Դϴ�.");  //29
		
		

	}

}
