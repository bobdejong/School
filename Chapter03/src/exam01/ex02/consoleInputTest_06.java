package exam01.ex02;

import java.io.IOException;

public class consoleInputTest_06 {

	public static void main(String[] args) throws IOException {
		System.out.print("�Է�=");
		int data=System.in.read(); //�ƽ�Ű�ڵ� �ϳ� �Է¹ޱ�
		
		System.out.println("�Է��� �ƽ�Ű�ڵ� ����"+(char)data+"�Դϴ�.");
		System.out.println("�Է��� �ƽ�Ű�ڵ� ����"+data+"�Դϴ�.");

	}

}
