package encryptingStrings;

public class EncryptDriver {
	
	public static void main (String[] args) {
		
		System.out.println("Your encrypted input is: " + new ApplyEncryption("apple").encryptItForMe());
		
		System.out.println("Your encrypted input is: " + new ApplyEncryption("banana").encryptItForMe());
		
		System.out.println("Your encrypted input is: " + new ApplyEncryption("karaca").encryptItForMe());
		
		System.out.println("Your encrypted input is: " + new ApplyEncryption("burak").encryptItForMe());
		
		System.out.println("Your encrypted input is: " + new ApplyEncryption("alpaca").encryptItForMe());
	}

}
