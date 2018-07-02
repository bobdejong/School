package test11.ex02;

interface Lendable{
	final static byte STATE_BORROWED=1;  //대출중
	final static byte STATE_NORMAL=0; //대출되지 않은 상태
	void checkOut(String bprrower,String date);
	void checkIn();
 
}

class SeparateVolume implements Lendable{
	String requestNo;  //청구번호
	String bookTitle; //제목
	String writer; //저자
	String borrower; //대출인
	String ckeckOutDate;  //대출일
	byte state;  //대출상태

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
		System.out.println("*"+bookTitle+"이(가)대출되었습니다.");
		System.out.println("대출인:"+borrower);
		System.out.println("대출일"+date+"\n");
		
	}
	
	public void checkIn() {  //반납한다.
		this.borrower=null;
		this.ckeckOutDate=null;
		this.state=STATE_NORMAL;
		System.out.println("*"+bookTitle+"이(가)반납되었습니다.");
		
	}
	
}

public class InterfaceExample3 {

	public static void main(String[] args) {
		SeparateVolume obj=new SeparateVolume("863q","나무","베르베르");
		printState(obj);
		obj.checkOut("이수경", "20060317");
		printState(obj);

	}
	
	public static void printState(SeparateVolume obj) {
		if(obj.state==Lendable.STATE_NORMAL) {
			System.out.println("-----------------");
			System.out.println("대출상태:대출가능");
			System.out.println("-----------------");
			
		}
		if(obj.state==Lendable.STATE_BORROWED) {
			System.out.println("-----------------");
			System.out.println("대출상태:대출중");
			System.out.println("대출인:"+obj.borrower);
			System.out.println("대출일:"+obj.ckeckOutDate);
			System.out.println("-----------------");
				
		}
		
		
	}
	
}
