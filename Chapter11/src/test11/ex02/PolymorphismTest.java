package test11.ex02;

class Cat {

	public String toString() {
		return "�߿�";
	}
}
	class Dog {

		public String toString() {
			return "�۸�";
		}
	}

	public class PolymorphismTest {

	public static void main(String[] args) {
		Object[] obj=new Object[] {new Cat(),new Dog()};
		
		for(Object o:obj) {
			System.out.println(o);
			System.out.println(o.getClass()+"="+o);
		}
		
		//Cat[] obj=new Cat[] {new Cat(),new Dog()};
		//Object[] obj=new Object[] {new Cat(),new Dog()};
		
	}

}
