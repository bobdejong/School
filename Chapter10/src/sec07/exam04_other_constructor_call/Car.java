package sec07.exam04_other_constructor_call;

public class Car {
	String company="���� �ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	
	Car(){ //��ü ������ �����Ϸ��� �ڵ� ����(�⺻������)
		// �⺻ �����ڴ� �ݵ�� ȣ��ȴ�.
	}
	
	Car(String model){ //�����ڸ� ���ؼ� �ʵ� �ʱ�ȭ
		this(model, null,0);
			
	}
	Car(String model,String color){ //�����ڸ� ���ؼ� �ʵ� �ʱ�ȭ
		this(model, color,0);		
	}
	
	Car(String model,String color, int maxSpeed){ //�����ڸ� ���ؼ� �ʵ� �ʱ�ȭ
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
