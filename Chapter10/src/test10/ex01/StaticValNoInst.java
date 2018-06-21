package test10.ex01;

class InstCnt2{
	static int instNum=100;
	
	InstCnt2(){
		instNum++;
		System.out.println("인스턴스 생성"+instNum);
		
	}
	
}

public class StaticValNoInst {

	public static void main(String[] args) {
		InstCnt2.instNum-=15;
		
		System.out.println(InstCnt2.instNum);

	}

}
