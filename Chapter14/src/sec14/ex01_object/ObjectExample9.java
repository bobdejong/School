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
		System.out.println("Ŭ���� �̸�:"+name);
		
		Class superCls=cls.getSuperclass();
		String superName=superCls.getName();
		System.out.println("����Ŭ���� �̸�"+superName);
		
		Field field[]=cls.getDeclaredFields();
		
		for(int cnt=0;cnt<field.length;cnt++)
		System.out.println("�ʵ�:"+field[cnt]);
		
		Method method[]=cls.getDeclaredMethods();
		
		for(int cnt=0;cnt<method.length;cnt++)
			System.out.println("�޼ҵ�:"+method[cnt]);
		
		//reflection(Ŭ������ ������,�ʵ�,�޼���,������ �˾Ƴ��� ��)
		

	}

}
