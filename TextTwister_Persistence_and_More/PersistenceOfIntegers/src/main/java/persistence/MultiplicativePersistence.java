package persistence;

public class MultiplicativePersistence {
	private int nIterations;
	private long number;
	
	public MultiplicativePersistence(long number) {
		super();
		//this.val = 0;
		this.nIterations= 0;
		this.number = number;
	}
	
	public int multiplyPersistenceValue() {
		
		String sNumber = Long.toString(number);
		
		if(sNumber.length() == 1) {
			return 0;
		}
		
		while(sNumber.length() != 1) {
			
			int val = 1;
			
			for(int i = 0; i < sNumber.length(); i++) {
				val *= (sNumber.charAt(i) - '0');
				//System.out.println(val);
			}
			
			//System.out.println(val);
			sNumber = Integer.toString(val);
			nIterations++;
			
		}

		return nIterations;
	}
}
