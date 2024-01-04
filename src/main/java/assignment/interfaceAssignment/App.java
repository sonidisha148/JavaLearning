package assignment.interfaceAssignment;

public class App
{
    public static void main( String[] args )
    {
    	System.out.println("--------Functions Of Bank of India--------");
    	boiSubClass boiSubClass = new boiSubClass();
    	boiSubClass.depositMoney();
    	boiSubClass.withdrawMoney();
    	boiSubClass.openAccounts();
    	
    	System.out.println("--------Functions Of Bank of Baroda--------");
    	bobSubClass bobSubClass = new bobSubClass();
    	bobSubClass.depositMoney();
    	bobSubClass.withdrawMoney();
    	bobSubClass.openAccounts();
    	
    	
    }

	
}
