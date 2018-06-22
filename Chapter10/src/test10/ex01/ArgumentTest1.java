package test10.ex01;

class Argument{

public void change(int i, int j[],StringBuffer sb) {    //i는 스택에 새로 생성된 값 메인에 있는 i와 다름 , j와 sb는 주소값이 넘어옴
																							    //메인에 있는 j와sb와 같음
	i=210;
	j[3]=400;
	sb.append("화이팅 자바!!!"); //문자열 뒤에 문자열 추가
	
	
}

public void display(int i,int j[],StringBuffer sb) {
	System.out.println("객체 변수 i의 값:"+i);
	System.out.print("배열의 값:");
	for(int index=0;index<j.length;index++) 
		System.out.print(j[index]+" ");
		System.out.println();
		System.out.println("문자열 sb값"+sb);
		
	
	
	}
}

public class ArgumentTest1 {

	
	
	public static void main(String[] args) {
		Argument d=new Argument();
		int a=10;
		int b[]= {1,2,3,4};  
		StringBuffer c=new StringBuffer("배우기 쉽죠?");
		System.out.println("첫번째 display()메소드 호출");
		d.display(a, b, c); //인자값 
		d.change(a, b, c);  //a:call by value         call by adress: b=배열의 주소값이 넘어감 c=주소값이 넘어감
		d.change(a, b, c);
		
		System.out.println("===============================");
		System.out.println("값을 변환한 다음 두번째 display()를 호출");
		d.display(a, b, c);
		
		
		
		
		
		
		
		
		
		
		
	}

}
