package sec20.ex01_system;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemExample1 {

	public static void main(String[] args) {
		InputStreamReader reader=new InputStreamReader(System.in);
		//System.in: ǥ�� �Է�ó��, System.out:ǥ�� ��� ó��
		//InputStream in:����Ʈ ��Ʈ���� �Է¹޴� Ŭ����
		try {
			while(true) {
				char ch=(char)reader.read();
				System.out.println("�Էµ� ����:"+ch);
				if(ch=='.')
					break;
			}
		}catch(IOException e){
			System.out.println("Ű���� �Է� ����");
		}

	}

}
