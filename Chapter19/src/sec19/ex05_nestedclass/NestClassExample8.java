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
		System.out.println("보내는 사람"+sender);
		System.out.println("받는 사람"+receiver);
		System.out.println("내용"+message);
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
		System.out.println("전화번호"+phoneNo);
		System.out.println("내용"+message);
		System.out.println("회신전화번호"+responsePhoneNo);
		System.out.println();
	}
	
}

public class NestClassExample8 {

	public static void main(String[] args) {
		//class SatelliteSender extends MessageSender{
		MessageSender obj=new MessageSender() {
			void send(String message) {
				System.out.println("발신:마이다스");
				System.out.println("수신:빌 게이츠");
				System.out.println("메시지:"+message);
				System.out.println();
				
			}
		}; //anonymous inner class(이름없는 클래스 - 마지막 괄호에 ;을 꼭 찍어줘야함)
		//SatelliteSender obj=new SatelliteSender();
		obj.send("굿모닝");
			
	}

}
