package sec07.exam04_array_management;

public class HankookTire extends Tire{
	public HankookTire(String location, int maxRotaition) {
		super(location, maxRotaition);
		
	}
	
	@Override
	
	public boolean roll() {
		++accumulatedRotaition;
		if(accumulatedRotaition < maxRotaition) {
			System.out.println(location+"HankookTire ¼ö¸í:"+(maxRotaition-accumulatedRotaition)+"È¸");
			return true;
		}else {
			System.out.println("***"+location+"Tire ÆãÅ©***");
			return false;
			
		}
	}

}
