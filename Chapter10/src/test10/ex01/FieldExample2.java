package test10.ex01;

class Circle{
	double radius; //field
	
	Circle(double radius){  //�Ű�����
		this.radius=radius;
		
	}
	
	double getArea() {
		double area; //���� ����
		area=radius*radius*3.14;
		
		return area;
	}
	
}

public class FieldExample2 {

	public static void main(String[] args) {
		Circle obj=new Circle(0.0);
		obj.radius=5.0;
		double area=obj.getArea();
		System.out.println(obj.radius);
		System.out.println(obj.getArea());

	}

}
