package persistence;

public class PersistenceDriver {
	
	public static void main(String[] args) {
		
		//Additive persistence test cases
		System.out.println("Testing 0 iterations Add");
		System.out.println("Additive Persistence of 6 is: " + new AdditivePersistence(6).addPersistenceValue());
		System.out.println();
		System.out.println("Testing 1 iterations Add");
		System.out.println("Additive Persistence of 312 is: " + new AdditivePersistence(312).addPersistenceValue());
		System.out.println();
		System.out.println("Testing 2 iterations Add");
		System.out.println("Additive Persistence of 237 is: " + new AdditivePersistence(237).addPersistenceValue());
		System.out.println();
		System.out.println("Testing 3 iterations Add");
		System.out.println("Additive Persistence of 1679583 is: " + new AdditivePersistence(1679583).addPersistenceValue());
		System.out.println();
		
		//Multiplicative persistence test cases
		System.out.println("Testing 0 iterations Multiply");
		System.out.println("Additive Persistence of 4 is: " + new MultiplicativePersistence(4).multiplyPersistenceValue());
		System.out.println();
		System.out.println("Testing 1 iterations Multiply");
		System.out.println("Additive Persistence of 32 is: " + new MultiplicativePersistence(32).multiplyPersistenceValue());
		System.out.println();
		System.out.println("Testing 2 iterations Multiply");
		System.out.println("Additive Persistence of 123456 is: " + new MultiplicativePersistence(123456).multiplyPersistenceValue());
		System.out.println();
		System.out.println("Testing 3 iterations Multiply");
		System.out.println("Additive Persistence of 77 is: " + new MultiplicativePersistence(77).multiplyPersistenceValue());
		System.out.println();
	}

}
