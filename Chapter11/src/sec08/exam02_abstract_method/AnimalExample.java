package sec08.exam02_abstract_method;

public class AnimalExample {

	public static void main(String[] args) {
		Dog dog=new Dog();
		Cat cat=new Cat();
		
		dog.sound();
		cat.sound();
		System.out.println("----------");

		Animal animal=null;
		animal=new Dog();
		animal.sound(); //override
		animal=new Cat();
		animal.sound(); //override
		System.out.println("----------");
		
		animalSound(new Dog());
		animalSound(new Cat());
		
		new Dog().sound();
		
		
		
	}
	public static void animalSound(Dog dog) {
		dog.sound();
			}
	public static void animalSound(Cat cat) {
		cat.sound();		
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();		
	}
	
	
	
	
	
	

}
