package test10.ex01;

class Data1{
	int value;
	
	/*Data1(){ 생성자가 하나도 없어서 자동으로 기본생성자를 생성
	
	}*/ 
	
	
}
class Data2{
	int value;
	Data2(){
		
	} 
	//만약에 생성자가 하나라도 있으면 컴파일러가 기본생성자를 만들지 않는다.
	Data2(int x){
		value=x;
		
	}
	
}


public class ConstructorTest {

	public static void main(String[] args) {
		Data1 d1=new Data1();
		Data2 d2=new Data2();
		//Data2 d2=new Data2(10);

	}

}
