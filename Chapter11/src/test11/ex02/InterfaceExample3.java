package test11.ex02;

interface Lendable{
	final static byte STATE_BORROWED=1;  //������
	final static byte STATE_NORMAL=0; //������� ���� ����
	void checkOut(String bprrower,String date);
	void checkIn();
 
}

class SeparateVolume implements Lendable{
	String requestNo;  //û����ȣ
	String bookTitle; //����
	String writer; //����
	String borrower; //������
	String ckeckOutDate;  //������
	byte state;  //�������

	SeparateVolume(String requestNo, String bookTitle, String writer){
		this.requestNo=requestNo;
		this.bookTitle=bookTitle;
		this.writer=writer;
		
	}
	
	public void checkOut(String borrower,String date) {
		if(state != STATE_NORMAL)
			return;
		this.borrower=borrower;
		this.ckeckOutDate=date;
		this.state=STATE_BORROWED;
		System.out.println("*"+bookTitle+"��(��)����Ǿ����ϴ�.");
		System.out.println("������:"+borrower);
		System.out.println("������"+date+"\n");
		
	}
	
	public void checkIn() {  //�ݳ��Ѵ�.
		this.borrower=null;
		this.ckeckOutDate=null;
		this.state=STATE_NORMAL;
		System.out.println("*"+bookTitle+"��(��)�ݳ��Ǿ����ϴ�.");
		
	}
	
}

public class InterfaceExample3 {

	public static void main(String[] args) {
		SeparateVolume obj=new SeparateVolume("863q","����","��������");
		printState(obj);
		obj.checkOut("�̼���", "20060317");
		printState(obj);

	}
	
	public static void printState(SeparateVolume obj) {
		if(obj.state==Lendable.STATE_NORMAL) {
			System.out.println("-----------------");
			System.out.println("�������:���Ⱑ��");
			System.out.println("-----------------");
			
		}
		if(obj.state==Lendable.STATE_BORROWED) {
			System.out.println("-----------------");
			System.out.println("�������:������");
			System.out.println("������:"+obj.borrower);
			System.out.println("������:"+obj.ckeckOutDate);
			System.out.println("-----------------");
				
		}
		
		
	}
	
}
