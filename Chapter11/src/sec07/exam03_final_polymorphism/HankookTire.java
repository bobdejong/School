package sec07.exam03_final_polymorphism;

public class HankookTire extends Tire{
	public HankookTire(String location, int maxRotaition) {
		super(location, maxRotaition);
		
	}
	
	@Override
	
	public boolean roll() {
		++accumulatedRotaition;
		if(accumulatedRotaition < maxRotaition) {
			System.out.println(location+"HankookTire ����:"+(maxRotaition-accumulatedRotaition)+"ȸ");
			return true;
		}else {
			System.out.println("***"+location+"Tire ��ũ***");
			return false;
			
		}
	}

}
