package disariumNumber;

public class DisariumNumbers {
	
	private long number;
	public boolean isDisarium;
	
	public DisariumNumbers(long number) {
		super();
		this.number = number;
		this.isDisarium = false;
	}
	
	public boolean isDisariumNumber() {
		
		String values = Long.toString(number);
		long result = 0;
		
		for(int i = 0; i < values.length(); i++) {
			result += Math.pow((values.charAt(i) - '0'),(i+1));
		}
		
		isDisarium = (result == number) ? true : false;
		
		return isDisarium;
	}

}
