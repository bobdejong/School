package sec04.exam01_overriding;

public class Computer extends Calculator {
	
	@Override  //������̼� = ����� �������̵��� �Ǿ��� Ʋ���� ǥ������
	
	double areaCircle(double r) {  //overriding
		System.out.println("computer ��ü�� areaCircle() ����");
		System.out.println(Math.PI);
		return Math.PI*r*r;
		
	}

}
