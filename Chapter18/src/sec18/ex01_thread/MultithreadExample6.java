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
	
	void transfer(int amount) {
		account1.withdraw(1000000);
		System.out.println("ÀÌ¸ù·æ °èÁÂ:100¸¸¿ø ÀÎÃâ");
		account2.deposit(1000000);
		System.out.println("¼ºÃáÇâ °èÁÂ:100¸¸¿ø ÀÔ±Ý");
	}
	int getTotal() {
		return account1.balance+account2.balance;
	}
}

public class MultithreadExample6 {

	public static void main(String[] args) {
		

	}

}
