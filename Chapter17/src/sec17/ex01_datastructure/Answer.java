package sec17.ex01_datastructure;

import java.util.HashMap;

class ContactInfo{
	String address;
	String phoneNo;
	ContactInfo(String address, String phoneNo){
		this.address=address;
		this.phoneNo=phoneNo;
		
	}
	
}


public class Answer {

	public static void main(String[] args) {
		HashMap<String,ContactInfo> hashtable=new HashMap<String,ContactInfo>();
		hashtable.put("ȫ�浿",new ContactInfo("��� ���θ�","010-000-0000"));
		hashtable.put("�����",new ContactInfo("����","02-300-0000"));
		hashtable.put("�����",new ContactInfo("û�㵿","02-500-0000"));

		ContactInfo con=hashtable.get("ȫ�浿");
		System.out.println(con.address);
		
		ContactInfo obj=hashtable.get("�����");
		
		System.out.println("������� ����ó:");
		System.out.println("�ּ�"+obj.address);
		System.out.println("��ȭ��ȣ"+obj.phoneNo);
		
	}

}
