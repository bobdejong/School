package sec19.ex03_nestesclass;



class PiggyBank1{
	int total;
	Slot1 slot;
	PiggyBank1(){
		total=0;
		slot=new Slot1();
		
	}
	class Slot1{
		void put(int amount) {
			total+=amount;
		}
	}
	
	
}

public class NestedClassExample4 {

	public static void main(String[] args) {
		PiggyBank1 bank1=new PiggyBank1();
		PiggyBank1 bank2=new PiggyBank1();
		/*PiggyBank1 bank3=new PiggyBank1();
		bank3.slot=bank1.slot;
		bank1.slot=bank2.slot;
		bank2.slot=bank3.slot;
*/		
		
		PiggyBank1.Slot1 temp=bank1.slot;
		bank1.slot=bank2.slot;
		bank2.slot=temp;
		
		bank1.slot.put(10000);
		bank2.slot.put(10);
		System.out.println("첫번째 돼지 저금통:"+bank1.total);
		System.out.println("첫번째 돼지 저금통:"+bank2.total);
		

	}

}
