package sec10.exam01_static_member;

class InstCnt{
	static int instNum=0;
	
	InstCnt(){
		instNum++;
		System.out.println("�ν���Ʈ ����:"+instNum);
		
	}
	
} //static���� ����� ������ ������ ����� Ŭ������ ��� �ν��Ͻ��� �����ϴ� �����̴�.




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
