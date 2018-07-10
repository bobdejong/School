package sec18.ex01_thread;

class Account{
	String accountNo;
	String ownerName;
	int balance;
	
	Account(String accountNo,String ownerName,int balance){
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

class SharedArea3{
	Account account1;
	Account account2;
}

class TransferThread extends Thread{
	SharedArea3 sharedArea3;
	TransferThread(SharedArea3 area){
		sharedArea3=area;
	}
	public void run() {
		for(int cnt=0;cnt<12;cnt++) {  //µ¿±âÈ­
			synchronized(sharedArea3) {
			sharedArea3.account1.withdraw(1000000);
			System.out.println("ÀÌ¸ù·æ °èÁÂ:100¸¸¿ø ÀÎÃâ");
			sharedArea3.account2.deposit(1000000);
			System.out.println("¼ºÃáÇâ °èÁÂ:100¸¸¿ø ÀÔ±Ý");
			}
			}
	}
}

class PrintThread2 extends Thread{
	SharedArea3 sharedArea3;
	PrintThread2(SharedArea3 area){
		sharedArea3=area;
	}
	
	public void run() {
		for(int cnt=0;cnt<3;cnt++) {
			synchronized(sharedArea3) {
			int sum=sharedArea3.account1.balance+sharedArea3.account2.balance;
			System.out.println("°èÁÂ ÀÜ¾× ÇÕ°è"+sum); }
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
}

public class MultithreadExample5 {

	public static void main(String[] args) {
		SharedArea3 area=new SharedArea3();
		area.account1=new Account("111-111-1111","ÀÌ¸ù·æ",20000000);
		area.account2=new Account("222-222-2222","¼ºÃáÇâ",10000000);
		TransferThread thread1=new TransferThread(area);
		PrintThread2 thread2=new PrintThread2(area);
		thread1.start();
		thread2.start();
		
	}

}
