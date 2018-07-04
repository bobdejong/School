package sec14.ex01_object;

class Circle{
	int radius;
	
	Circle(int radius){
		this.radius=radius;
		
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Circle))
			return false;
			Circle circle=(Circle)obj;
		if(radius==circle.radius)
			return true;
		else
			return false;
		
	}
	
}




public class ObjectExample6 {

	public static void main(String[] args) {
		Circle obj1=new Circle(5);
		Circle obj2=new Circle(5);
		
		
		
		if(obj1.equals(obj2))  //주소값 비교
			System.out.println("같음");
		else 
			System.out.println("다름");
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
	}

}
