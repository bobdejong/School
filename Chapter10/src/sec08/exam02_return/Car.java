package sec08.exam02_return;

public class Car {
	int gas;
	
	void setGas(int gas) {
		this.gas=gas;
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("Gas�� �����ϴ�.");
			return false; //return �޼ҵ� ����
			
		}
		System.out.println("gas�� �ս��ϴ�.");
		return true;
		
	}
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("�޸��ϴ�.(gas�ܷ�:"+gas+")");
				gas-=1;
				
			}else {
				System.out.println("����ϴ�.(gas�ܷ�:"+gas+")");
				return;
				
			}
			
			
			
		}
		
		
		
	}
	
	
	
	
	
	
	
	
}
