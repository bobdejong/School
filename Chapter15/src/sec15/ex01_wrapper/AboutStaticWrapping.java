package sec15.ex01_wrapper;

public class AboutStaticWrapping {

	public static void main(String[] args) {
		Integer iValue1=Integer.valueOf(10);
		Integer iValue2=Integer.valueOf(10);
		
		if(iValue1==iValue2)  //객체를 두개를 만들지 않고 하나만 만들었다. 같은 값을 주면 또다른 객체를 만들지 않는다.
			System.out.println("iValue1과 iValue2는 동일 인스턴트 참조");
		else
			System.out.println("iValue1과 ivalue2는 다른 인스턴트 참조");
		
		//객체 ==인스턴트
	}

}
