package assignment.interfaceAssignment;

public abstract class boiBank implements bankInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void depositMoney() {
		System.out.println("Bank of India is depositing money");
		
	}

	public void withdrawMoney() {
		System.out.println("Bank of India is withdrawing money");
		
	}

	public void openAccounts() {
		System.out.println("Bank of India is Opening account");
		
	}

}

class boiSubClass extends boiBank
{
	
}

