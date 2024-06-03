package basics3;

public class ExampleForStaticVariable {

	static int amountDeposited = 0;
	String depositedBy = "";
	
	public static void main(String[] args) {
		
        ExampleForStaticVariable ex1 = new ExampleForStaticVariable();
        ExampleForStaticVariable.amountDeposited = 1000;
        ex1.depositedBy = "Agni";
        System.out.println("Deposited By: "+ex1.depositedBy);
        System.out.println("Deposited Amount: "+amountDeposited);
        
        ExampleForStaticVariable ex2 = new ExampleForStaticVariable();
        ExampleForStaticVariable.amountDeposited = 3000;
        ex2.depositedBy = "Ram";
        System.out.println("Deposited By: "+ex2.depositedBy);
        System.out.println("Deposited Amount: "+amountDeposited);
        
        
        System.out.println("Total Balance Amount: "+amountDeposited);
	}

}
