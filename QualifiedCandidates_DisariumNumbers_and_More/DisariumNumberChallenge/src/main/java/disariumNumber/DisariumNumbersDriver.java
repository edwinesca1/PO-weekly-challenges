package disariumNumber;

public class DisariumNumbersDriver {
	
	public static void main(String[] args) {
		
		//False
		System.out.println("is 75 a Disarium number? " + new DisariumNumbers(75).isDisariumNumber());
		
		//True
		System.out.println("is 135 a Disarium number? " + new DisariumNumbers(135).isDisariumNumber());
		
		//False
		System.out.println("is 519 a Disarium number? " + new DisariumNumbers(519).isDisariumNumber());
		
		//True
		System.out.println("is 518 a Disarium number? " + new DisariumNumbers(518).isDisariumNumber());
		
		//False
		System.out.println("is 544 a Disarium number? " + new DisariumNumbers(544).isDisariumNumber());
		
		//True
		System.out.println("is 8 a Disarium number? " + new DisariumNumbers(8).isDisariumNumber());
		
		//False
		System.out.println("is 466 a Disarium number? " + new DisariumNumbers(466).isDisariumNumber());
	}

}
