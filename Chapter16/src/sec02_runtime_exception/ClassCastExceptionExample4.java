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
			System.out.println("가능");
			
		}else
			System.out.println("불가능");*/
		
		
		if(animal instanceof Dog) {
			Dog dog=(Dog)animal;
			System.out.println("가능");
			
		}
		Dog dog=(Dog)animal;	
		
		
		
		
		
		
		
	}

}


















