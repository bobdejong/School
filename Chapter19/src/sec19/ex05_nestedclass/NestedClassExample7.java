package sec19.ex05_nestedclass;

import java.util.HashMap;

public class NestedClassExample7 {

	public static void main(String[] args) {
		class ContactInfo{  //local inner class
			String address;
			String phoneNo;
			ContactInfo(String address,String phoneNo){
				this.address=address;
				this.phoneNo=phoneNo;	
			}	
		}

		HashMap<String,ContactInfo> hashtable=new HashMap<String,ContactInfo>(); 
		
		hashtable.put("�̼���", new ContactInfo("����� ������","02-547-0000"));
		hashtable.put("�̼���", new ContactInfo("����� ���ϱ�","02-354-0000"));
		hashtable.put("�̼�ö", new ContactInfo("��⵵ ����","02-535-0000"));
		
		ContactInfo obj=hashtable.get("�̼���");
		
		System.out.println("<�̼����� ����ó>");
		System.out.println("�ּ�"+obj.address);
		System.out.println("��ȭ��ȣ"+obj.phoneNo);
	}

}
