package sec07.exam04_array_management;

public class kumhoTire extends Tire{
	
	public kumhoTire(String location, int maxRotaition) {
		super(location, maxRotaition);
		
	}
	
	@Override
	
	public boolean roll() {
		++accumulatedRotaition;
		if(accumulatedRotaition < maxRotaition) {
			System.out.println(location+"KumhoTire ����:"+(maxRotaition-accumulatedRotaition)+"ȸ");
			return true;
		}else {
			System.out.println("***"+location+"Tire ��ũ***");
			return false;
			
		}
}
}