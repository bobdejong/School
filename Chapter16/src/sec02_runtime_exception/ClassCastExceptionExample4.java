package sec02_runtime_exception;

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}

public class ClassCastExceptionExample4 {

	public static void main(String[] args) {
		Dog dog=new Dog();
		changeDog(dog);
		
		Cat cat=new Cat();
		changeDog(cat);
		

	}
	
	public static void changeDog(Animal animal) {
		/*if(animal instanceof Dog) {
			Dog dog=(Dog)animal;
			System.out.println("����");
			
		}else
			System.out.println("�Ұ���");*/
		
		
		if(animal instanceof Dog) {
			Dog dog=(Dog)animal;
			System.out.println("����");
			
		}
		Dog dog=(Dog)animal;	
		
		
		
		
		
		
		
	}

}


















