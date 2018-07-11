package sec18.ex01_thread;

class Account2{
	String accountNo;
	String ownerName;
	int balance;
	
	Account2(String accountNo,String ownerName,int balance){
		this.accountNo=accountNo;
		this.ownerName=ownerName;
		this.balance=balance;
	}
	void deposit(int amount) {
		balance+=amount;
	}
	int withdraw(int amount) {
		if(balance<amount)
			return 0;
		balance-=amount;
		return amount;
	}
		
}

class SharedArea4{
	Account2 account1;
	Account2 account2;
	
	synchronized void transfer() {
		//synchronized(this) {
		account1.withdraw(1000000);
		System.out.println("ÀÌ¸ù·æ °èÁÂ:100¸¸¿ø ÀÎÃâ");
		account2.deposit(1000000);
		System.out.println("¼ºÃáÇâ °èÁÂ:100¸¸¿ø ÀÔ±Ý");
	//}
	}
	
	synchronized int getTotal() {
		//synchronized(this) {
		return account1.balance+account2.balance;
	//}
	}
}

public class MultithreadExample6 {

	public static void main(String[] args) {
		
		SharedArea4 area=new SharedArea4();
		area.account1=new Account2("111-111-1111","ÀÌ¸ù·æ",20000000);
		area.account2=new Account2("222-222-2222","¼ºÃáÇâ",10000000);
		TransferThread2 thread1=new TransferThread2(area);
		PrintThread5 thread2=new PrintThread5(area);
		thread1.start();
		thread2.start();
		 
	}

}
class TransferThread2 extends Thread{
	SharedArea4 sharedArea4;
	TransferThread2(SharedArea4 area){
		sharedArea4=area;
	}
	public void run() {
		for(int cnt=0;cnt<12;cnt++) {
			sharedArea4.transfer();
	}
	}
}

class PrintThread5 extends Thread{
	SharedArea4 sharedArea4;
	PrintThread5(SharedArea4 area){
		sharedArea4=area;
	}
	public void run() {
		for(int cnt=0;cnt<3;cnt++) {
			int sum=sharedArea4.getTotal();
			System.out.println("°èÁÂ ÀÜ¾× ÇÕ°è:"+sum);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
}













