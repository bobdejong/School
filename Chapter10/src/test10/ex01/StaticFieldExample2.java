package test10.ex01;

class LimitedValue{
	final static int UPPER_LIMIT=100000;  //final static - ������ ���� ������ ��ü�������� �����ִ�.
	//static final int UPPER_LIMIT=100000; ������ �������
	int value;
	
	void setValue(int value) {
		if(value < UPPER_LIMIT) 
			this.value=value;	
		else
			this.value=UPPER_LIMIT;
		
	}
	
}


public class StaticFieldExample2 {

	public static void main(String[] args) {
		LimitedValue v=new LimitedValue();
		v.setValue(200000);
		System.out.println("v.value="+v.value);
		System.out.println("���Ѱ�="+LimitedValue.UPPER_LIMIT);
		
		

	}

}
