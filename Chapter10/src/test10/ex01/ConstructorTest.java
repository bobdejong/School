package test10.ex01;

class Data1{
	int value;
	
	/*Data1(){ �����ڰ� �ϳ��� ��� �ڵ����� �⺻�����ڸ� ����
	
	}*/ 
	
	
}
class Data2{
	int value;
	Data2(){
		
	} 
	//���࿡ �����ڰ� �ϳ��� ������ �����Ϸ��� �⺻�����ڸ� ������ �ʴ´�.
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
