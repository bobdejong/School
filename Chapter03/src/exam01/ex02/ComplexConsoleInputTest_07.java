package exam01.ex02;

import java.io.IOException;

public class ComplexConsoleInputTest_07 {

	public static void main(String[] args) throws IOException {
			System.out.print("�Է�1=");
			char input_01=(char)System.in.read();
			System.in.read(); //'cr' '\r' 13  ����Ű�� �ƽ�Ű�ڵ� �ΰ��� ����
			System.in.read(); //'LF' '\n' 10
			
			System.out.print("�Է�2=");
			int input_02=System.in.read()-48;  //48(0)  57(9)

			int input_03=System.in.read(); //�Է��Ҷ� ģ ����Ű�� �ƽ�Ű�ڵ� ���� ����Ǿ���
			int input_04=System.in.read(); //����Ű�� �ƽ�Ű�ڵ� �ΰ��� �����̶� �ΰ��� ���� ����
			
			System.out.println("�Էµ� ���ڴ�"+input_01+"�Դϴ�.");
			System.out.println("�Էµ� ���ڴ�"+input_02+"�Դϴ�.");
			
			System.out.println("�Էµ� ���ڴ�"+input_03+"�Դϴ�.");
			System.out.println("�Էµ� ���ڴ�"+input_04+"�Դϴ�.");
			
			
			
	}

}
