package sec20.ex01_system;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Systemexample2 {

	public static void main(String[] args) {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		//������� ǥ�� �Է�
		try {
			String str=reader.readLine(); //�����
			System.out.println("�Էµ� ���ڿ�:"+str);
		}catch(Exception e) {
			System.out.println("Ű���� �Է� ����");
		}

	}

}
