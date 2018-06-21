package sec10.exam01_static_member;

class InstCnt{
	static int instNum=0;
	
	InstCnt(){
		instNum++;
		System.out.println("인스턴트 생성:"+instNum);
		
	}
	
} //static으로 선언된 변수는 변수가 선언된 클래스의 모든 인스턴스가 공유하는 변수이다.




public class ClassVar {

	public static void main(String[] args) {
		InstCnt cnt1=new InstCnt();
		InstCnt cnt2=new InstCnt();
		InstCnt cnt3=new InstCnt();
		
		System.out.println(cnt1.instNum);
		System.out.println(cnt2.instNum);
		System.out.println(cnt3.instNum);
		
		InstCnt.instNum=100;
		System.out.println(InstCnt.instNum);

	}

}
