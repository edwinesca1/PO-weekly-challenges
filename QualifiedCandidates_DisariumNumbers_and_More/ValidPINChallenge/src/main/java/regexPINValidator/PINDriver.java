package regexPINValidator;

public class PINDriver {
	
	public static void main (String[] args) {
		
		//True
		System.out.println("Is your PIN valid? " + new RegexValidator("121317").isValidPIN());
		
		//True
		System.out.println("Is your PIN valid? " + new RegexValidator("1234").isValidPIN());
		
		//False
		System.out.println("Is your PIN valid? " + new RegexValidator("45135").isValidPIN());
		
		//False
		System.out.println("Is your PIN valid? " + new RegexValidator("89abc1").isValidPIN());
		
		//True
		System.out.println("Is your PIN valid? " + new RegexValidator("900876").isValidPIN());
		
		//False
		System.out.println("Is your PIN valid? " + new RegexValidator(" 4983").isValidPIN());
		
		//False
		System.out.println("Is your PIN valid? " + new RegexValidator("").isValidPIN());
	}

}
