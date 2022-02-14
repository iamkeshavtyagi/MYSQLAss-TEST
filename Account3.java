class Bank {
	int getBalance() {
		return 0;
	}
}
class BankA extends Bank{
	int getBalance(int balance) {
		return balance;
	}
}
class BankB extends Bank{
	int getBalance(int balance) {
		return balance;
	}
}
class BankC extends Bank{
	int getBalance(int balance) {
		return balance;
	}
}

public class Account3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankA obj1 = new BankA();
		BankB obj2 = new BankB();
		BankC obj3 = new BankC();
		
		System.out.println("$" +obj1.getBalance(1000));

		System.out.println("$" +obj2.getBalance(1500));

		System.out.println("$" +obj3.getBalance(2000));
		
	}

}
