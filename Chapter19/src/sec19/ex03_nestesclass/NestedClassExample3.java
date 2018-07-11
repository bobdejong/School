package sec19.ex03_nestesclass;

class PiggyBank{
	int total;
	Slot slot;
	PiggyBank(){
		total=0;
		slot=new Slot();
		
	}
	class Slot{
		void put(int amount) {
			total+=amount;
		}
	}
	
	
}


public class NestedClassExample3 {

	public static void main(String[] args) {
		PiggyBank bank1=new PiggyBank();
		PiggyBank bank2=new PiggyBank();
		PiggyBank bank3=new PiggyBank();
		bank2.slot.put(100);
		
		System.out.println("ù��° ���� ������:"+bank1.total);
		System.out.println("ù��° ���� ������:"+bank2.total);
		System.out.println("ù��° ���� ������:"+bank3.total);

	}

}
