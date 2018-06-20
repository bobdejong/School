package test10.ex01;

public class ConstrExample2 {

	public static void main(String[] args) {
		SubscriberInfo obj1=new SubscriberInfo("연흥부","poorman","zebi"); 
		SubscriberInfo obj2=new SubscriberInfo("연놀부","richman","money","010-0000-0000","타워팰리스"); 
		
		/*System.out.println("이름:"+obj1.name);
		System.out.println("아이디:"+obj1.id);
		System.out.println("패스워드:"+obj1.password);
		System.out.println("전화번호:"+obj1.phoneNo);
		System.out.println("주소:"+obj1.address);
		System.out.println();
		
		
		System.out.println("이름:"+obj2.name);
		System.out.println("아이디:"+obj2.id);
		System.out.println("패스워드:"+obj2.password);
		System.out.println("전화번호:"+obj2.phoneNo);
		System.out.println("주소:"+obj2.address);
		System.out.println();*/
		
		ss(obj1);
		ss(obj2);
		
	}

	public static void ss(SubscriberInfo dd) {
		System.out.println("이름:"+dd.name);
		System.out.println("아이디:"+dd.id);
		System.out.println("패스워드:"+dd.password);
		System.out.println("전화번호:"+dd.phoneNo);
		System.out.println("주소:"+dd.address);
		System.out.println();
		
		
	}
	
	
	
	
}
