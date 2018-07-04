package sec14.ex01_object;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Rectangle{
	int width,height;
	
	Rectangle(int width, int height){
		this.width=width;
		this.height=height;
		
	}
	int getArea() {
		return width*width;
	}
	
	
}


public class ObjectExample9 {

	public static void main(String[] args) {
		Rectangle obj=new Rectangle(10,20);
		Class cls=obj.getClass();
		String name=cls.getName();
		System.out.println("클래스 이름:"+name);
		
		Class superCls=cls.getSuperclass();
		String superName=superCls.getName();
		System.out.println("슈퍼클래스 이름"+superName);
		
		Field field[]=cls.getDeclaredFields();
		
		for(int cnt=0;cnt<field.length;cnt++)
		System.out.println("필드:"+field[cnt]);
		
		Method method[]=cls.getDeclaredMethods();
		
		for(int cnt=0;cnt<method.length;cnt++)
			System.out.println("메소드:"+method[cnt]);
		
		//reflection(클래스의 생성자,필드,메서드,정보를 알아내는 것)
		

	}

}
