package test10.ex01;

class Avg{
	String name;
	int avg;
	
	
	
	public String average(int a,int b) {
		
		avg=(a+b)/2;
		  
		return name+avg;
		
	}
	
	//����� ���ϴ� �޼ҵ�
	
	
}

public class AvgTest {
	
	public static void main(String[] args) {
		Avg student1=new Avg();
		Avg student2=new Avg();
		
		//��ü
		student1.name="��ö��";
		student2.name="�迵��";
		//�̸�
		String st1_avg=student1.average(70,80);
		String st2_avg=student2.average(80,90);
		
		
		System.out.println(st1_avg); //��ö��75
		System.out.println(st2_avg); //�迵��85
	}
	
	
}
