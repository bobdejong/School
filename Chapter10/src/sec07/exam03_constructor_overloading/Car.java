package sec07.exam03_constructor_overloading;

public class Car {
	String company="���� �ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	
	Car(){ //��ü ������ �����Ϸ��� �ڵ� ����(�⺻������)
		// �⺻ �����ڴ� �ݵ�� ȣ��ȴ�.
		//�����ڴ� Ŭ���� �̸��� ����. ��ȯ �ڷ����� ����.
	}
	
	Car(String model){ //�����ڸ� ���ؼ� �ʵ� �ʱ�ȭ
		this.model=model;
			
	}
	Car(String model,String color){ //�����ڸ� ���ؼ� �ʵ� �ʱ�ȭ
		this.model=model;
		this.color=color;
		
	}
	Car(String model,String color, int maxSpeed){ //�����ڸ� ���ؼ� �ʵ� �ʱ�ȭ
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
	
	
}
