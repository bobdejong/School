package exam01.ex02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringInputTest_09 {

	public static void main(String[] args) throws IOException {
		
		//���ڿ�
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		
		String name=""; //���ڿ� �ʱ�ȭ
		String name2="";
		System.out.print("�̸��� �Է��ϼ���:");
		name=in.readLine(); //���ڿ� �Է�
		System.out.print("�̸��� �Է��ϼ���:");
		name2=in.readLine(); //���ڿ� �Է�
		
		System.out.println("����� �Է��� �̸��� "+name+"�Դϴ�.");
		System.out.println("����� �Է��� �̸��� "+name2+"�Դϴ�.");
	
		
		
		

	}

}
