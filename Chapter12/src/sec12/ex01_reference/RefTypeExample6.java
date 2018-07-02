package sec12.ex01_reference;

public class RefTypeExample6 {

	public static void main(String[] args) {
		Account obj1=new CheckingAccount("111-22-3333333","홍길동",11111110,"4444-5555-6666-7777");
		CheckingAccount obj2=(CheckingAccount)obj1;  //자식을 부모에 대입할수 없어서 형변환 후 대입
		try {
			int amount=obj2.pay("4444-5555-6666-7777",47000);
			System.out.println("인출액"+amount);
			System.out.println("카드번호"+obj2.cardNo);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
