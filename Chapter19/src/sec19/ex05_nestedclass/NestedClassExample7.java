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
		
		hashtable.put("이순희", new ContactInfo("서울시 강남구","02-547-0000"));
		hashtable.put("이순자", new ContactInfo("서울시 성북구","02-354-0000"));
		hashtable.put("이순철", new ContactInfo("경기도 고양시","02-535-0000"));
		
		ContactInfo obj=hashtable.get("이순자");
		
		System.out.println("<이순자의 연락처>");
		System.out.println("주소"+obj.address);
		System.out.println("전화번호"+obj.phoneNo);
	}

}
