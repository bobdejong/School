package sec07.exam04_other_constructor_call;

public class Car {
	String company="현대 자동차";
	String model;
	String color;
	int maxSpeed;
	
	
	Car(){ //객체 생성시 컴파일러가 자동 생성(기본생성자)
		// 기본 생성자는 반드시 호출된다.
	}
	
	Car(String model){ //생성자를 통해서 필드 초기화
		this(model, null,0);
			
	}
	Car(String model,String color){ //생성자를 통해서 필드 초기화
		this(model, color,0);		
	}
	
	Car(String model,String color, int maxSpeed){ //생성자를 통해서 필드 초기화
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
