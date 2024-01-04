package assignment.interfaceAssignment;

public abstract class bobBank implements bankInterface {

	public static void main(String[] args) {

	}

	public void depositMoney() {
		System.out.println("Bank of Baroda is depositing money");
		
	}

	public void withdrawMoney() {
		System.out.println("Bank of Baroda is withdrawing money");
		
	}



}

class bobSubClass extends bobBank
{
	public void openAccounts() {
		System.out.println("Bank of Baroda is Opening account");
		
	}
}
