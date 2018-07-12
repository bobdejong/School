package sec19.ex05_nestedclass;

abstract class MessageSender{
	abstract void send(String message) ;
	
	
}
class EmailSender extends MessageSender{
	String sender;
	String receiver;
	EmailSender(String sender, String receiver){
		this.sender=sender;
		this.receiver=receiver;
		
	}
	void send(String message) {
		System.out.println("������ ���"+sender);
		System.out.println("�޴� ���"+receiver);
		System.out.println("����"+message);
		System.out.println();
	}
	
}

class SMSSender extends MessageSender{
	String phoneNo;
	String responsePhoneNo;
	SMSSender(String phoneNo,String responsePhoneNo){
		this.phoneNo=phoneNo;
		this.responsePhoneNo=responsePhoneNo;
		
	}
	void send(String message) {
		System.out.println("��ȭ��ȣ"+phoneNo);
		System.out.println("����"+message);
		System.out.println("ȸ����ȭ��ȣ"+responsePhoneNo);
		System.out.println();
	}
	
}

public class NestClassExample8 {

	public static void main(String[] args) {
		//class SatelliteSender extends MessageSender{
		MessageSender obj=new MessageSender() {
			void send(String message) {
				System.out.println("�߽�:���̴ٽ�");
				System.out.println("����:�� ������");
				System.out.println("�޽���:"+message);
				System.out.println();
				
			}
		}; //anonymous inner class(�̸����� Ŭ���� - ������ ��ȣ�� ;�� �� ��������)
		//SatelliteSender obj=new SatelliteSender();
		obj.send("�¸��");
			
	}

}
