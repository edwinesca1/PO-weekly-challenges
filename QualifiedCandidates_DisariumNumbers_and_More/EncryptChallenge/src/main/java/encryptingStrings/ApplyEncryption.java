package encryptingStrings;

public class ApplyEncryption {
	
	private String value;
	private String encryptedValue;
	
	public ApplyEncryption(String value) {
		super();
		this.value = value;
	}
	
	public String encryptItForMe() {
		
		StringBuilder strb = new StringBuilder();
		
		for(int i = 0; i < value.length(); i ++) {
			if(value.charAt(i) == 'a') strb.append("0");
			else if(value.charAt(i) == 'e') strb.append("1");
			else if(value.charAt(i) == 'i') strb.append("2");
			else if(value.charAt(i) == 'o') strb.append("2");
			else if(value.charAt(i) == 'u') strb.append("3");
			else strb.append(value.charAt(i));
		}
		
		strb.reverse();
		strb.append("aca");
		encryptedValue = strb.toString();

		return encryptedValue;
	}

}
